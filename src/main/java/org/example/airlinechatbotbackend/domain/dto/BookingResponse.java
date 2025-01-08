package org.example.airlinechatbotbackend.domain.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.example.airlinechatbotbackend.domain.entity.BookingStatus;

import java.time.LocalDate;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record BookingResponse(

        Integer id,
        String firstName,
        String lastName,
        LocalDate date,
        BookingStatus bookingStatus,
        String from,
        String to
) {


}



