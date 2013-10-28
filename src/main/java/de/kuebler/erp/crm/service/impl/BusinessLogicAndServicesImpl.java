package de.kuebler.erp.crm.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.kuebler.erp.crm.dao.DataAccessObjectExampleDAO;
import de.kuebler.erp.crm.dao.RequestsDAO;
import de.kuebler.erp.crm.dao.impl.MyTestDaoNamedParameterJdbcTemplate;
import de.kuebler.erp.crm.mvc.model.RequestModel;
import de.kuebler.erp.crm.service.BusinessLogicAndServices;


@Service
public class BusinessLogicAndServicesImpl implements BusinessLogicAndServices {
	
	private DataAccessObjectExampleDAO exampleDao;
	private RequestsDAO requestDao;
	
	
	
	@Autowired
	public BusinessLogicAndServicesImpl(DataAccessObjectExampleDAO exampleDao,
			RequestsDAO requestDao) {
		this.exampleDao = exampleDao;
		this.requestDao = requestDao;
		
	}

	public String getDefaultExampleMessage() {
		return this.exampleDao.getDefaultExampleMessageByDAO();
	}

	public String doSomethingDatabase(){
	
		return "Duck";
	}
	
	
	public List<RequestModel> getDefaultRequestModel() {
		// TODO Auto-generated method stub
		return this.requestDao.getAllActiveRequests();
	}
	

}
