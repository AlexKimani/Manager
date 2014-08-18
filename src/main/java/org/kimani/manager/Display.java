package org.kimani.manager;

import org.apache.struts.action.ActionForm;

/**
 * Created by alex on 8/15/14.
 */
public class Display extends ActionForm{
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
