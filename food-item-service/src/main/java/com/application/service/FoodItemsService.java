package com.application.service;

import java.util.List;

import com.application.dto.FoodItemsDto;
import com.application.entity.FoodItems;

public interface FoodItemsService {

	public FoodItemsDto getItemId(int itemId);

	public List<FoodItemsDto> getAllFoodItems();

	public FoodItemsDto insertFoodItems(FoodItemsDto foodItemsDto);

	public void updateFoodItems(int itemId, FoodItemsDto foodItemsDto);

	public void deleteFoodItems(int itemId);

	
}
