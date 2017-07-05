package ro.sci.carrental.simulations;

import ro.sci.carrental.domain.car.Car;
import ro.sci.carrental.repository.CarRepositoryImpl;

/**
 * Created by Spidi on 12/06/2017.
 */
public class SimulateCars {
    public void searches(CarRepositoryImpl carRepository) {
        System.out.println("Lista masinilor din CarRepositoryImpl este: ");
        for (Car car : carRepository.getAll()) {
            System.out.println(car.getMake() + (" ") + car.getModel()+ (", ") +car.getSize()+ (" ") +car.getFuelType());
        }
        System.out.println("_____________________________________");
    }
}
