package com.jodiebay44.dao;

import java.util.List;

import com.jodiebay44.dao.GenericDAO;
import com.jodiebay44.domain.Bid;





public interface BidDAO extends GenericDAO<Bid, Integer> {
  
	List<Bid> findAll();
	






}


