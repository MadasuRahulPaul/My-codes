package com.application.service;

import java.util.List;

import com.application.dto.CouponDto;
import com.application.entity.Coupon;

public interface CouponService {

	public CouponDto getCoupon(int couponId);

	public List<CouponDto> getAllCoupons( int pageNumer, int pageSize);

	public CouponDto insertCoupon(CouponDto couponsDto);

	public void updateCoupon(int couponId, CouponDto couponsDto);

	public void deleteCoupon(int couponId);

	public CouponDto test(String couponCode);

	List<CouponDto> test1(Double couponDiscount);

	List<CouponDto> test2(String couponCode, int couponDiscount);

}
