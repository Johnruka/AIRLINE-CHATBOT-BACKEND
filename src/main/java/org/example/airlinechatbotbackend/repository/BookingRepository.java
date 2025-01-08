package org.example.airlinechatbotbackend.repository;

import org.example.airlinechatbotbackend.domain.entity.Booking;
import org.example.airlinechatbotbackend.domain.entity.BookingStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

    // Method to find a booking by booking number and customer details
    Optional<Booking> findByBookingNumberAndCustomer_FirstNameAndCustomer_LastNameAndCustomer_Id(
            Long bookingNumber, String firstName, String lastName, Integer customerId);

    // Retrieve available or reserved bookings based on status
    List<Booking> findByBookingStatus(BookingStatus bookingStatus);

    // Method to find a booking by booking number and booking status
    Optional<Booking> findByBookingNumberAndBookingStatus(Long bookingNumber, BookingStatus bookingStatus);

    // Method to find a booking by booking number
    Optional<Booking> findByBookingNumber(Long bookingNumber);

    // Method to find all bookings associated with a particular customer
    List<Booking> findByCustomer_Id(Integer customerId);
}
