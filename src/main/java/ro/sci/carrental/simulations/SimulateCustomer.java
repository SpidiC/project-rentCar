package ro.sci.carrental.simulations;

import ro.sci.carrental.domain.customer.Customer;
import ro.sci.carrental.repository.CustomerRepositoryImpl;

/**
 * Created by Spidi on 12/06/2017.
 */
public class SimulateCustomer {
    public void searches(CustomerRepositoryImpl customerRepository) {

        //cautarea tuturor clientilor
        System.out.println("Lista clientilor din sistem este: ");
        for (Customer customer : customerRepository.getAll()) {
            System.out.println(customer.getLastName());
        }
        System.out.println("_____________________________________");
    }
}
