package com.saxo.assignment.aop;

import com.saxo.assignment.notification.Notification;
import com.saxo.assignment.notification.NotificationType;
import com.saxo.assignment.publisher.GuavaEventPublishser;
import com.saxo.assignment.publisher.Publisher;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * This is a Aspect for the portfoliorService methods action and 
 * On basis of join points it calls the publisher to publish the event on the event bus
 *
 */
@Aspect
@Component
public class NotificationAspect {
	
	private final Logger LOG = LoggerFactory.getLogger(NotificationAspect.class);

	Publisher publisher;

    @Autowired
	public NotificationAspect(GuavaEventPublishser guavaEventPublishser) {
		this.publisher = guavaEventPublishser;
	}

    @AfterReturning("com.saxo.assignment.aop.CommonJoinPointConfig.emailNotificationPointCut()")
    public void emailNotificationComposer() {
		LOG.info("sending email notification");
		Notification notification = Notification.builder()
				.notificationType(NotificationType.EMAIL)
				.deliveryAddress("saurabh.rawal@nagarro.com")
				.message("Message For email Notification").build();
		publisher.publish(notification);
    }
	
	@AfterReturning("com.saxo.assignment.aop.CommonJoinPointConfig.pushMessageNotificationPointCut()")
    public void pushNotificationComposer() {
		LOG.info("sending push notification");
		Notification notification = Notification.builder()
				.notificationType(NotificationType.PUSH_MESSAGE)
				.message("Message for push Notification").build();
		publisher.publish(notification);
    }
	
	@AfterReturning("com.saxo.assignment.aop.CommonJoinPointConfig.textNotificationPointCut()")
    public void TextNotificationComposer() {
		LOG.info("sending text notification");
		Notification notification = Notification.builder()
				.notificationType(NotificationType.TEXT_MESSAGE)
				.deliveryAddress("1234567890")
				.message("Message for Text Notification").build();
		publisher.publish(notification);
    }
}
