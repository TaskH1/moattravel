package com.example.moattravel.form;

import java.time.LocalDate;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ReservationInputForm {
	@NotBlank(message = "チェックイン日とチェックアウト日を選択してください。")
	private String fromCheckinDateToCheckoutDate;
	public String getFromCheckinDateToCheckoutDate() {
		return fromCheckinDateToCheckoutDate;
	}
	public void setFromCheckinDateToCheckoutDate(String fromCheckinDateToCheckoutDate) {
		this.fromCheckinDateToCheckoutDate = fromCheckinDateToCheckoutDate;
	}
	
	@NotNull(message = "宿泊人数を入力して下さい。")
	@Min(value = 1, message = "宿泊人数は一人以上に設定して下さい。")
	private Integer numberOfPeople;
	public Integer getNumberOfPeople() {
		return numberOfPeople;
	}
	public void setNumberOfPeople(Integer numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}
 	
	//チェックイン日を取得する
	public LocalDate getCheckinDate() {
		String[] checkinDateAndCheckoutDate = getFromCheckinDateToCheckoutDate().split(" to ");
			return LocalDate.parse(checkinDateAndCheckoutDate[0]);
	}
	
	//チェックアウト日を取得する
	public LocalDate getCheckoutDate() {
		String[] checkinDateAndCheckoutDate = getFromCheckinDateToCheckoutDate().split(" to ");
			return LocalDate.parse(checkinDateAndCheckoutDate[1]);
	}
}
