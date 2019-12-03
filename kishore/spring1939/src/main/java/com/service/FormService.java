package com.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beans.Form;
import com.dao.Formdao;





@Service
public class FormService {
	
	@Autowired
	Formdao formdao;

	public List<Form> getAllData() {
		// TODO Auto-generated method stub
		return formdao.getAlldata();
	}

	public int getAdddata(Form P) {
		// TODO Auto-generated method stub
		return formdao.addForm(P);
	}
	
}
