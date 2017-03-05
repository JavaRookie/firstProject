<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html style="overflow-y:hidden;">
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<LINK rel="Bookmark" href="${path}/all/favicon.ico" >
<LINK rel="Shortcut Icon" href="${path}/all/favicon.ico" />
<link href="${path}/all/css/H-ui.css" rel="stylesheet" type="text/css" />
<link href="${path}/all/css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<link type="text/css" rel="stylesheet" href="${path}/all/font/font-awesome.min.css"/>
<link rel="stylesheet" type="text/css" href="${path}/jquery-easyui-1.3.3/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${path}/jquery-easyui-1.3.3/themes/icon.css">
<link href="${path}/css/main.css" rel="stylesheet" type="text/css">
<title>后台系统管理界面</title>
</head>
<body style="overflow:hidden">
<header class="Hui-header cl"> <a class="Hui-logo l" title="H-ui.admin v2.1" href="/">后台管理系统</a><div style="width:700px;display:inline-block;"></div> <span class="c-white">欢迎管理员：<img class="xwcms" src="${User.imgUrl}" alt="无头像" style="display: inline-block;width:40px;height:40px;border-radius: 50%;"/><span class="c-white" style="color:red;"> ${User.name}</span></span> <a class="btn btn-danger radius ml-10" href="javascript:check()" title="退出"><i class="icon-off"></i>安全退出</a></span> <a aria-hidden="false" class="Hui-nav-toggle" id="nav-toggle" href="#"></a><font color="white" id="today"></font> </header>
<div class="cl Hui-main">
  <aside class="Hui-aside" style="">
    <input runat="server" id="divScrollValue" type="hidden" value="" />
    <div class="menu_dropdown bk_2">
      <dl id="menu-user">
        <dt><i class="icon-user"></i> 常用操作<b></b></dt>
        <dd>
          <ul>
            <li><a _href="consumer_showConsumer" href="javascript:;">用户管理</a></li>
            <li><a _href="user-list-del.html" href="javascript:;">删除的用户</a></li>
          </ul>
        </dd>
      </dl>
      <dl id="menu-comments">
        <dt><i class="icon-comments"></i> 评论管理<b></b></dt>
        <dd>
          <ul>
            <li><a _href="${path}/all/consumerlist.jsp" href="javascript:;">评论列表</a></li>
            <li><a _href="feedback-list.html" href="javascript:void(0)">意见反馈</a></li>
          </ul>
        </dd>
      </dl>
      <dl id="menu-article">
        <dt><i class="icon-edit"></i> 资讯管理<b></b></dt>
        <dd>
          <ul>
            <li><a _href="article-class.html" href="javascript:void(0)">分类管理</a></li>
            <li><a _href="article-list.html" href="javascript:void(0)">资讯管理</a></li>
          </ul>
        </dd>
      </dl>
      <dl id="menu-picture">
        <dt><i class="icon-picture"></i> 图片库<b></b></dt>
        <dd>
          <ul>
            <li><a _href="article-class.html" href="javascript:void(0)">分类管理</a></li>
            <li><a _href="picture-list.html" href="javascript:void(0)">图片管理</a></li>
          </ul>
        </dd>
      </dl>
      <dl id="menu-product">
        <dt><i class="icon-beaker"></i> 产品库<b></b></dt>
        <dd>
          <ul>
            <li><a _href="product-brand.html" href="javascript:void(0)">品牌管理</a></li>
            <li><a _href="article-class.html" href="javascript:void(0)">分类管理</a></li>
            <li><a _href="product-list.html" href="javascript:void(0)">产品管理</a></li>
          </ul>
        </dd>
      </dl>
      <dl id="menu-page">
        <dt><i class="icon-paste"></i> 页面管理<b></b></dt>
        <dd>
          <ul>
            <li><a _href="page-home.html" href="javascript:void(0)">首页管理</a></li>
            <li><a _href="page-flink.html" href="javascript:void(0)">友情链接</a></li>
          </ul>
        </dd>
      </dl>
      <dl id="menu-order">
        <dt><i class="icon-credit-card"></i> 财务管理<b></b></dt>
        <dd>
          <ul>
            <li><a _href="order-list.html" href="javascript:void(0)">订单列表</a></li>
            <li><a _href="order-list.html" href="javascript:void(0)">充值管理</a></li>
            <li><a _href="order-list.html" href="javascript:void(0)">发票管理</a></li>
          </ul>
        </dd>
      </dl>
      <dl id="menu-tongji">
        <dt><i class="icon-bar-chart"></i> 系统统计<b></b></dt>
        <dd>
          <ul>
            <li><a _href="codeing.html" href="javascript:void(0)">统计列表</a></li>
          </ul>
        </dd>
      </dl>
      <dl id="menu-admin">
        <dt><i class="icon-key"></i> 管理员管理<b></b></dt>
        <dd>
          <ul>
            <li><a _href="admin-role.html" href="javascript:void(0)">角色管理</a></li>
            <li><a _href="admin-permission.html" href="javascript:void(0)">权限管理</a></li>
            <li><a _href="admin-list.html" href="javascript:void(0)">管理员列表</a></li>
          </ul>
        </dd>
      </dl>
      <dl id="menu-system">
        <dt><i class="icon-cogs"></i> 系统管理<b></b></dt>
        <dd>
          <ul>
            <li><a _href="system-base.html" href="javascript:void(0)">基本设置</a></li>
            <li><a _href="system-lanmu.html" href="javascript:void(0)">栏目设置</a></li>
            <li><a _href="system-data.html" href="javascript:void(0)">数据字典</a></li>
            <li><a _href="system-shielding.html" href="javascript:void(0)">屏蔽词</a></li>
            <li><a _href="system-log.html" href="javascript:void(0)">系统日志</a></li>
          </ul>
        </dd>
      </dl>
    </div>
  </aside>
  <div class="dislpayArrow"><a class="pngfix" href="javascript:void(0);"></a></div>
  <section class="Hui-article">
    <div id="Hui-tabNav" class="Hui-tabNav">
      <div class="Hui-tabNav-wp">
        <ul id="min_title_list" class="acrossTab cl">
          <li class="active"><span title="首页" data-href="${path}/all/welcome.jsp">首页</span><em></em></li>
        </ul>
      </div>
      <div class="Hui-tabNav-more btn-group"><a id="js-tabNav-prev" class="btn radius btn-default btn-small" href="javascript:;"><i class="icon-step-backward"></i></a><a id="js-tabNav-next" class="btn radius btn-default btn-small" href="javascript:;"><i class="icon-step-forward"></i></a></div>
    </div>
    <div id="iframe_box" class="Hui-articlebox">
      <div class="show_iframe">
        <div style="display:none" class="loading"></div>
        <iframe scrolling="yes" frameborder="0" src="${path}/all/welcome.jsp"></iframe>
      </div>
    </div>
  </section>
</div>
<script type="text/javascript" src="${path}/jquery-easyui-1.3.3/jquery.min.js"></script>
<script type="text/javascript" src="${path}/jquery-easyui-1.3.3/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${path}/jquery-easyui-1.3.3/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="${path}/all/js/Validform_v5.3.2_min.js"></script> 
<script type="text/javascript" src="${path}/all/layer/layer.min.js"></script>
<script type="text/javascript" src="${path}/all/js/H-ui.js"></script>
<script type="text/javascript" src="${path}/all/js/H-ui.admin.js"></script>
<script type="text/javascript" src="${path}/js/main.js"></script>

</body>
</html>