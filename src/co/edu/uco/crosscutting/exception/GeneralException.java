package co.edu.uco.crosscutting.exception;

import static co.edu.uco.crosscutting.util.text.UtilText.*;
import static co.edu.uco.crosscutting.util.object.UtilObject.getUtilObject;

public class GeneralException extends RuntimeException {

	private static final long serialVersionUID = -8936822579371668109L;
	
	private String userMessage;
	private String technicalMessage;
	private Exception rootException;
	
	protected GeneralException(String userMessage, String technicalMessage,
			super();
	
	
	public String getUserMessage() {
		return userMessage;
	}
	private void setUserMessage(String userMessage) {
		this.userMessage = trim(userMessage);
	}
	public String getTechnicalMessage() {
		return technicalMessage;
	}
	private void setTechnicalMessage(String technicalMessage) {
		this.technicalMessage = trim(technicalMessage);
	}
	public Exception getRootException() {
		return rootException;
	}
	private void setRootException(Exception rootException) {
		this.rootException = getUtilObject().getDefault(rootException,
				new Exception)
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
