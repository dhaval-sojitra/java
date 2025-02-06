let currentDate = new Date();
let formattedDate = currentDate.toISOString().split('T')[0];
document.getElementById("birthDate").setAttribute("max", formattedDate);

function checkForm() {
	var name = document.getElementById('name').value;
	var phone = document.getElementById("phone").value;
	var password = document.getElementById("password");
	var email = document.getElementById("email").value;
	var address = document.getElementById("address").value;

	var elements = document.getElementsByClassName('text-danger');
	for (let i = 0; i < elements.length; i++) {
		elements[i].textContent = '';
	}

	if (name == undefined || name == '') {
		document.getElementById('spanname').innerHTML = "Enter name";
		document.employeeForm.name.focus();
		return false;
	}

	if (email == undefined || email == '') {
		document.getElementById('spanemail').innerHTML = "Enter Email";
		return false;
	}
	var atpositon = email.indexOf('@');
	var dotposition = email.lastIndexOf('.');
	if (atpositon < 1 || dotposition < atpositon + 2 || dotposition + 2 >= email.length) {
		document.getElementById('spanemail').innerHTML = "Enter valid Email";
		document.employeeForm.email.focus();
		return false;
	}

	if (phone == undefined || phone == '' || phone.length != 10) {
		document.getElementById('spanphone').innerHTML = "Enter valid Phone number";
		document.employeeForm.phone.focus();
		return false;
	}

	if (address == undefined || address == '') {
		document.getElementById('spanaddress').innerHTML = "Enter valid address";
		document.employeeForm.address.focus();
		return false;
	}

	if (typeof (password) != undefined && password != null) {
		password = password.value;
		let regex = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@.#$!%*?&])[A-Za-z\d@.#$!%*?&]{8,20}$/;
		if (password == undefined || password == '' || password.length < 8 || !regex.test(password)) {
			document.getElementById('spanpassword').innerHTML = "Your password should be comprised of at least 8 characters. Use a combo of uppercase letters, lowercase letters, numbers, and even some special characters (!, @, $, %, ^, &, *, +, #). ";
			document.employeeForm.password.focus();
			return false;
		}
	}
}

function deleteAccount() {
	let message = "Are you sure you want to delete an account?";
	if (confirm(message) == true) {
		return true;
	}
	else {
		return false;
	}
}

function logoutUser() {
	let message = "Are you sure you want to logout?";
	if (confirm(message) == true) {
		return true;
	}
	else {
		return false;
	}
}
