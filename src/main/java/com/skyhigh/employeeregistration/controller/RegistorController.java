package com.skyhigh.employeeregistration.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.skyhigh.employeeregistration.DTO.RegistorDto;
import com.skyhigh.employeeregistration.contant.AppConstant;
import com.skyhigh.employeeregistration.service.RegistorService;

@Component
@RequestMapping(value=AppConstant.FORWARD_SLASH)
public class RegistorController {
	@Autowired
	 private RegistorService regservice;
	public RegistorController(){
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}
@RequestMapping(value=AppConstant.SAVE_REGISTER_DETAILS)
	public ModelAndView saveRegistorDetials(RegistorDto registorDto) {
	System.out.println(registorDto);
	 regservice.processRegisterDetails(registorDto);
	return new ModelAndView("statusAlert.jsp");
	
}
	
	 
	

}
