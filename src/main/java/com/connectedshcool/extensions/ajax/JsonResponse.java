package com.connectedshcool.extensions.ajax;

import java.util.List;

public class JsonResponse {

	private boolean status;
	private List<ErrorMessage> errorMessageList;
    private String redirectUrl;
    private String resirectTarget;
    private String successMessage;
    
    
    
    

	public String getRedirectUrl() {
		return redirectUrl;
	}

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	public String getResirectTarget() {
		return resirectTarget;
	}

	public void setResirectTarget(String resirectTarget) {
		this.resirectTarget = resirectTarget;
	}

	public String getSuccessMessage() {
		return successMessage;
	}

	public void setSuccessMessage(String successMessage) {
		this.successMessage = successMessage;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public List<ErrorMessage> getErrorMessageList() {
		return this.errorMessageList;
	}

	public void setErrorMessageList(List<ErrorMessage> errorMessageList) {
		this.errorMessageList = errorMessageList;
	}
}
