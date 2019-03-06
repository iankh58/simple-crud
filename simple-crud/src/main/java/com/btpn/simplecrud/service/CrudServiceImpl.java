package com.btpn.simplecrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.btpn.persistence.CrudRepository;
import com.btpn.simplecrud.model.Crud;
import com.btpn.simplecrud.model.Response;

public class CrudServiceImpl implements CrudService {
	@Autowired
	private CrudRepository crudRepo;
	
	@Autowired
	private Crud crud;
	
	@Autowired
	private Response response;

	@Override
	public List<Crud> findAll() {
		return crudRepo.findAll();
	}

}
