package com.saxo.assignment.publisher;

import com.saxo.assignment.notification.Notification;

/**
 * Publish the notification to the consumer
 *
 */
public interface Publisher {
	
	/**
	 * @param notification
	 * This method is responsible for publishing the event
	 */
	void publish(Notification notification);
}
