package com.Ebilling.ps.models.common;

public class ServiceResult<T> {

	private String statusCode;
	private T returnedObject;
	private String debugId;
	private String rqUID;

	public ServiceResult() {
	}

	public ServiceResult(String statusCode) {
		this.statusCode = statusCode;
	}

	/**
	 * Return false if the list contains any failure message
	 * 
	 * @return true or false depending on the success or failure of the status
	 *         messages
	 */
	public boolean isSuccess() {
		boolean success = true;
		if (statusCode == null || statusCode.isEmpty() || !statusCode.startsWith("I"))
			return false;

		return success;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public T getReturnedObject() {
		return returnedObject;
	}

	public void setReturnedObject(T returnedObject) {
		this.returnedObject = returnedObject;
	}

	public String getDebugId() {
		return debugId;
	}

	public void setDebugId(String debugId) {
		this.debugId = debugId;
	}

	public String getRqUID() {
		return rqUID;
	}

	public void setRqUID(String rqUID) {
		this.rqUID = rqUID;
	}

}
