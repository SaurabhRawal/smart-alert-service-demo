# NotificationService

*Design structure for notification service.*

This service is using guava event-bus for publishing the event on event Bus(We could use kafka Queues in place of this event-bus).

Project Flow

1.When ever an method is called from **PortfolioService**, *aop* is implemented to check for the                      execution of the methods.
2.**NotificationAspect** implements the advice and routes and publishes the message using **GuavaEventPublishser** 
3 We have Listener classes listen to the bus and based of **NotificationType** send the notification                      

