package com.jodiebay44.dao;

import java.util.List;

import com.jodiebay44.dao.GenericDAO;
import com.jodiebay44.domain.Payment;





public interface PaymentDAO extends GenericDAO<Payment, Integer> {
  
	List<Payment> findAll();
	






}


