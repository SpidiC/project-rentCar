package ro.sci.carrental.repository;

import ro.sci.carrental.calendar.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Spidi on 12/06/2017.
 */
public class TransactionRepositoryImpl implements TransactionRepository{

    private List<Transaction> transactions = new ArrayList<Transaction>();

    public List<Transaction> getAll() {
        return null;
    }

    public List<Transaction> getTransactionbyId(int id) {
        return null;
    }

    public void add(Transaction transaction) {

    }

    public void addAll(List<Transaction> transactions) {

    }

    public void delete(Transaction transaction) {

    }

    public void update(Transaction transaction) {

    }
}
