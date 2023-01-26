package org.example.dataAccess.abstracts;

import org.example.entities.Invoice;

import java.util.List;

public interface InvoiceDao {
    public List<Invoice> getInvoices();
    public List<Invoice> getOverAmountInvoices();
    public double getAvarageOverAmountInvoices();


}
