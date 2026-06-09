package com.arpit.contentmod.notifications;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriberRepository extends ListCrudRepository<Subscriber, Long> {}
