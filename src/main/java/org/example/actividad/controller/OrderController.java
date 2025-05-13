package org.example.actividad.controller;

import lombok.RequiredArgsConstructor;
import org.example.actividad.events.OrderCreatedEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {
    private final ApplicationEventPublisher eventPublisher;

    @PostMapping
    @Async
    public CompletableFuture<ResponseEntity<Void>> createOrder(@RequestParam Long orderId,
                                                               @RequestParam String email,
                                                               @RequestParam String products) {
        eventPublisher.publishEvent(new OrderCreatedEvent(orderId, email, products));
        return CompletableFuture.completedFuture(ResponseEntity.ok().build());
    }

}