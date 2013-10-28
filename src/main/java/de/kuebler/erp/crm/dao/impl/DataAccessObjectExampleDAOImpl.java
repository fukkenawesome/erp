package de.kuebler.erp.crm.dao.impl;

import org.springframework.stereotype.Repository;

import de.kuebler.erp.crm.dao.DataAccessObjectExampleDAO;


@Repository
public class DataAccessObjectExampleDAOImpl extends IAmSuperDaoImpl implements DataAccessObjectExampleDAO{

	
//	private String query = "select * from dual";
	
	public String getDefaultExampleMessageByDAO() {
		
//		return queryForObject(query, Integer.class);
//		return queryForObject(query, String.class);
		// TODO Auto-generated method stub
		return "All hail to the King, BABY!";
	}

}
