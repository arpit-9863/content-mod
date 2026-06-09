package com.arpit.contentmod.notifications;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("subscribers")
public record Subscriber(@Id Long id, String email) {}
