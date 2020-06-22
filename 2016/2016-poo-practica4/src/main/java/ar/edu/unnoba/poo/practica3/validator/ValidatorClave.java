package ar.edu.unnoba.poo.practica3.validator;

import java.util.ResourceBundle;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("ValidatorClave")
public class ValidatorClave implements Validator {
	
	private static ResourceBundle rb = ResourceBundle.getBundle("resources.Bundle");

	public void validate(FacesContext paramFacesContext,
			UIComponent paramUIComponent, Object paramObject)
			throws ValidatorException {
		System.out.println("------------------->>>>>>>> validate(), " + paramObject);
		
		if(((String)paramObject).isEmpty()){ 
			FacesMessage message = new FacesMessage(rb.getString("empty.password"));
			throw new ValidatorException(message);
		}	
			
	}  

}
