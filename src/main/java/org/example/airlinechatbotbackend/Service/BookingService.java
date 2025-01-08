package org.example.airlinechatbotbackend.Service;

import org.example.airlinechatbotbackend.domain.dto.BookingResponse;

import java.util.List;

public interface BookingService {

    List<BookingResponse> getBookings();

    List<BookingResponse> getAvailableBookings();

    BookingResponse getBookingByBookingNumber(Long bookingNumber, String firstName, String lastName, Integer customerId);

    void cancelBooking(Long bookingNumber, String firstName, String lastName, Integer customerId);

    void reserveBooking(Long bookingNumber, String firstName, String lastName);
}
