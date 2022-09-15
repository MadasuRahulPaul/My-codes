package com.application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.application.entity.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, Integer> {
	@Query("from Coupon c where c.couponCode=:code")
	public Coupon test(@Param(value="code") String couponCode);

	@Query("from Coupon c where c.couponDiscount=:discount ")
	List<Coupon> test1(@Param(value ="discount") Double couponDiscount);

	@Query("from Coupon c where c.couponCode=:code and c.couponDiscount=:discount")
	List<Coupon> test2(@Param(value="code") String couponCode,
			@Param(value="discount") int couponDiscount);

}
