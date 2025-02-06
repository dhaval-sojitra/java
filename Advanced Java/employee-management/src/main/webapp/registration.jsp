<%@ include file="/content.jsp"%>
<title>Registration</title>
<div class="login">
	<div class="card shadow-lg">
		<div class="d-flex flex-column align-items-center">
			<h3 class="textbox title">Register Employee</h3>
			<form action="InsertData" method="post" name="employeeForm"
				onsubmit="return checkForm(); return false;"
				class="container-fluid input-wrapper">
				<input type="hidden" name="formtype" value="registration"/>
				<span class="text-danger">${nullError }</span>
				<div>
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
						value="${phone }" maxlength="10" placeholder="Enter phone number"
						required /> <span id="spanphone" class="text-danger"></span>
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
						placeholder="Enter Address" required>${address }</textarea>
					<span id="spanaddress" class="text-danger"></span>

				</div>
				<div>
					<label for="password" class="form-label required">Password</label>
					<input type="password" class="form-control" name="password"
						placeholder="Enter Password" id="password" required /> <span
						id="spanpassword" class="text-danger"></span>
				</div>
				<input type="submit" class="form-control btn btn-primary"
					value="Register" />
			</form>
		</div>
	</div>
</div>
<script type="text/javascript">
	
<%@ include file="/js/script.js"%>
	
</script>
