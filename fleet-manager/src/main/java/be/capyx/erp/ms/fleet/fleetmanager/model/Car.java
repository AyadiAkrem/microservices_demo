package be.capyx.erp.ms.fleet.fleetmanager.model;

public class Car {

    private final String registrationNumber;

    public Car(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
}
