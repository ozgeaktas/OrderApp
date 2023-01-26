package org.example.dataAccess;

import org.example.entities.Customer;

import java.util.List;

public interface CustomerDao {
    public void add(Customer customer);
    public List<Customer>  getCustomerList();
}
