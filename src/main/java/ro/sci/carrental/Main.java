package ro.sci.carrental;

import ro.sci.carrental.calendar.RentalCar;
import ro.sci.carrental.domain.car.Car;
import ro.sci.carrental.domain.car.FuelType;
import ro.sci.carrental.domain.customer.Customer;
import ro.sci.carrental.repository.*;
import ro.sci.carrental.simulations.*;
import ro.sci.carrental.calendar.RentalCarImpl;

import java.util.Date;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;


/**
 * Created by Spidi on 12/06/2017.
 */
public class Main {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.setMake("Audi");
        audi.setModel("A4");
        audi.setSize(1.9f);
        audi.setFuelType(FuelType.DIESEL);
        Car bmw = new Car();
        bmw.setMake("Bmw");
        bmw.setModel("M5");
        bmw.setSize(3.2f);
        bmw.setFuelType(FuelType.DIESEL);
        Car mercedes = new Car();
        mercedes.setMake("Mercedes");
        mercedes.setModel("S500");
        mercedes.setSize(5.0f);
        mercedes.setFuelType(FuelType.BENZINE);


        CarRepositoryImpl carRepository = new CarRepositoryImpl();
        carRepository.add(audi);
        carRepository.add(bmw);
        carRepository.add(mercedes);



        Customer customer1 = new Customer();
        customer1.setFirstName("Teodor");
        customer1.setLastName("Radu");
        Customer customer2 = new Customer();
        customer2.setFirstName("Marinescu");
        customer2.setLastName("Cristian");
        Customer customer3 = new Customer();
        customer3.setFirstName("Strong");
        customer3.setLastName("Abraham");

        CustomerRepositoryImpl customerRepository = new CustomerRepositoryImpl();
        customerRepository.add(customer1);
        customerRepository.add(customer2);
        customerRepository.add(customer3);

        //efectuam cautari masini
        SimulateCars simulateCars = new SimulateCars();
        simulateCars.searches(carRepository);

        //efectuam cautari clienti
        SimulateCustomer simulateCustomer = new SimulateCustomer();
        simulateCustomer.searches(customerRepository);

        //rent a car
        RentalCarImpl rentalCar = new RentalCarImpl();
        rentalCar.pickupTime(audi,customer1, ("2017-07-06, 10:00."));

        //return the car
        RentalCarImpl rentalCar1 = new RentalCarImpl();
        rentalCar1.returnTime(audi, customer1,("2017-07-20, 13:00."));


    }




}
