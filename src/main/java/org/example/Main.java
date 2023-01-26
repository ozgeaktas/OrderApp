package org.example;

import org.example.business.concretes.CustomerManager;
import org.example.business.concretes.InvoiceManager;
import org.example.dataAccess.concretes.InMemoryCustomer;
import org.example.dataAccess.concretes.InMemoryInvoice;
import org.example.entities.Customer;
import org.example.entities.Invoice;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager=new CustomerManager(new InMemoryCustomer());
        InvoiceManager invoiceManager=new InvoiceManager(new InMemoryInvoice());
        List<Customer> customerList=customerManager.getCustomers();
        List<Invoice> invoiceList=invoiceManager.getInvoices();

        Customer customer=new Customer("Pam","Spears", LocalDate.now(),"Retail",new Invoice(750,LocalDate.of(2020,6,15)), new Invoice(100,LocalDate.now()));
        //add new customer.
        customerManager.add(customer);
        System.out.println("\n" + "Customer list");
        for(Customer customer1:customerList){
            System.out.println("Name: "+customer1.getName()+" Surname: "+customer1.getSurname()+" Registration Date: "+customer1.getRegistrationDate()+ " Sector: "+customer1.getSector()+" Invoices: "+ customer1.getInvoices());

        }
        System.out.println("\n" + "Invoice list");
        for(Invoice invoice1:invoiceList){
            System.out.println(" Amount: "+invoice1.getAmount()+" Date: "+invoice1.getDate());
        }

        System.out.println("List of customer with the letter 'C' in it:"+customerManager.getCustomerWithC());
        System.out.println("List of the total amount of invoices of customers who registered in June:"+customerManager.getCustomerInJuneTotalInvoice());
        System.out.println("List of 1500TL invoices in the system:"+invoiceManager.getOverAmountInvoices());
        System.out.println("Average of invoices over 1500TL in the system:"+invoiceManager.getAvarageOverAmountInvoices());
        System.out.println("The list of names of customers with invoices under 500TL in the system:"+customerManager.getNameOverInvoices());
        System.out.println("The list of companies with an average of less than 750 invoices for June is in which sector:"+customerManager.getSectorName());






    }
}