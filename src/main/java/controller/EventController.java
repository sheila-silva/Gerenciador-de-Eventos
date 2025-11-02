package br.com.event.controller;

import br.com.event.service.EventService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/events")
public class EventController {

    private final EventService service;

    public EventController(EventService service) {
        this.service = service;
    }

    @GetMapping("/activities")
    public Object getAllActivities() {
        return service.findAllActivities();
    }
}