package ro.sci.carrental.service;

import ro.sci.carrental.domain.customer.Customer;

import java.util.List;

/**
 * Created by Spidi on 12/06/2017.
 */
public interface CustomerService {
    /**
     * Find customers by last name.
     * @param lastName
     * @return
     */
    List<Customer> findCustomerByLastName(String lastName);

    /**
     * Find customers by full name.
     * @param firstName
     * @param lastName
     * @return
     */
    List<Customer> findCustomerByFullName(String firstName, String lastName);

    /**
     * Find customers by telephone.
     * @param telephone
     * @return
     */
    List<Customer> findCustomerByTelephone(String telephone);
}
