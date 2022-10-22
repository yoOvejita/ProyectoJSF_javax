package com.pepe.validadores;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
@FacesValidator(value="usuarioValidador")
public class UsuarioValidador implements Validator{
	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		String usu = value.toString();
		if(usu.equalsIgnoreCase("admin")) {//No se puede usar este nombre
			//Si no cumple nuestra validación
			FacesMessage facesMessage = new FacesMessage();
			facesMessage.setDetail("No puede crear un usuario con el nombre \"admin\".");
			facesMessage.setSummary("Nombre no válido");
			facesMessage.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(facesMessage);
		}
		//Si cumple con la validación, no hacemos nada
	}
}
