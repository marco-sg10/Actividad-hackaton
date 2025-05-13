package org.example.actividad.listeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.event.EventListener;
import org.example.actividad.events.OrderCreatedEvent;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class EmailNotificationListener {
    private static final Logger logger = LogManager.getLogger(EmailNotificationListener.class);
    @Async
    @EventListener
    public void handleOrderCreated(OrderCreatedEvent event) {
        logger.info("📧 Enviando correo de confirmación para la orden ID: {}", event.getOrderId());
    }
}
