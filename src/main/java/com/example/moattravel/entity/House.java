package com.example.moattravel.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "houses")
@Data
public class House {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id")
		private Integer id;
		
		@Column(name = "name")
		private String name;
		
		@Column(name = "image_name")
		private String imageName;
		
		@Column(name = "description")
		private String description;
		
		@Column(name = "price")
		private Integer price;
		
		@Column(name = "capacity")
		private Integer capacity;
		
		@Column(name = "postal_code")
		private String postalCode;
		
		@Column(name = "address")
		private String address;
		
		@Column(name = "phone_number")
		private String phoneNumber;
		
		@Column(name = "created_at", insertable = false, updatable = false)
		private Timestamp createdAt;
		
		@Column(name = "updated_at", insertable = false, updatable = false)
		private Timestamp updatedAt;
		
		// ゲッターとセッターをマニュアルセット
		//Id
		
		public Integer getId() {
		    return id;
		}
		public void setId(Integer id) {
		    this.id = id;
		}
		
		//Name
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		//ImageName
		public String getImageName() {
			return imageName;
		}
		public void setImageName(String imageName) {
			this.imageName = imageName;
		}
		
		//description
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		
		//price
		public Integer getPrice() {
			return price;
		}
		public void setPrice(Integer price) {
			this.price = price;
		}
		
		//capacity
		public Integer getCapacity() {
			return capacity;
		}
		public void setCapacity(Integer capacity) {
			this.capacity = capacity;
		}
		
		//PostalCode
		public String getPostalCode() {
			return postalCode;
		}
		public void setPostalCode(String postal_code) {
			this.postalCode = postal_code;
		}
		
		//Address
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		
		//PhoneNumber
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phone_number) {
			this.phoneNumber = phone_number;
		}
		
}
