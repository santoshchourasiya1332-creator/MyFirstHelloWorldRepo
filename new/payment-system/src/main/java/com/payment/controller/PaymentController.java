package com.payment.controller;

import com.payment.model.Payment;
import com.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/initiate")
    public String initiatePayment(@RequestBody Payment payment) {
        return paymentService.processPayment(payment);
    }

    @PostMapping("/confirm")
    public String confirmPayment(@RequestParam String paymentId) {
        return paymentService.validatePayment(paymentId);
    }
}