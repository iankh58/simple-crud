package com.btpn.simplecrud;

import org.springframework.context.annotation.Bean;

import com.btpn.simplecrud.service.CrudService;
import com.btpn.simplecrud.service.CrudServiceImpl;

public class SpringConfig {
	@Bean
	public CrudService getCrudService(){
		return new CrudServiceImpl();
	}
}
