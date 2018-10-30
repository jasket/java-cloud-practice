package ru.avanin.cloud.practiceconfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.context.scope.refresh.RefreshScopeRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicLong;

@Component
public class RefreshListener {
    private final static Logger LOGGER = LoggerFactory.getLogger(RefreshListener.class);

    private final AtomicLong counter = new AtomicLong(0);

    @EventListener
    public void refresh(RefreshScopeRefreshedEvent e) {
        LOGGER.info("Refresh configuration: "
                + this.counter.incrementAndGet()
                + " times");
    }
}
