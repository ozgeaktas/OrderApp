package org.example.dataAccess.concretes;

import org.example.dataAccess.abstracts.InvoiceDao;
import org.example.entities.Invoice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InMemoryInvoice implements InvoiceDao {
    //this class replaces the fake-database.
    List<Invoice> invoices;

    public InMemoryInvoice() {
        invoices=new ArrayList<Invoice>(){{
            add(new Invoice(100, LocalDate.now()));
            add(new Invoice(2200,LocalDate.now()));
            add(new Invoice(1600,LocalDate.now()));
        }};
    }

    //List of invoices
    public List<Invoice> getInvoices() {
        return this.invoices;

    }


    //List of invoices over 1500
    @Override
    public List<Invoice> getOverAmountInvoices() {
        return invoices.stream().filter(invoice -> invoice.getAmount() >1500).collect(Collectors.toList());
    }

    //average of invoices over 1500
    @Override
    public double getAvarageOverAmountInvoices() {
        return invoices.stream().filter(invoice -> invoice.getAmount() >1500).mapToDouble(Invoice::getAmount).average().orElse(0);
    }
}
