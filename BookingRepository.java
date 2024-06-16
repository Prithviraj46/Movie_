package com.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.data.model.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
}
