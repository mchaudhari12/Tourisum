package com.tourisum.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tor_cat")
public class TourisumCatlog   //hotel catlog 
{
	@Id
	@Column(name="hotel_id",length =10)
	private int hotelId;
	@Column(name = "hotel_name",length = 20)
	private String hotelName;
	@Column(name = "hotel_Address", length = 50)
	private String hotelAddress;
	@Column(name ="hotel_rating",length = 10)
	private int hotelRating;
	
	public TourisumCatlog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TourisumCatlog(int hotelId, String hotelName, String hotelAddress, int hotelRating) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.hotelAddress = hotelAddress;
		this.hotelRating = hotelRating;
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelAddress() {
		return hotelAddress;
	}

	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}

	public int getHotelRating() {
		return hotelRating;
	}

	public void setHotelRating(int hotelRating) {
		this.hotelRating = hotelRating;
	}

	@Override
	public String toString() {
		return "tourisumCatlog [hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelAddress=" + hotelAddress
				+ ", hotelRating=" + hotelRating + "]";
	}
	
}
