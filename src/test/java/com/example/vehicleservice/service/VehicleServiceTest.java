package com.example.vehicleservice.service;

import com.example.vehicleservice.exception.VehicleNotFoundException;
import com.example.vehicleservice.model.VehicleInfo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleServiceTest {

    private final VehicleService vehicleService = new VehicleService();

    @Test
    void testGetVehicleByRegistration_ValidRegistration() {
        // Arrange
        String registrationNumber = "TEST123";

        // Act
        VehicleInfo vehicle = vehicleService.getVehicleByRegistration(registrationNumber);

        // Assert
        assertNotNull(vehicle);
        assertEquals("Toyota", vehicle.getMake());
        assertEquals("Corolla", vehicle.getModel());
        assertEquals("Blue", vehicle.getColor());
        assertEquals(2020, vehicle.getYear());
        assertEquals("Petrol", vehicle.getFuelType());
        assertEquals(132, vehicle.getEnginePower());
    }

    @Test
    void testGetVehicleByRegistration_InvalidRegistration() {
        // Arrange
        String invalidRegistrationNumber = "INVALID123";

        // Act & Assert
        assertThrows(VehicleNotFoundException.class, () -> {
            vehicleService.getVehicleByRegistration(invalidRegistrationNumber);
        });
    }
}