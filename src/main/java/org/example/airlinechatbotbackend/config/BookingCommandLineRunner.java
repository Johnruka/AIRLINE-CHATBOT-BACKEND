package org.example.airlinechatbotbackend.config;

import org.example.airlinechatbotbackend.domain.entity.Booking;
import org.example.airlinechatbotbackend.repository.BookingRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookingCommandLineRunner implements CommandLineRunner {

    private final BookingRepository bookingRepository;

    public BookingCommandLineRunner(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        // Generate initial bookings using DataInitializer
        List<Booking> bookings = DataInitializer.generateBookings();

        // Save bookings into the database
        bookingRepository.saveAll(bookings);

        System.out.println("Bookings have been initialized and saved to the database.");
    }
}

