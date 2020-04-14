package com.framework.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.framework.jpa.*;

@Component
public class BillBean {
	@Autowired
	public BillRepository billRepository;
	public BillsEntity bill;
	
	public String addBill(BillsEntityDTO billsEntityDTO) {
		try {
			String orderid = billsEntityDTO.getOrderid();	
			String userid = billsEntityDTO.getUserid();
			String card = billsEntityDTO.getCard();
			String cardname = billsEntityDTO.getCardname();
			String datemonth = billsEntityDTO.getDatemonth();
			String dateyear = billsEntityDTO.getDateyear();
			String totalPrice = billsEntityDTO.getTotalPrice();		
			bill =  new BillsEntity(orderid, userid, card, cardname, datemonth, dateyear, totalPrice);
			billRepository.save(bill);
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}
	
}
