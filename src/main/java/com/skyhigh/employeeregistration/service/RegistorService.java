package com.skyhigh.employeeregistration.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.skyhigh.employeeregistration.DTO.RegistorDto;
import com.skyhigh.employeeregistration.entity.Registor;
import com.skyhigh.employeeregistration.repository.RegistorRepositroy;

@Component
public class RegistorService {
	@Autowired
	private ModelMapper mapper;
	@Autowired
	private RegistorRepositroy registorRepositroy;
	
	public void processRegisterDetails(RegistorDto registorDto){
		Registor registor=mapper.map(registorDto, Registor.class);
		registorRepositroy.save(registor);
	}
	public List<Registor> findAll(){
		return registorRepositroy.findAll();
		
	}
		
	
}
