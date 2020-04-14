package com.framework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.framework.business.*;
import com.framework.jpa.*;

@RestController
public class BillRestMicroService {
	@Autowired
	BillBean billBean;
	
	@PostMapping(value="/addBill")
	public String addBill(@RequestBody BillsEntityDTO bill) {
		String result = billBean.addBill(bill);

		if(result.equals("success")) {
			return "success";
		}else {
			return "error";
		}
	}
	
}
