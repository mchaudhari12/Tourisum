package com.tourisum.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tourisum.dao.TourisumCatlogRepository;
import com.tourisum.dto.TourisumCatlog;

@Service
public class TourisumServicesImpl implements TourisumServices{

	@Autowired
	TourisumCatlogRepository tourisumRepo;
	
	@Override
	public TourisumCatlog addHotel(TourisumCatlog hotel) {
		tourisumRepo.save(hotel);
		System.out.println("Add Hotels");
		Optional<TourisumCatlog> catl = tourisumRepo.findById(hotel.getHotelId());
		return catl.get();
	}

	@Override
	public TourisumCatlog getHotelDetailsById(int hotelId) {
		Optional<TourisumCatlog> catl = tourisumRepo.findById(hotelId);
		return catl.get();
	}

	@Override
	public Set<TourisumCatlog> getAllHotelCatlog() {
		ArrayList<TourisumCatlog> hotelList = (ArrayList)tourisumRepo.findAll();
		HashSet<TourisumCatlog> hotelSet = new HashSet<TourisumCatlog>();
		for(TourisumCatlog tc:hotelList ) 
		{
			hotelSet.add(tc);
		}
		return hotelSet;
	}

	@Override
	public void deleteHotel(int hotelId) {
		tourisumRepo.deleteById(hotelId);
	}

	@Override
	public void updateDetails(int hotelId, TourisumCatlog hotel) {
		TourisumCatlog tourisumDB = tourisumRepo.findById(hotelId).get();
		System.out.println(tourisumDB.toString());
		tourisumDB.setHotelId(hotel.getHotelId());
		tourisumDB.setHotelName(hotel.getHotelName());
		tourisumDB.setHotelAddress(hotel.getHotelAddress());
		tourisumDB.setHotelRating(hotel.getHotelRating());
		tourisumRepo.save(tourisumDB);
	}

}
