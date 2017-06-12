package ro.sci.carrental.repository;

import ro.sci.carrental.calendar.Transaction;

import java.util.List;

/**
 * Created by Spidi on 12/06/2017.
 */
public interface TransactionRepository {

    /**
     * Get all
     */
    List<Transaction> getAll();
    /**
     * Get by
     */
    List<Transaction> getTransactionbyId(int id);
    /**
     * Add
     */
    void add(Transaction transaction);
    /**
     * Add all
     */
    void addAll(List<Transaction> transactions);
    /**
     * Delete
     */
    void delete(Transaction transaction);
    /**
     * Update
     */
    void update(Transaction transaction);

}
