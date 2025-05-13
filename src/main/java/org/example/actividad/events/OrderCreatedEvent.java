package org.example.actividad.events;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class OrderCreatedEvent {
    private final Long orderId;
    private final String email;
    private final String products;
}

