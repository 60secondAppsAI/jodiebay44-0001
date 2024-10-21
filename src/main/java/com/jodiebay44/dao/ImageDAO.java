package com.jodiebay44.dao;

import java.util.List;

import com.jodiebay44.dao.GenericDAO;
import com.jodiebay44.domain.Image;





public interface ImageDAO extends GenericDAO<Image, Integer> {
  
	List<Image> findAll();
	






}


