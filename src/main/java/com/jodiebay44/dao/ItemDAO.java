package com.jodiebay44.dao;

import java.util.List;

import com.jodiebay44.dao.GenericDAO;
import com.jodiebay44.domain.Item;





public interface ItemDAO extends GenericDAO<Item, Integer> {
  
	List<Item> findAll();
	






}


