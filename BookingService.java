package com.data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.data.model.Booking;
import com.data.model.Seat;
import com.data.repository.BookingRepository;
import com.data.repository.SeatRepository;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private SeatRepository seatRepository;

    @Transactional
    public Booking bookSeats(Booking booking) {
        String[] seatNumbers = booking.getSeatNumbers().split(",");
        for (String seatNumber : seatNumbers) {
            Seat seat = seatRepository.findById(Long.parseLong(seatNumber)).orElseThrow(() -> new RuntimeException("Seat not found"));
            if (seat.isBooked()) {
                throw new RuntimeException("Seat already booked");
            }
            seat.setBooked(true);
            seatRepository.save(seat);
        }
        return bookingRepository.save(booking);
    }
}

