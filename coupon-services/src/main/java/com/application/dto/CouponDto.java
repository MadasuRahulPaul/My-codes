package com.application.dto;

public class CouponDto {
	
	private int couponId;
	private String couponCode;
	private Double couponDiscount;
	private String couponExpriyDate;
	public CouponDto() {	
	super();
	}
	public CouponDto(int couponId, String couponCode, Double couponDiscount, String couponExpriyDate) {
		super();
		this.couponId = couponId;
		this.couponCode = couponCode;
		this.couponDiscount = couponDiscount;
		this.couponExpriyDate = couponExpriyDate;
	}
	public int getCouponId() {
		return couponId;
	}
	public void setCouponId(int couponId) {
		this.couponId = couponId;
	}
	public String getCouponCode() {
		return couponCode;
	}
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}
	public Double getCouponDiscount() {
		return couponDiscount;
	}
	public void setCouponDiscount(Double couponDiscount) {
		this.couponDiscount = couponDiscount;
	}
	public String getCouponExpriyDate() {
		return couponExpriyDate;
	}
	public void setCouponExpriyDate(String couponExpriyDate) {
		this.couponExpriyDate = couponExpriyDate;
	}
	@Override
	public String toString() {
		return "CouponsDto [couponId=" + couponId + ", couponCode=" + couponCode + ", couponDiscount=" + couponDiscount
				+ ", couponExpriyDate=" + couponExpriyDate + "]";
	}
	

}
