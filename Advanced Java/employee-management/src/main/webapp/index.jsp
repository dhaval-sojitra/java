<%@ include file="/content.jsp"%>
<title>Login</title>
<div class="login">
	<div class="card shadow-lg">
		<div class="card-body">
			<%
			if (request.getAttribute("loginError") != null) {
			%>
			<p class="text-danger welcome">*Incorrect Email or
				Password.Please try again</p>
			<%
			}
			%>
			<div class="welcome">
				<h3>welcome to</h3>
				<h2 class="text-primary">IGNEK</h2>
			</div>
			<form action="LoginServlet" method="post">
				<div class="input-wrapper">
					<div class="input-group">
						<input type="email" class="form-control rounded" name="email"
							value="${email }" placeholder="Enter Email" required>
					</div>
					<div class="input-group">
						<input type="password" class="form-control rounded"
							name="password" placeholder="Enter Password" required>
					</div>
				</div>
				<div class="card-body">
					<div class="d-flex justify-content-around">
						<div class="form-check checkbox">
							<input class="form-check-input" type="checkbox" id="check1"
								name="remember" value="rememberme" checked> <label
								class="form-check-label ">Remember me</label>
						</div>
						<a href="#" class="">Forgot Password?</a>
					</div>
					<div class="d-flex justify-content-center">
						<button type="submit"
							class="btn shadow bg-primary text-white btn-login rounded">Login</button>
					</div>
					<div class=" d-flex justify-content-center">
						<p>Don't have an account?</p>
						<a href="InsertData?formtype=registration" class="">&nbsp;Register</a>
					</div>
				</div>
			</form>
		</div>
	</div>
</div>
