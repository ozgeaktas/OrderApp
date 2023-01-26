package org.example.dataAccess;

import org.example.entities.Customer;
import org.example.entities.Invoice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InMemoryCustomer implements CustomerDao{
    List<Customer> customers;



    public InMemoryCustomer() {
        customers=new ArrayList<Customer>(){{
            add(new Customer());
            add(new Customer());
            add(new Customer());

        }};

    }



    @Override
    public void add(Customer customer) {
        customers.add(customer);

    }

    @Override
    public List<Customer> getCustomerList() {
        return customers.stream().collect(Collectors.toList());
    }
}
