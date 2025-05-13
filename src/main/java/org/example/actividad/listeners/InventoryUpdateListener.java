package org.example.actividad.listeners;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.actividad.events.OrderCreatedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class InventoryUpdateListener {
    private static final Logger logger = LogManager.getLogger(InventoryUpdateListener.class);
    @Async
    @EventListener
    public void handleOrderCreated(OrderCreatedEvent event) {
        logger.info("📦 Reducción de stock para los productos: {}", event.getProducts());
    }
}
