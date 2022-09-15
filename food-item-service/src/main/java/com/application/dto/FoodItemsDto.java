package com.application.dto;

import javax.persistence.Transient;

public class FoodItemsDto {
	
	private int itemId;
	private String fooditemName;
	private String fooditemDescription;
	private int fooditemCost;
	@Transient
	private String couponCode;
	public FoodItemsDto() {
		super();
	}

	public FoodItemsDto(int itemId, String fooditemName, String fooditemDescription, int fooditemCost,
			String couponCode) {
		super();
		this.itemId = itemId;
		this.fooditemName = fooditemName;
		this.fooditemDescription = fooditemDescription;
		this.fooditemCost = fooditemCost;
		this.couponCode = couponCode;
	}

	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getFooditemName() {
		return fooditemName;
	}
	public void setFooditemName(String fooditemName) {
		this.fooditemName = fooditemName;
	}
	public String getFooditemDescription() {
		return fooditemDescription;
	}
	public void setFooditemDescription(String fooditemDescription) {
		this.fooditemDescription = fooditemDescription;
	}
	public int getFooditemCost() {
		return fooditemCost;
	}
	public void setFooditemCost(int fooditemCost) {
		this.fooditemCost = fooditemCost;
	}
	
	public String getCouponCode() {
		return couponCode;
	}
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	@Override
	public String toString() {
		return "FoodItemsDto [itemId=" + itemId + ", fooditemName=" + fooditemName + ", fooditemDescription="
				+ fooditemDescription + ", fooditemCost=" + fooditemCost + ", couponCode=" + couponCode + "]";
	}
	
	
	

}
