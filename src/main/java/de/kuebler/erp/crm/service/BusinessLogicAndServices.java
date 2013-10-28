package de.kuebler.erp.crm.service;

import java.util.List;

import de.kuebler.erp.crm.mvc.model.RequestModel;


public interface BusinessLogicAndServices {

	String getDefaultExampleMessage();

	List<RequestModel> getDefaultRequestModel();
	
	String doSomethingDatabase();

}
