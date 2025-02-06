<%@ include file="/content.jsp"%>
<title>Update</title>
<div class="login">
	<div class="card shadow-lg">
		<div class="d-flex justify-content-between title-update">
			<h3 class="d-inline">Welcome ${name }</h3>
			<h1 class=" d-inline-block">IGNEK</h1>
		</div>
		<form action="InsertData" method="post" name="employeeForm"
			onsubmit="return checkForm(); return false;"
			class="container-fluid input-wrapper">
			<input type="hidden" name="formtype" value="update"/>
			<div>
			 <span class="text-danger">${nullError }</span>
				<p class="text-danger welcome"></p>
				<label for="name" class="form-label required">Full name</label> <input
					type="text" class="form-control" name="name" id="name"
					value="${name }" placeholder="Enter full name" required /> <span
					id="spanname" class="text-danger"></span>

			</div>
			<div>
				<label for="email" class="form-label required">Email</label> <input
					type="email" class="form-control" name="email" id="email"
					value="${email }" placeholder="Enter email address" required /> <span
					id="spanemail" class="text-danger">${emailError }</span>
			</div>
			<div>
				<label for="phone" class="form-label required">Phone</label> <input
					type="number" class="form-control" name="phone" id="phone"
					value="${phone }" placeholder="Enter phone number" required /> <span
					id="spanphone" class="text-danger"></span>
			</div>
			<div>
					<label for="dateofbirth" class="form-label required">Birth
						Date</label> <input type="date" class="form-control" id="birthDate"
						value="${birthdate }" name="dateofbirth" required /> <span
						id="spanphone" class="text-danger"></span>
				</div>
			<div>
				<label for="address" class="form-label required">Address</label>
				<textarea class="form-control" name="address" id="address" rows="3"
					placeholder="Enter phone Address" required>${address }</textarea>
				<span id="spanaddress" class="text-danger"></span>

			</div>

			<div class="d-flex justify-content-center">
				<input type="submit" class="form-control btn btn-primary"
					value="Update" />
			</div>
			<a href="DeleteServlet" class="text-danger text-center d-block"
				onclick="return deleteAccount(); return false;"> Delete an
				account</a>
		</form>
	</div>
</div>
<script type="text/javascript">
	
<%@ include file="/js/script.js"%>
	
</script>
