package com.example.moattravel.form;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


public class HouseRegisterForm {
	@NotBlank(message="民宿を入力してください。")
	private String name;
	
	private MultipartFile imageFile;
	
	@NotBlank(message = "説明を入力して下さい。")
	private String description;
	
	@NotNull(message = "宿泊料金を入力して下さい")
	@Min(value = 1, message = "宿泊料金は1円以上に設定して下さい。")
	private Integer price;
	
	@NotNull(message = "定員を入力して下さい。")
	@Min(value = 1, message = "定員は一人以上に設定して下さい。")
	private Integer capacity;
	
	@NotBlank(message = "郵便番号を入力して下さい。")
	private String postalCode;
	
	@NotBlank(message = "住所を入力して下さい")
	private String address;
	
	@NotBlank(message = "電話番号を入力して下さい")
	private String phoneNumber;
	
	//manually generate setters and getters
	public String getName() { return name;}
	public void setName(String name) { this.name = name;}
	
	public MultipartFile getImageFile() {return imageFile;}
	public void setImageFile(MultipartFile imageFile) { this.imageFile = imageFile;}
	
	public String getDescription() {return description;}
	public void setDescription(String description) { this.description = description;}
	
	public Integer getPrice() {return price;}
	public void setPrice(Integer price) { this.price = price;}
	
	public Integer getCapacity() {return capacity;}
	public void setCapacity(Integer capacity) { this.capacity = capacity;}
	
	public String getPostalCode() {return postalCode;}
	public void setPostalCode(String postalCode) { this.postalCode = postalCode;}
	
	public String getAddress() {return address;}
	public void setAddress(String address) { this.address = address;}
	
	public String getPhoneNumber() {return phoneNumber;}
	public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber;}
	
}