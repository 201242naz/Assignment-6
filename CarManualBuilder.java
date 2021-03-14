package kz.aitu.oop.practice.assignment6.builder.builders;

import kz.aitu.oop.practice.assignment6.builder.builders.Builder;
import kz.aitu.oop.practice.assignment6.builder.cars.Manual;
import kz.aitu.oop.practice.assignment6.builder.cars.CarType;
import kz.aitu.oop.practice.assignment6.builder.components.Engine;
import kz.aitu.oop.practice.assignment6.builder.components.GPSNavigator;
import kz.aitu.oop.practice.assignment6.builder.components.Transmission;
import kz.aitu.oop.practice.assignment6.builder.components.TripComputer;

public class CarManualBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
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

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}