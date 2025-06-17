package com.example.vehicleservice.service;

import com.example.vehicleservice.exception.VehicleNotFoundException;
import com.example.vehicleservice.model.VehicleInfo;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class VehicleService {

    private static final Map<String, VehicleInfo> VEHICLE_DATA = new HashMap<>();

    static {
        VehicleInfo v1 = new VehicleInfo();
        v1.setRegistrationNumber("TEST123");
        v1.setMake("Toyota");
        v1.setModel("Corolla");
        v1.setColor("Blue");
        v1.setYear(2020);
        v1.setFuelType("Petrol");
        v1.setEnginePower(132);
        VEHICLE_DATA.put("TEST123", v1);

        VehicleInfo v2 = new VehicleInfo();
        v2.setRegistrationNumber("TEST456");
        v2.setMake("Tesla");
        v2.setModel("Model 3");
        v2.setColor("Red");
        v2.setYear(2022);
        v2.setFuelType("Electric");
        v2.setEnginePower(283);
        VEHICLE_DATA.put("TEST456", v2);
    }

    public VehicleInfo getVehicleByRegistration(String registrationNumber) {
        VehicleInfo vehicle = VEHICLE_DATA.get(registrationNumber);
        if (vehicle == null) {
            throw new VehicleNotFoundException(registrationNumber);
        }
        return vehicle;
    }
}
