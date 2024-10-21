package com.jodiebay44.dao;

import java.util.List;

import com.jodiebay44.dao.GenericDAO;
import com.jodiebay44.domain.Category;





public interface CategoryDAO extends GenericDAO<Category, Integer> {
  
	List<Category> findAll();
	






}


