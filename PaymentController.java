package com.data.controller;

import com.data.service.PaymentService;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public ResponseEntity<Charge> processPayment(@RequestBody PaymentRequest paymentRequest) throws Exception {
        try {
            Charge charge = paymentService.processPayment(paymentRequest.getToken(), paymentRequest.getAmount());
            return ResponseEntity.ok(charge);
        } catch (StripeException e) {
            return ResponseEntity.status(500).body(null);
        }
    }
}

class PaymentRequest {
    private String token;
    private double amount;
	public String getToken() {
		// TODO Auto-generated method stub
		return null;
	}
	public double getAmount() {
		// TODO Auto-generated method stub
		return 0;
	}

    // Getters and Setters
}
