package com.lkw.util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 验证码
 */
public class Yzm extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 11L;

	// 宽
	private int width =120;
	
	// 高
	private int height =30;
	
	private String mes ="";
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// 设置响应头中的格式
		response.setContentType("image/jpeg");
		
		
		// 创建 画布
		BufferedImage bufferedImage = new  BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		
		// 获取画笔
		Graphics graphics = bufferedImage.getGraphics();
		
		// 画背景
		drawBackgroundColor(graphics);
		
		//画边框
		drawBorder(graphics);
		
		// 画内容
		String mec =drawContent(graphics);
		request.getSession().setAttribute("yzm", mec);
		
		//画干扰线
		drawGanRaoLine(graphics);
		
		ImageIO.write(bufferedImage, "jpg", response.getOutputStream());
		
	
	}




	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	
	@Override
	public void init() throws ServletException {
		//初始化
		// TODO Auto-generated method stub
		super.init();
		mes = getInitParameter("content");
	}




	/**
	 * 画边框
	 * @param graphics
	 */
	private void  drawBorder(Graphics graphics){
		
		// 設置顔色
		graphics.setColor(Color.BLACK);
		
		// 画
		graphics.drawRect(0, 0, width-2, height-2);
		
		
	}
	
	/**
	 * 画背景
	 * @param graphics
	 */
	private void  drawBackgroundColor(Graphics graphics){
		
		// 設置顔色
		graphics.setColor(Color.white);
		
		// 画
		graphics.fillRect(0, 0, width, height);
		
		
	}

	/**
	 * 画内容
	 * @param graphics
	 */
	private String drawContent(Graphics graphics) {

		int x =5;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i <4; i++) {
			
			graphics.setFont(new Font("微软雅黑", Font.BOLD, 20));
			
			graphics.setColor(getRandomColor());
			
			// 获取单个字符
			String c = mes.charAt((int)(Math.random()*mes.length()))+"";
			sb.append(c);
			graphics.drawString(c, x, 20);
			x+=25;
			
		}
		return sb.toString();
		
		
	}
	
	
	/**
	 * 随机颜色
	 * @return
	 */
	private Color getRandomColor(){
		
		int r = (int)(Math.random()*256);
		int g = (int)(Math.random()*256);
		int b= (int)(Math.random()*256);
		Color c = new  Color(r, g, b);
		return c;
		
	}
	
	/**
	 * 干扰线
	 * @param graphics
	 */
	private void drawGanRaoLine(Graphics graphics) {

		// 先画4条
		for (int i = 0; i <4; i++) {
			graphics.setColor(getRandomColor());
			int x1=(int)(Math.random()*width),y1=(int)(Math.random()*height);
			int x2=(int)(Math.random()*width),y2=(int)(Math.random()*height);
			
			graphics.drawLine(x1, y1, x2, y2);
			
		}
		
		for (int i = 0; i <80; i++) {
			int x1=(int)(Math.random()*width),y1=(int)(Math.random()*height);
//			graphics.drawLine(x1, y1, x1, y1);
			graphics.fillOval(x1, y1, 2, 2);
		}
		
		
		
	}

	

}
