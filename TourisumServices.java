package com.tourisum.service;

import java.util.Set;

import com.tourisum.dto.TourisumCatlog;

public interface TourisumServices {
	
	public TourisumCatlog addHotel(TourisumCatlog hotel);
	public TourisumCatlog getHotelDetailsById(int hotelId);
	public Set<TourisumCatlog> getAllHotelCatlog();
	public void deleteHotel(int  hotelId);
	public void updateDetails(int hotelId,TourisumCatlog hotel);
}
