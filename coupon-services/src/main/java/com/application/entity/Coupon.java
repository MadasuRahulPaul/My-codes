package com.application.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Coupon {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int couponId;
	private String couponCode;
	private int couponDiscount;
	private String couponExpriyDate;
	public Coupon() {
		super();
	}
	public Coupon(int coupondId, String couponCode, int couponDiscount, String couponExpriyDate) {
		super();
		this.couponId = coupondId;
		this.couponCode = couponCode;
		this.couponDiscount = couponDiscount;
		this.couponExpriyDate = couponExpriyDate;
	}
	public int getCouponId() {
		return couponId;
	}
	public void setCouponId(int coupondId) {
		this.couponId = coupondId;
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
		return "Coupons [couponId=" + couponId + ", couponCode=" + couponCode + ", couponDiscount=" + couponDiscount
				+ ", couponExpriyDate=" + couponExpriyDate + "]";
	}
	
	

}

