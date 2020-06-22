function checkPassword(form){
	 var user = form[form.id + ":Username"].value;
	 var password = form[form.id + ":pass"].value;
	 if(!user || 0 === user.length) {
		 alert("User is blank!");
		 return false;
	 }
	 if(!password || 0 === password.length) {
		 alert("Password is blank!");
		 return false;
	 }	   
	 return true;
}