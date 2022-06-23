package com.tourisum.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tourisum.dto.TourisumCatlog;
import com.tourisum.service.TourisumServicesImpl;

@RestController
@RequestMapping("/TourisumCatlog")
public class TourisumController 
{
	@Autowired
	TourisumServicesImpl tourisumSer;
	
	//http://localhost:9090/TourisumCatlog
	@GetMapping
	public Set<TourisumCatlog> fetchAllDetails()
	{
		 return tourisumSer.getAllHotelCatlog();
	}
	//http://localhost:9090/TourisumCatlog
	//{add json object}
	@PostMapping
	public HashSet<TourisumCatlog> insertHotel(@RequestBody TourisumCatlog cat)
	{
		System.out.println(cat+ "Add Hotel : ");
		tourisumSer.addHotel(cat);
		System.out.println(cat+"hotel add : ");
		return (HashSet)tourisumSer.getAllHotelCatlog();
	}
	
	//http://localhost:9090/TourisumCatlog/
	@DeleteMapping(value="/{hotelId}")
	public String deleteHotel(@PathVariable("hotelId") int hotelId)
	{
		tourisumSer.deleteHotel(hotelId);
		return "Succesfully Delete Hotel"+hotelId;
	}
	//http://localhost:9090/TourisumCatlog/1001
	@PutMapping(value="/{hotelId}")
	public String updateDetails(@PathVariable("hotelId") int hotelId ,@RequestBody TourisumCatlog hotel) 
	{
		tourisumSer.updateDetails(hotelId, hotel);
		return "update Succesfully Hotel "+hotelId;
	}
	
}
