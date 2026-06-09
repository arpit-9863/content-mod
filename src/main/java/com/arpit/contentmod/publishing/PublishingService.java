package com.arpit.contentmod.publishing;

import com.arpit.contentmod.notifications.NotificationService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class PublishingService {

    private final ContentRepository contentRepository;
    private final NotificationService notificationService;

    public PublishingService(ContentRepository contentRepository, NotificationService notificationService) {
        this.contentRepository = contentRepository;
        this.notificationService = notificationService;
    }

    @Transactional
    public Content publish(String title, String url, ContentType type) {
        var content = contentRepository.save(Content.draft(title, url, type));
        notificationService.notifySubscribers(content);
        return content;
    }

    public Optional<Content> findById(Long id) {
        return contentRepository.findById(id);
    }

    public List<Content> findAll() {
        return contentRepository.findAll();
    }
}
