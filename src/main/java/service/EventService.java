package br.com.event.service;

import org.springframework.stereotype.Service;

@Service
public class EventService {
    private final br.com.event.repository.ActivityRepository activityRepo;
    private final br.com.event.repository.ParticipantRepository participantRepo;
    private final br.com.event.repository.CategoryRepository categoryRepo;
    private final br.com.event.repository.BlockRepository blockRepo;

    public EventService(br.com.event.repository.ActivityRepository a, br.com.event.repository.ParticipantRepository p, br.com.event.repository.CategoryRepository c, br.com.event.repository.BlockRepository b) {
        this.activityRepo = a;
        this.participantRepo = p;
        this.categoryRepo = c;
        this.blockRepo = b;
    }

    public Object findAllActivities() {
        return activityRepo.findAll();
    }
}