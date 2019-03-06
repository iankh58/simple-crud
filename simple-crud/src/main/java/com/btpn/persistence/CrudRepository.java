package com.btpn.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.btpn.simplecrud.model.Crud;

public interface CrudRepository extends JpaRepository<Crud, String> {
	
}
