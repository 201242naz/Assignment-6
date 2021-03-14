package kz.aitu.oop.practice.assignment6.builder.builders;

import kz.aitu.oop.practice.assignment6.builder.cars.CarType;
import kz.aitu.oop.practice.assignment6.builder.components.Engine;
import kz.aitu.oop.practice.assignment6.builder.components.GPSNavigator;
import kz.aitu.oop.practice.assignment6.builder.components.Transmission;
import kz.aitu.oop.practice.assignment6.builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}


