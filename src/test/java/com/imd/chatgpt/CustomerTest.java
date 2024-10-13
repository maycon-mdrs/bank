package com.imd.chatgpt;

import com.imd.bank.BankAccount;
import com.imd.bank.Customer;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CustomerTest {
    private Customer customer;
    private BankAccount account;

    @Before
    public void setUp() {
        customer = new Customer("John Doe");
        account = new BankAccount("12345", 1000);
        customer.addAccount(account);
    }

    @Test
    public void testAddAccount() {
        assertEquals(1, customer.getAccounts().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddNullAccount() {
        customer.addAccount(null);
    }

    @Test
    public void testGetAccount() {
        BankAccount retrievedAccount = customer.getAccount("12345");
        assertEquals("12345", retrievedAccount.getAccountNumber());
        assertEquals(1000, retrievedAccount.getBalance(), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetNonExistentAccount() {
        customer.getAccount("67890");
    }

    @Test
    public void testGetCustomerName() {
        assertEquals("John Doe", customer.getName());
    }
}

