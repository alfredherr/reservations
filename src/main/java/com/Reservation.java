package com;

public class Reservation{
	
	private final long id;
	private final Site location;
	private final String checkInDate;
	private final String checkOutDate;
	private final String reservationNumber;
	
	public Reservation( long _id, String _checkInDate, String _checkOutDate, String _reservationNumber, Site _location ){
		this.id = _id;
		this.checkInDate  = _checkInDate;
		this.checkOutDate = _checkOutDate;
		this.reservationNumber = _reservationNumber;
		this.location = _location;
		
	}
	
	public long getId(){
		return this.id;
	}
	
	public Site getLocation(){
		return this.location;
	}
	
	public String getCheckInDate(){
		return this.checkInDate;
	}
	
	public String getCheckOutDate(){
		return this.checkOutDate;		
	}
	
	public String getReservationNumber(){
		return this.reservationNumber;
	}
	
}