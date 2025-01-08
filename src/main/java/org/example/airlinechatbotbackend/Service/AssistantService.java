package org.example.airlinechatbotbackend.Service;

import reactor.core.publisher.Flux;

public interface AssistantService {

    Flux<String> reactiveChat(String chatId, String input);
}

