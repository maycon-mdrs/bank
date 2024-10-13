package com.imd.chatgpt;

import com.imd.bank.Bank;
import com.imd.bank.BankAccount;
import com.imd.bank.Customer;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BankTest {
    private Bank bank;
    private Customer customer1;
    private Customer customer2;
    private BankAccount account1;
    private BankAccount account2;

    @Before
    public void setUp() {
        bank = new Bank();
        customer1 = new Customer("Alice");
        customer2 = new Customer("Bob");
        account1 = new BankAccount("11111", 1000);
        account2 = new BankAccount("22222", 500);

        customer1.addAccount(account1);
        customer2.addAccount(account2);
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);
    }

    @Test
    public void testAddCustomer() {
        assertEquals(customer1, bank.getCustomer("Alice"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddNullCustomer() {
        bank.addCustomer(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetNonExistentCustomer() {
        bank.getCustomer("Charlie");
    }

    @Test
    public void testTransferBetweenCustomers() {
        bank.transfer("Alice", "11111", "Bob", "22222", 300);
        assertEquals(700, account1.getBalance(), 0.01);
        assertEquals(800, account2.getBalance(), 0.01);  // This should fail due to the bug in BankAccount
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTransferToNonExistentCustomer() {
        bank.transfer("Alice", "11111", "Charlie", "33333", 300);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTransferFromNonExistentAccount() {
        bank.transfer("Alice", "33333", "Bob", "22222", 300);
    }
}

