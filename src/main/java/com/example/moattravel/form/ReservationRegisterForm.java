package com.example.moattravel.form;


public class ReservationRegisterForm {
	private Integer houseId;
	public Integer getHouseId() {
		return houseId;
	}
	public void setHouseId(Integer houseId) {
		this.houseId = houseId;
	}
	
	private Integer userId;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	private String checkinDate;
	public String getCheckinDate() {
		return checkinDate;
	}
	public void setCheckinDate(String checkinDate) {
		this.checkinDate = checkinDate;
	}
	
	private String checkoutDate;
	public String getCheckoutDate() {
		return checkoutDate;
	}
	public void setCheckoutDate(String checkoutDate) {
		this.checkoutDate = checkoutDate;
	}
	
	private Integer numberOfPeople;
	public Integer getNumberOfPeople() {
		return numberOfPeople;
	}
	public void setNumberOfPeople(Integer numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}
	
	private Integer amount;
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
	//constructor
	public ReservationRegisterForm(Integer houseId, Integer userId, String checkinDate,
			String checkoutDate, Integer numberOfPeople, Integer amount) {
		this.houseId = houseId;
		this.userId = userId;
		this.checkinDate = checkinDate;
		this.checkoutDate = checkoutDate;
		this.numberOfPeople = numberOfPeople;
		this.amount = amount;
		
	}
}
