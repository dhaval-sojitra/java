<%@ include file="/content.jsp"%>
<title>Profile</title>
<div class="login">
	<div class="shadow-lg card-profile">
		<div class="d-flex justify-content-between title-profile">
			<h3 class="d-inline">Welcome ${name }</h3>
			<h1 class="d-inline-block ">IGNEK</h1>
		</div>
		<hr>
		<div class="d-flex justify-content-end button-update">
			<a class="btn btn-primary" href="UserDataServlet">Update</a>
		</div>
		<div class="d-flex flex-column align-items-center">
			<p class="fields">Name</p>
			<p class="form-control fields-value">${name }</p>
			<p class="fields">Email</p>
			<p class="form-control fields-value">${email }</p>
			<p class="fields">Phone</p>
			<p class="form-control fields-value">${phone }</p>
			<p class="fields">Birthdate</p>
			<p class="form-control fields-value">${birthdate }</p>
			<p class="fields">Address</p>
			<p class="form-control fields-value">${address }</p>
			<a href="LogoutServlet" class="logout"
				onclick="return logoutUser(); return false;">Logout</a>
		</div>
	</div>
</div>
<script type="text/javascript">	
<%@ include file="/js/script.js"%>
</script>
