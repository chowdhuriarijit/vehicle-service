package com.example.vehicleservice.exception;

public class VehicleNotFoundException extends RuntimeException {
    public VehicleNotFoundException(String registrationNumber) {
        super("Vehicle not found for registration number: " + registrationNumber);
    }
}
