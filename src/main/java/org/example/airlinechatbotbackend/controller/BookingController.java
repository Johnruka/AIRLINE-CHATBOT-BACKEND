package org.example.airlinechatbotbackend.controller;

import org.example.airlinechatbotbackend.Service.BookingService;
import org.example.airlinechatbotbackend.domain.dto.BookingRequest;
import org.example.airlinechatbotbackend.domain.dto.BookingResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
@CrossOrigin(origins = "http://localhost:5173")
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping
    public List<BookingResponse> getBookings() {
        return bookingService.getBookings();
    }


    // Reserve a booking
    @PostMapping("/reserve")
    public String reserveBooking(@RequestBody BookingRequest bookingRequest) {
        bookingService.reserveBooking(
                bookingRequest.bookingNumber(),
                bookingRequest.firstName(),
                bookingRequest.lastName()
        );
        return "Booking " + bookingRequest.bookingNumber() + " has been successfully reserved.";
    }

    // Cancel a booking
    @PostMapping("/cancel")
    public String cancelBooking(@RequestBody BookingRequest bookingRequest) {
        bookingService.cancelBooking(
                bookingRequest.bookingNumber(),
                bookingRequest.firstName(),
                bookingRequest.lastName(),
                bookingRequest.customerId()
        );
        return "Booking " + bookingRequest.bookingNumber() + " has been successfully canceled.";
    }
}
