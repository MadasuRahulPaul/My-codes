package com.application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.dto.FoodItemsDto;
import com.application.entity.FoodItems;
@Repository
public interface FoodItemsRepository extends JpaRepository<FoodItems, Integer>{
	



}
