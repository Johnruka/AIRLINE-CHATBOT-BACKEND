package org.example.airlinechatbotbackend.controller;

import org.example.airlinechatbotbackend.Service.AssistantServiceImpl;
import org.example.airlinechatbotbackend.domain.dto.ChatRequest;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/assistant")
@CrossOrigin(origins = "http://localhost:5173")
public class AssistantController {

    private final AssistantServiceImpl agent;

    public AssistantController(AssistantServiceImpl agent) {
        this.agent = agent;
    }

    @PostMapping("/reactive/chat")
    public Flux<String> reactiveChat(@RequestBody ChatRequest request) {
        return agent.reactiveChat(request.chatId(), request.message());
    }
}
