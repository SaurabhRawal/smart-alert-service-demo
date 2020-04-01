package com.saxo.assignment.publisher;

import com.google.common.eventbus.EventBus;
import com.saxo.assignment.notification.Notification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * This the implementation class for publisher which is used to publish the event on the bus 
 *
 */
@Component
public class GuavaEventPublishser implements Publisher {

    private EventBus eventBus;

    @Autowired
    public GuavaEventPublishser(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    @Override
    public void publish(Notification notification){
        eventBus.post(notification);
    }
}
