package com.dao;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Repository;

import com.beans.Form;

@Repository

public class Formdao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public int addForm( Form p) {
		String sql="insert into  Form12 values(?,?,?,?,?,?)";
		if(p!=null) {
		return jdbcTemplate.update(sql,new Object[] {p.getName(),p.getLname(),p.getCnno(),p.getMailid(),
				p.getDate(),p.getCity()});}
		else
		{
			return 0;
		}
		
}
public List<Form> getAlldata() {
		String sql="select * from Form12";
		List<Form> plist=jdbcTemplate.query(sql,new BeanPropertyRowMapper<Form>(Form.class));
	return plist;
	}


	
	
}