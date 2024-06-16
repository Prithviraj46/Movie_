package com.data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "seats")
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String seatNumber;
    
    private boolean isBooked;

	public void setBooked(boolean b) {
		// TODO Auto-generated method stub
		
	}

	public boolean isBooked() {
		// TODO Auto-generated method stub
		return false;
	}
}

