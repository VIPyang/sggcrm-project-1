<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/commons/common.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<title>销售机会管理</title>
	<script type="text/javascript">
		$(function(){
		//新建的 JS 代码. 
			$("#new").click(function(){
				window.location.href="${ctp}" + "/chance/input?currentUser=${sessionScope.current_user.id}";
				return false;
			});
			
			//删除的 JS 代码
			$(".delete").click(function(){
				var custName = $(this).next(":hidden").val();
				var flag = confirm("确定要删除" + custName + "的信息吗?");
				var $form = $("#hiddenForm");
				alert($form);
				var id = $(this).prev(":hidden").val();
				$("#_method").val("DELETE");
				$form.attr("action", "${ctp}/chance/" + id).submit();
				return false;
			});
		});
	</script>
</head>

<body class="main">
	
	<form action="" method="POST" id="hiddenForm">
		<input type="hidden" name="_method" value="" id="_method"/> 
	</form>
	
	<form:form action="${ctp }/chance/list" method="post">
		<div class="page_title">
			销售机会管理
		</div>
		<div class="button_bar">
			<button class="common_button" id="new">
				新建
			</button>
			<button class="common_button" onclick="document.forms[0].submit();">
				查询
			</button>
		</div>
		<table class="query_form_table" border="0" cellPadding="3"
			cellSpacing="0">
			<tr>
				<th class="input_title">
					客户名称
				</th>
				<td class="input_content">
					<input type="text" name="map['custname']" value=""/>
				</td>
				<th class="input_title">
					概要
				</th>
				<td class="input_content">
					<input type="text" name="map['title']" value=""/>
				</td>
				<th class="input_title">
					联系人
				</th>
				<td class="input_content">
					<input type="text" name="map['contact']" value=""/>
				</td>
			</tr>
		</table>
	</form:form>
		<!-- 列表数据 -->
		<br />
		
		<c:if test="${requestScope.dataResult != null && requestScope.dataResult.total > 0 }">
			<table class="data_list_table" border="0" cellPadding="3"
				cellSpacing="0">
				<tr>
					<th>
						编号
					</th>
					<th>
						客户名称
					</th>
					<th>
						概要
					</th>
					<th>
						联系人
					</th>
					<th>
						联系人电话
					</th>
					<th>
						创建时间
					</th>
					<th>
						操作
					</th>
				</tr>
				<c:forEach var="chance" items="${requestScope.dataResult.rows }">
					<tr>
						<td class="list_data_number">${chance.id}</td>
						<td class="list_data_text">${chance.custName}</td>
						<td class="list_data_text">${chance.title}</td>
						<td class="list_data_text">${chance.contact}</td>
						<td class="list_data_text">${chance.contactTel}</td>
						<td class="list_data_text">
							<fmt:formatDate value="${chance.createDate }" pattern="yyyy-MM-dd"/>
						</td>
						<td class="list_data_op">
							<img onclick="window.location.href='${ctp }/chance/dispatch?id=${chance.id}'" 
								title="指派" src="${ctp }/static/images/bt_linkman.gif" class="op_button" />
							<img onclick="window.location.href='${ctp }/chance/create?id=${chance.id}'" 
								title="编辑" src="${ctp }/static/images/bt_edit.gif"
								class="op_button" />
							<input type="hidden" value="${chance.id }"/>
							<img title="删除" src="${ctp}/static/images/bt_del.gif" class="delete" />
							<input type="hidden" value="${chance.custName }"/>
						</td>
					</tr>
				</c:forEach>	
			</table>
			<tags:pagination page="${page}" paginationSize="5"/>
		</c:if>
		<c:if test="${requestScope.dataResult == null || requestScope.dataResult.total == 0 }">
			没有任何数据
		</c:if>
		<!-- Page{pageNum=1, pageSize=2, startRow=0, endRow=2, total=9, pages=5} -->
		<div style="text-align:right; padding:6px 6px 0 0;">

			共 ${requestScope.dataResult.total } 条记录 
			&nbsp;&nbsp;
			
			当前第 ${requestScope.dataResult.pageNum }页/共 ${requestScope.dataResult.pages } 页
			&nbsp;&nbsp;
			
			<c:if test="${requestScope.dataResult.hasPrevious() }">
				<a href="${ctp }/chance/list?pageNo=1">首页</a>
				&nbsp;&nbsp;
				<a href="${ctp }/chance/list?pageNo=${requestScope.dataResult.pageNum - 1 }">上一页</a>
				&nbsp;&nbsp;
			</c:if>
			
			<c:if test="${requestScope.dataResult.hasNext() }">
				<a href="${ctp }/chance/list?pageNo=${requestScope.dataResult.next }">下一页</a>
				&nbsp;&nbsp;
				<a href="${ctp }/chance/list?pageNo=${requestScope.dataResult.pages }">末页</a>
				&nbsp;&nbsp;
			</c:if>
			
			转到 <input id="pageNo" size='1'/> 页
			&nbsp;&nbsp;
		
		</div>

<script type="text/javascript">

	$(function(){
		$("#pageNo").change(function(){
			
			var pageNo = $(this).val();
			var reg = /^\d+$/;
			if(!reg.test(pageNo)){
				$(this).val("");
				alert("输入的页码不合法");
				return;
			}
			
			var pageNo2 = parseInt(pageNo);
			if((pageNo2 < 1) || pageNo2 > parseInt("${page.totalPages }")){
				$(this).val("");
				alert("输入的页码不合法");
				return;
			}
			
			//查询条件需要放入到 class='condition' 的隐藏域中. 
			window.location.href = window.location.pathname + "?pageNo=" + pageNo2;
		});
	})
</script>
	
</body>
</html>
