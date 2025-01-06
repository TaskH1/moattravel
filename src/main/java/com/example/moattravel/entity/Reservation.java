package com.example.moattravel.entity;

import java.sql.Timestamp;
import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "reservations")
@Data
public class Reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@ManyToOne
	@JoinColumn(name = "house_id")
	private House house;
	public House getHouse() {
		return house;
	}
	public void setHouse(House house) {
		this.house = house;
	}
	
	@ManyToOne
	@JoinColumn(name  = "user_id")
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	@Column(name = "checkin_date")
	private LocalDate checkinDate;
	public LocalDate getCheckinDate() {
		return checkinDate;
	}
	public void setCheckinDate(LocalDate checkinDate) {
		this.checkinDate = checkinDate;
	}
	
	@Column(name = "checkout_date")
	private LocalDate checkoutDate;
	public LocalDate getCheckoutDate() {
		return checkinDate;
	}
	public void setCheckoutDate(LocalDate checkoutDate) {
		this.checkoutDate = checkoutDate;
	}
	
	@Column(name = "number_of_people")
	private Integer numberOfPeople;
	public Integer getNumberOfPeople() {
		return numberOfPeople;
	}
	public void setNumberOfPeople(Integer numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}
	
	@Column(name = "amount")
	private Integer amount;
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
	@Column(name = "created_at", insertable = false, updatable = false)
	private Timestamp createdAt;
	public Timestamp getcreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	
	@Column(name = "updated_at", insertable = false, updatable = false)
	private Timestamp updatedAt;
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}
	public void setupdatedAt() {
		this.updatedAt = updatedAt;
	}
}
