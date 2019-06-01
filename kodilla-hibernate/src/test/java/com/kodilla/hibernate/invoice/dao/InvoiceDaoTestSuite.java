package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    ProductDao productDao;

    @Autowired
    ItemDao itemDao;

    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {

        // Given
        Product product1 = new Product("Wheat Beer");
        Product product2 = new Product("Guiness");
        Product product3 = new Product("Honey Beer");
        Product product4 = new Product("White Beer");
        Product product5 = new Product("IPA");

        Item item1 = new Item(product1, new BigDecimal(3), 5);
        Item item2 = new Item(product2, new BigDecimal(5), 4);
        Item item3 = new Item(product3, new BigDecimal(4), 8);
        Item item4 = new Item(product4, new BigDecimal(4), 3);
        Item item5 = new Item(product5, new BigDecimal(5), 2);

        Invoice invoice = new Invoice("FV 2/2019");
        invoice.setItems(Arrays.asList(item1, item2, item3, item4, item5));

        // When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        // Then
        Assert.assertEquals(1, invoiceDao.count());
        Assert.assertNotEquals(0, invoiceId);
        Assert.assertEquals(5, productDao.count());
        Assert.assertEquals(5, itemDao.count());

        // CleanUp
        try {
            productDao.deleteAll();
            itemDao.deleteAll();
            invoiceDao.deleteAll();
        } catch (Exception e) {
            // do nothing
        }

    }
}
