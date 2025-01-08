package org.example.airlinechatbotbackend.domain.dto;

import jakarta.validation.constraints.NotBlank;

public record ChatRequest(

        @NotBlank String chatId,
        @NotBlank String message
) {
}
