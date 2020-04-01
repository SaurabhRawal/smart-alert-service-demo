package com.saxo.assignment.listener;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import com.saxo.assignment.notification.Notification;
import com.saxo.assignment.notification.NotificationType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * This class subscribe to the event bus and is responsible for sending text notification
 *
 */
@Component
public class TextListener {

	private final Logger LOG = LoggerFactory.getLogger(TextListener.class);

    @Autowired
    public TextListener(EventBus eventBus) {
        eventBus.register(this); // register this instance with the event bus so it receives any events
    }

    @Subscribe
    public void onNotificationEvent(Notification notification) {
        if(notification.getNotificationType().equals(NotificationType.TEXT_MESSAGE)) {
            LOG.info("Send Text");
        }
    }
}
