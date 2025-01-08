package org.example.airlinechatbotbackend.controller;

import org.example.airlinechatbotbackend.Service.AssistantServiceImpl;
import org.example.airlinechatbotbackend.domain.dto.ChatRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/assistant")
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
