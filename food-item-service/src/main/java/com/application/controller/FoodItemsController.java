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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.application.dto.CouponDto;
import com.application.dto.FoodItemsDto;
import com.application.entity.FoodItems;
import com.application.restclient.CouponRestCliet;

@RestController
@RequestMapping(value = "/fooditem-api", produces = { MediaType.APPLICATION_JSON_VALUE,
		MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
				MediaType.APPLICATION_XML_VALUE })
public class FoodItemsController {
	@Autowired
	private com.application.service.FoodItemsService FoodItemsService;
	// @Autowired
	// private RestTemplate restTemplate;
	@Autowired
	private CouponRestCliet couponRestCliet;

	@GetMapping("/fooditem/{itemId}")
	public ResponseEntity<FoodItemsDto> getItemId(@PathVariable("itemId") int itemId) {
		return new ResponseEntity<>(FoodItemsService.getItemId(itemId), HttpStatus.OK);
	}

	@GetMapping("/fooditems")
	public ResponseEntity<List<FoodItemsDto>> getAllFoodItems() {
		return new ResponseEntity<>(FoodItemsService.getAllFoodItems(), HttpStatus.OK);
	}

	@PostMapping("/fooditem")
	public ResponseEntity<FoodItemsDto> insertFoodItems(@RequestBody FoodItemsDto foodItemsDto) {
		// return new ResponseEntity<>(FoodItemsService.insertFoodItems(foodItemsDto),
		// HttpStatus.CREATED);

		// ResponseEntity<Coupon> coupon = restTemplate
		// .getForEntity("http://COUPON-SERVICE/coupon/code"+foodItemsDto.getCouponCode(),
		// Coupon.class);

		CouponDto coupon = couponRestCliet.getCoupon(foodItemsDto.getCouponCode());

		// int discount = coupon.getBody().getCouponDiscount();

		foodItemsDto.setFooditemCost(foodItemsDto.getFooditemCost() - coupon.getCouponDiscount());
		return new ResponseEntity<>(FoodItemsService.insertFoodItems(foodItemsDto), HttpStatus.CREATED);
	}

	@PutMapping("/fooditem/{itemId}")
	public ResponseEntity<String> updateFoodItems(@PathVariable("itemId") int itemId,
			@RequestBody FoodItemsDto foodItemsDto) {
		FoodItemsService.updateFoodItems(itemId, foodItemsDto);
		return new ResponseEntity<String>("Item updated Successfully", HttpStatus.OK);
	}

	@DeleteMapping("/fooditem/{itemId}")
	public ResponseEntity<String> deleteFoodItems(@PathVariable("itemId") int itemId) {
		FoodItemsService.deleteFoodItems(itemId);
		return new ResponseEntity<String>("Item Deleted Successfull..!!!", HttpStatus.OK);
	}

}
