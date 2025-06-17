package com.example.vehicleservice.model;

public class VehicleInfo {
    private String registrationNumber;
    private String make;
    private String model;
    private String color;
    private int year;
    private String fuelType;
    private int enginePower;

    // Getters and Setters
    public String getRegistrationNumber() { 
        return registrationNumber; 
    }
    public void setRegistrationNumber(String registrationNumber) { 
        this.registrationNumber = registrationNumber; 
    }

    public String getMake() { 
        return make; 
    }
    public void setMake(String make) { 
        this.make = make; 
    }

    public String getModel() { 
        return model; 
    }
    public void setModel(String model) { 
        this.model = model; 
    }

    public String getColor() { 
        return color; 
    }
    public void setColor(String color) { 
        this.color = color; 
    }

    public int getYear() { 
        return year; 
    }
    public void setYear(int year) { 
        this.year = year; 
    }

    public String getFuelType() { 
        return fuelType; 
    }
    public void setFuelType(String fuelType) { 
        this.fuelType = fuelType; 
    }

    public int getEnginePower() { 
        return enginePower; 
    }
    public void setEnginePower(int enginePower) { 
        this.enginePower = enginePower; 
    }
}
