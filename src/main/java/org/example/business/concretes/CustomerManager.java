package org.example.business;

import org.example.dataAccess.abstracts.CustomerDao;
import org.example.entities.Customer;

import java.util.List;

public class CustomerManager implements CustomerService{
    private CustomerDao customerDao;

    public CustomerManager(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public void add(Customer customer) {
        customerDao.add(customer);
    }

    @Override
    public List<Customer> getCustomerList() {
        return customerDao.getCustomerList();
    }
}
