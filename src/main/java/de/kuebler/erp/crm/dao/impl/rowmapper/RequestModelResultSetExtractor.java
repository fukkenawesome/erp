package de.kuebler.erp.crm.dao.impl.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import de.kuebler.erp.crm.mvc.model.RequestModel;



public class RequestModelResultSetExtractor implements ResultSetExtractor<List<RequestModel>> {
	
	
	private static RequestModelResultSetExtractor instance = new RequestModelResultSetExtractor();
	
	private RequestModelResultSetExtractor(){}
	
	public static RequestModelResultSetExtractor getInstance() {
		return instance;
	}


	public List<RequestModel> extractData(ResultSet rs) throws SQLException, DataAccessException {
		List<RequestModel> returnList = new ArrayList<RequestModel>();
		
		while(rs.next()){
			RequestModel model = new RequestModel();
			
			model.setActive(rs.getBoolean("ACTIVE"));
			
			returnList.add(model);					
		}
		
		return returnList;
	}

}
