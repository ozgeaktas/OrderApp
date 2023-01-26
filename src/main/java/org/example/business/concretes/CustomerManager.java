package org.example.business.concretes;

import org.example.dataAccess.abstracts.CustomerDao;
import org.example.entities.Customer;

import java.util.List;
import java.util.Map;

public class CustomerManager {
    //dependency injection
    private CustomerDao customerDao;

    public CustomerManager(CustomerDao customerDao) {

        this.customerDao = customerDao;
    }

    public void add(Customer customer) {
        customerDao.add(customer);
    }

    public List<Customer> getCustomers() {
        return customerDao.getCustomers();
    }
    public List<Customer>  getCustomerWithC(){
        return customerDao.getCustomerWithC();
    }
    public double getCustomerInJuneTotalInvoice(){
        return customerDao.getCustomerInJuneTotalInvoice();
    }
    public List<String> getNameOverInvoices(){
        return customerDao.getNameOverInvoices();
    }
    public Map<String, List<Customer>> getSectorName(){
        return customerDao.getSectorName();
    }
}
