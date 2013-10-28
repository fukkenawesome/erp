package de.kuebler.erp.crm.dao.impl;

import java.sql.ResultSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import de.kuebler.erp.crm.dao.RequestsDAO;
import de.kuebler.erp.crm.mvc.model.RequestModel;

@Repository
public class MyTestDaoNamedParameterJdbcTemplate extends NamedParameterJdbcDaoSupport{

	
	@Autowired
	 private DataSource dataSource;

	 @PostConstruct
	 public void doSomething() {
	   super.setDataSource(dataSource);
	 // test: 
	@SuppressWarnings("deprecation")
	long success = getJdbcTemplate().queryForLong("SELECT * FROM dual");
	System.out.println("success: " + (success>0) );
	 }
	/*
	@Autowired
	private DataSource dataSource;
	private NamedParameterJdbcTemplate jdbcTemplateObject;
	
	
	public MyTestDaoNamedParameterJdbcTemplate(DataSource dataSource) {
		//super(dataSource);
		this.dataSource = dataSource;
	}
	
	private final String TEST_QUERY = "select * from dual";
	public void success(){
		Map<String, String> param = new HashMap<String, String>();
		int returnValue = jdbcTemplateObject.queryForObject(TEST_QUERY, param, Integer.class);
		if(returnValue > 0)
			System.out.println("WOHOOO");
	}
	
	
	public void setDataSource(DataSource dataSource){
		this.dataSource = dataSource;
		 this.jdbcTemplateObject = new NamedParameterJdbcTemplate(dataSource);
	}
	
	public DataSource getDataSource(){
		return this.dataSource;
	}
	
	public NamedParameterJdbcTemplate getTemplate(){
		return this.jdbcTemplateObject;
	}


	public List<RequestModel> getAllActiveRequests() {
		// TODO Auto-generated method stub
		return null;
	}


	public ResultSet getRequestsNew() {
		success();
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
		// TODO Auto-generated method stub
		return null;
	}
	
	public void doSomethingDatabase(){
		success();
	}
	*/
}
