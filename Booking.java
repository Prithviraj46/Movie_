package com.data.model;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    private Movie movie;
    
    @ManyToOne
    private User user;
    
    private String seatNumbers;
    
    private double totalPrice;

	public String getSeatNumbers() {
		// TODO Auto-generated method stub
		return null;
	}
}
