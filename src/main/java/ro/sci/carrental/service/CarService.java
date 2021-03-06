package ro.sci.carrental.service;

import ro.sci.carrental.domain.car.Car;

import java.util.List;

/**
 * Created by Spidi on 12/06/2017.
 */
public interface CarService {
    /**
     * Find same make cars in system.
     * @param make Car make
     * @return List<Car>
     */
    List<Car> findCarsByMake(String make);

    /**
     * Find same make and model cars in system.
     * @param make
     * @param model
     * @return List<Car>
     */
    List<Car> findCarsByMakeAndModel(String make, String model);

    /**
     * Find same make, model, color and seats cars in system.
     * @param make
     * @param model
     * @param color
     * @param seats
     * @return List<Car>
     */
    List<Car> findCarsByMakeModelColorAndSeats(String make, String model, String color, int seats);
}

