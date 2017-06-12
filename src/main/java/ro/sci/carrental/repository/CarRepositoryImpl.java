package ro.sci.carrental.repository;

import ro.sci.carrental.domain.car.Car;
import ro.sci.carrental.domain.car.FuelType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Spidi on 12/06/2017.
 */

public class CarRepositoryImpl implements CarRepository{

    private List<Car> cars = new ArrayList<Car>();


    public List<Car> getAll() {
        return cars;
    }

    public List<Car> getCarsByMake(String make) { return null; }

    public List<Car> getCarsByFuelType(FuelType fuelType) {
        return null;
    }

    public void add(Car car) {
        cars.add(car);
    }

    public void addAll(List<Car> cars) {
        cars.addAll(cars);
    }

    public void delete(Car car) {
        cars.remove(car);
    }

    public void update(Car car) {
        cars.set(cars.indexOf(car), car);
    }

}
