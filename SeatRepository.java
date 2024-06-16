package com.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.data.model.Seat;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Long> {
}
