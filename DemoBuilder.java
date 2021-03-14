package kz.aitu.oop.practice.assignment6.builder;

import kz.aitu.oop.practice.assignment6.builder.builders.CarBuilder;
import kz.aitu.oop.practice.assignment6.builder.builders.CarManualBuilder;
import kz.aitu.oop.practice.assignment6.builder.cars.Car;
import kz.aitu.oop.practice.assignment6.builder.cars.Manual;
import kz.aitu.oop.practice.assignment6.builder.director.Director;

public class DemoBuilder {

    public static void main() {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }

}