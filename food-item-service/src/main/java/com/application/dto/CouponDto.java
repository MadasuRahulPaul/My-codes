package com.application.dto;

public class CouponDto {
	
	private int couponId;
	private String couponCode;
	private int couponDiscount;
	private String couponExpriyDate;
	public CouponDto() {	
	super();
	}
	public CouponDto(int couponId, String couponCode, int couponDiscount, String couponExpriyDate) {
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
	public int getCouponDiscount() {
		return couponDiscount;
	}
	public void setCouponDiscount(int couponDiscount) {
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
