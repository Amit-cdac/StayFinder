package com.stayfinder.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stayfinder.entity.HotelReview;

@Repository
public interface HotelReviewDao extends JpaRepository<HotelReview, Integer> {

	List<HotelReview> findByHotelId(int hotelId);
	
}
