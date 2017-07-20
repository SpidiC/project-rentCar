package ro.sci.carrental.calendar;

import ro.sci.carrental.domain.car.Car;
import ro.sci.carrental.domain.customer.Customer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by Spidi on 12/06/2017.
 */
public class RentalCarImpl implements RentalCar{

    private String startDate;
    private String endDate;


    public void pickupTime(Car car, Customer customer, String date) {
        this.startDate = date;
        System.out.println("Automobilul " + car.getMake() + (" ") + car.getModel() + " va fi ridicat de catre clientul "
                + customer.getFirstName() +(" ")+ customer.getLastName() + " in data de: " + date);
        car.setReserved(true);
    }


    public void returnTime(Car car, Customer customer, String date) {
        this.endDate = date;
        System.out.println("Automobilul " +car.getMake() + (" ") + car.getModel()+ " va fi inapoiat de catre clientul " +
                 customer.getFirstName()+(" ")+customer.getLastName()+ " in data de: " + date);
        car.setReserved(false);
    }

    public int getNumberOfDays() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        int rez = 0;
        try {
            Date date1 = format.parse(this.startDate);
            Date date2 = format.parse(this.endDate);
            long diff = date2.getTime() - date1.getTime();
            return (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public void calculatePrice (Car car, RentalCar rentalCar) {
        System.out.println("Pretul pt masina : " );
//        for (Car caluclate : car.setCalculatePricePerDays() {
            System.out.println( car.getCalculatePricePerDays() * getNumberOfDays());
        System.out.println("____________");
    }

}
