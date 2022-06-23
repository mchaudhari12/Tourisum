package com.tourisum.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tourisum.dto.TourisumCatlog;

@Repository
public interface TourisumCatlogRepository extends JpaRepository<TourisumCatlog, Integer>{
	
	

}
