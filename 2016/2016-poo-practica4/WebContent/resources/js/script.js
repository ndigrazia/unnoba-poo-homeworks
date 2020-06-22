function validarUsuario(form){
	 var user = form[form.id + ":Nombre"].value;
	 var password = form[form.id + ":Clave"].value;
	 if(!user || 0 === user.length) {
		 alert("Nombre no puede ser blanco!");
		 return false;
	 }
	 if(!password || 0 === password.length) {
		 alert("Clave no puede ser blanco!");
		 return false;
	 }	   
	 return true;
}