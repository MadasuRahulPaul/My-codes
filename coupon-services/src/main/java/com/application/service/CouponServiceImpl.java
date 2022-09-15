package com.application.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.application.dto.CouponDto;
import com.application.entity.Coupon;
import com.application.repository.CouponRepository;

@Service
public class CouponServiceImpl implements CouponService {
	@Autowired
	private CouponRepository couponRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public CouponDto getCoupon(int couponId) {

		Coupon coupons = couponRepository.findById(couponId).get(); // Fetching Impl of the Coupon by Coupon Id
		// CouponsDto dto = mapToDto(coupons);

		return modelMapper.map(coupons, CouponDto.class);

		// return dto;
	}

	@Override
	public List<CouponDto> getAllCoupons(int pageNumber, int pageSize) {
		// List<Coupon> listOfCoupons = couponRepository.findAll();
		List<CouponDto> listOfCouponDto = new ArrayList<CouponDto>();

		Page<Coupon> findAll = couponRepository
				.findAll(PageRequest.of(pageNumber, pageSize, Direction.ASC, "couponCode"));
		List<Coupon> content = findAll.getContent();

		for (Coupon coupons : content) {
			// listOfCouponDto.add(mapToDto(coupons));
			listOfCouponDto.add(modelMapper.map(coupons, CouponDto.class));
		}

		return listOfCouponDto;
	}

	@Override
	public CouponDto insertCoupon(CouponDto couponDto) {
		Coupon coupons = modelMapper.map(couponDto, Coupon.class);
		Coupon insertedCoupon = couponRepository.save(coupons);
		return modelMapper.map(insertedCoupon, CouponDto.class);
	}

	@Override
	public void updateCoupon(int couponId, CouponDto couponDto) {
		Coupon coupons = modelMapper.map(couponDto, Coupon.class);
		couponRepository.save(coupons);

	}

	@Override
	public void deleteCoupon(int couponId) {
		couponRepository.deleteById(couponId);

	}

	@Override
	public CouponDto test(String couponCode) {
	Coupon coupons = couponRepository.test(couponCode);
		
	return	modelMapper.map(coupons, CouponDto.class);
		
	}

	@Override
	public List<CouponDto> test1(Double couponDiscount) {
		List<CouponDto> dtos = new ArrayList<>();
		List<Coupon> coupons = couponRepository.test1(couponDiscount);
		for (Coupon coupon : coupons) {
			dtos.add(modelMapper.map(coupons, CouponDto.class));
		}

		return dtos;
	}

	@Override
	public List<CouponDto> test2(String couponCode, int couponDiscount) {

		List<CouponDto> dtos = new ArrayList<>();
		List<Coupon> coupons = couponRepository.test2(couponCode, couponDiscount);

		for (Coupon coupon : coupons) {
			dtos.add(modelMapper.map(coupons, CouponDto.class));
		}

		return dtos;
	}

}
