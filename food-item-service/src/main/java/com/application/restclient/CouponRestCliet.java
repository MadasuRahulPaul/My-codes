package com.application.restclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.application.dto.CouponDto;


@FeignClient("COUPON-SERVICE")
public interface CouponRestCliet {
	
	@GetMapping(value="/coupon/code/{couponCode}",produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	CouponDto getCoupon(@PathVariable("couponCode") String couponCode);

}
