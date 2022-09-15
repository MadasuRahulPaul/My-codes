package com.application.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.dto.FoodItemsDto;
import com.application.entity.FoodItems;
import com.application.repository.FoodItemsRepository;

@Service
public class FoodItemsServiceImpl implements FoodItemsService {
	@Autowired
	private FoodItemsRepository foodItemsRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public FoodItemsDto getItemId(int itemId) {
		 FoodItems foodItems = foodItemsRepository.findById(itemId).get();
		 return modelMapper.map(foodItems, FoodItemsDto.class);
	}

	@Override
	public List<FoodItemsDto> getAllFoodItems() {
		List<FoodItemsDto> listOfFoodItemsDto = new ArrayList<>();
		List<FoodItems> foodItems = foodItemsRepository.findAll();
		for(FoodItems foodItems1: foodItems) {
			listOfFoodItemsDto.add(modelMapper.map(foodItems1, FoodItemsDto.class));
		}
		return listOfFoodItemsDto;
	}

	@Override
	public FoodItemsDto insertFoodItems(FoodItemsDto foodItemsDto) {
		FoodItems foodItems = modelMapper.map(foodItemsDto, FoodItems.class);
		FoodItems insertedFoodItems = foodItemsRepository.save(foodItems);
		return modelMapper.map(insertedFoodItems, FoodItemsDto.class);

	}

	@Override
	public void updateFoodItems(int itemId, FoodItemsDto foodItemsDto) {
		FoodItems foodItems = modelMapper.map(foodItemsDto, FoodItems.class);
		 foodItemsRepository.save(foodItems);
		 

	}

	@Override
	public void deleteFoodItems(int itemId) {
		foodItemsRepository.deleteById(itemId);

	}

	

}
