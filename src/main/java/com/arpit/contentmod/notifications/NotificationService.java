package com.arpit.contentmod.notifications;

import com.arpit.contentmod.publishing.Content;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    private final SubscriberRepository subscriberRepository;

    public NotificationService(SubscriberRepository subscriberRepository) {
        this.subscriberRepository = subscriberRepository;
    }

    public void notifySubscribers(Content content) {
        subscriberRepository.findAll().forEach(sub ->
                System.out.printf("Notifying %s about: %s%n", sub.email(), content.title())
        );
    }
}
