package com.example.vehicleservice.controller;

import com.example.vehicleservice.model.VehicleInfo;
import com.example.vehicleservice.service.VehicleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/vehicle")
public class VehicleController {

    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping("/{registrationNumber}")
    public ResponseEntity<VehicleInfo> getVehicle(@PathVariable String registrationNumber) {
        VehicleInfo vehicle = vehicleService.getVehicleByRegistration(registrationNumber);
        if (vehicle != null) {
            return ResponseEntity.ok(vehicle);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
