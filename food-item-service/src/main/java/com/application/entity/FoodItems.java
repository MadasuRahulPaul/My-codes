package com.application.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class FoodItems {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int itemId;
	private String fooditemName;
	private String fooditemDescription;
	private int fooditemCost;

	private String couponCode;
	public FoodItems() {
		super();
	}

	public FoodItems(int itemId, String fooditemName, String fooditemDescription, int fooditemCost, String couponCode) {
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
		return "FoodItems [itemId=" + itemId + ", fooditemName=" + fooditemName + ", fooditemDescription="
				+ fooditemDescription + ", fooditemCost=" + fooditemCost + ", couponCode=" + couponCode + "]";
	}
	
	
	

}
