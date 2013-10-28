package de.kuebler.erp.crm.dao.impl;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;


import de.kuebler.erp.crm.mvc.model.RequestModel;
import de.kuebler.erp.crm.dao.RequestsDAO;



@Repository
public class RequestsDAOImpl extends MyTestDaoNamedParameterJdbcTemplate implements RequestsDAO{
	

	private String allActiveRequestsQuery = "SELECT * from Requests WHERE Requests.Active = true ORDER BY Requests.Last_Changed DESC";
	private String requestsNew = "SELECT * from Requests WHERE Requests.Status = New ORDER BY Requests.Last_Changed DESC";

	private String getRequestbyId = "SELECT * from Requests WHERE Requests.ID =";

	
	
	
	
	private final StringBuilder QUERY_GET_SOMETHING_BY_PARAMETER = new StringBuilder(
			"Select * from Request where request.id = :request_id and request.actice = :rq_active and request.name = :me_name").append(
			"Select * from Request where request.id = ? and request.actice = ? and request.name = ?");
	
	private final String QUERY_GET_ALL_USER_IDS = "select u.id_user from user u where u.lastname = :placeholder";
	
	
	public List<RequestModel> getAllActiveRequests() {
		List<RequestModel> requestsList = new ArrayList<RequestModel>();
		requestsList.add(new RequestModel(148541, 111, 112, new Date(10, 10, 10), new Timestamp(0, 0, 0, 0, 0, 0, 0), 1, 5, 2, "Markise", "New", "Some Time", "repair", "something", true));
		requestsList.add(new RequestModel());
		requestsList.add(new RequestModel());
		requestsList.add(new RequestModel());
		
		//Map<String, Object> param = new HashMap<String, Object>();
		//param.put("placeholder", "Gluderer");
		
		//List<String> uderIdList = this.getTemplate().queryForList(QUERY_GET_ALL_USER_IDS, param, String.class);
		
//		List<RequestModel> returnList = new ArrayList<RequestModel>();
//		returnList = this.query(allActiveRequestsQuery, RequestModelResultSetExtractor.getInstance());
//		Map<String, Object> param = new HashMap<String, Object>(3);
//		param.put("request_id", 123456);
//		param.put("me_name", "abc");
//		param.put("rq_active", 123456);
//		this.getNamedParameterJdbc.query(QUERY_GET_SOMETHING_BY_PARAMETER, params, RequestModelResultSetExtractor.getInstance());
//		this.query(QUERY_GET_SOMETHING_BY_PARAMETER, new Object{{123456, 12354, "abc"}}, RequestModelResultSetExtractor.getInstance());
//		return returnList;
		
		return requestsList;
	}

	public ResultSet getRequestsNew() {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultSet getRequestsInProcess() {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultSet getRequestsProcessed() {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultSet getAllInactiveRequests() {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultSet getRequest(Integer Id) {
		String query = getRequestbyId + Id;
		return null;
	}

}
