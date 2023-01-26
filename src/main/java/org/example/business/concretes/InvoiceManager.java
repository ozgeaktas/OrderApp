package org.example.business;

import org.example.dataAccess.abstracts.InvoiceDao;
import org.example.entities.Invoice;

import java.util.List;

public class InvoiceManager {
    InvoiceDao invoiceDao;

    public InvoiceManager(InvoiceDao invoiceDao) {
        this.invoiceDao = invoiceDao;
    }

    public List<Invoice> getInvoices() {
        return invoiceDao.getInvoices();
    }
}
