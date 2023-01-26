package org.example.dataAccess.abstracts;

import org.example.entities.Customer;

import java.util.List;
import java.util.Map;

public interface CustomerDao {
    public void add(Customer customer);
    public List<Customer>  getCustomers();
    public List<Customer>  getCustomerWithC();
    public double getCustomerInJuneTotalInvoice();
    public List<String> getNameOverInvoices();
    public Map<String, List<Customer>> getSectorName();

}
