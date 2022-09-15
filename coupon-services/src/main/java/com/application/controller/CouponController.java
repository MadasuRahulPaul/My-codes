package com.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.application.dto.CouponDto;
import com.application.service.CouponService;

@RestController
@RequestMapping(value = "/coupon-api", produces = { MediaType.APPLICATION_JSON_VALUE,
		MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
				MediaType.APPLICATION_XML_VALUE })
public class CouponController {

	@Autowired
	private CouponService couponsService;

	@GetMapping("/coupon/{couponId}")
	public ResponseEntity<CouponDto> getCoupon(@PathVariable("couponId") int couponId) {
		return new ResponseEntity<CouponDto>(couponsService.getCoupon(couponId), HttpStatus.OK);
	}

	@GetMapping("/coupons")
	public ResponseEntity<List<CouponDto>> getAllCoupons(
			@RequestParam(value = "pageNumber", required = false, defaultValue = "0") int pageNumber,
			@RequestParam(value = "pageSize", required = false, defaultValue = "3") int pageSize) {
		return new ResponseEntity<>(couponsService.getAllCoupons(pageNumber, pageSize), HttpStatus.OK);
	}

	@PostMapping("/coupon")
	public ResponseEntity<CouponDto> insertCoupon(@RequestBody CouponDto couponsDto) {
		return new ResponseEntity <CouponDto>(couponsService.insertCoupon(couponsDto), HttpStatus.CREATED);
	}

	@PutMapping("/coupon/{couponId}")
	public ResponseEntity<String> updateCoupon(@PathVariable("couponId") int couponId,
			@RequestBody CouponDto couponsDto) {
		couponsService.updateCoupon(couponId, couponsDto);
		return new ResponseEntity<String>("Coupon Updated Successfullyy...!!!", HttpStatus.OK);
	}

	@DeleteMapping("/coupon/{couponId}")
	public ResponseEntity<String> deleteCoupon(@PathVariable("couponId") int couponId) {
		couponsService.deleteCoupon(couponId);
		return new ResponseEntity<String>("Coupon Deleted Successfullyy....!!!", HttpStatus.OK);
	}

	@GetMapping("/coupon/code/{couponCode}")
	public ResponseEntity<CouponDto> getByCouponCode(@PathVariable("couponCode") String couponCode) {
		return new ResponseEntity<CouponDto>(couponsService.test(couponCode), HttpStatus.OK);
	}

	@GetMapping("/coupon/discount/{couponDiscount}")
	public ResponseEntity<List<CouponDto>> getByCouponDiscount(@PathVariable("couponDiscount") Double couponDiscount) {
		return new ResponseEntity<>(couponsService.test1(couponDiscount), HttpStatus.OK);
	}

	@GetMapping("/coupon/{couponCode}/{couponDiscount}")
	public ResponseEntity<List<CouponDto>> getByCouponCodeAndCouponDiscount(@PathVariable String couponCode,
			@PathVariable("couponDiscount") int couponDiscount) {
		return new ResponseEntity<>(couponsService.test2(couponCode, couponDiscount),
				HttpStatus.OK);
	}

}
