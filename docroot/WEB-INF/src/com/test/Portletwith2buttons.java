package com.test;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

/**
 * Portlet implementation class Portletwith2buttons
 */
public class Portletwith2buttons extends MVCPortlet {
 

	 public void javaActionMethod(ActionRequest actionRequest,
			 ActionResponse actionResponse) throws IOException, PortletException {
		 		System.out.println("Testing starts..");

		 		String buttonValue=ParamUtil.get(actionRequest, "button1", "");
		 		System.out.println("The following button was pressed: " + buttonValue);
		 		
		 		System.out.println("Testing ends..");
	 }
	 
}
