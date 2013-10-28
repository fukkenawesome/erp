package de.kuebler.erp.crm.dao;

import java.sql.ResultSet;
import java.util.List;



import de.kuebler.erp.crm.mvc.model.RequestModel;

public interface RequestsDAO {
	
	//That should be the Request[][] List but i don't know where to implement Request now
	List<RequestModel> getAllActiveRequests();
	
	ResultSet getRequestsNew();
	ResultSet getRequestsInProcess();
	ResultSet getRequestsProcessed();
	ResultSet getAllInactiveRequests();
	ResultSet getRequest(Integer Id);

}
