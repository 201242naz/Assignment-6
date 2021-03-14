package kz.aitu.oop.practice.assignment6.builder.builders;

import kz.aitu.oop.practice.assignment6.builder.builders.Builder;
import kz.aitu.oop.practice.assignment6.builder.cars.Car;
import kz.aitu.oop.practice.assignment6.builder.cars.CarType;
import kz.aitu.oop.practice.assignment6.builder.components.Engine;
import kz.aitu.oop.practice.assignment6.builder.components.GPSNavigator;
import kz.aitu.oop.practice.assignment6.builder.components.Transmission;
import kz.aitu.oop.practice.assignment6.builder.components.TripComputer;

public class CarBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}