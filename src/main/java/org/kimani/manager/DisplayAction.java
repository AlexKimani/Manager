package org.kimani.manager;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by alex on 8/18/14.
 */
public class DisplayAction extends Action{
	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response)
			throws Exception {

		Display welcome = (Display) form;
		welcome.setMessage("Hello World! Struts");

		return mapping.findForward("success");
	}
}
