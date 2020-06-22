package ar.edu.unnoba.poo.practica3;

import java.util.ResourceBundle;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("ValidatorPassword")
public class ValidatorPassword implements Validator {
	
	private static ResourceBundle rb = ResourceBundle.getBundle("resources.Bundle");

	public void validate(FacesContext paramFacesContext,
			UIComponent paramUIComponent, Object paramObject)
			throws ValidatorException {
		System.out.println("------------------->>>>>>>> validate(), " + paramObject);
		
		if(((String)paramObject).isEmpty()){ 
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_FATAL,"Fatal",rb.getString("empty.password"));
			throw new ValidatorException(message);
		}	
			
	}  

}
