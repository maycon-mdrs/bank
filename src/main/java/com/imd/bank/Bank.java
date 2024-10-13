package com.imd.bank;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, Customer> customers = new HashMap<>();

    public void addCustomer(Customer customer) {
        if (customer == null) {
            throw new IllegalArgumentException("Customer cannot be null");
        }
        customers.put(customer.getName(), customer);
    }

    public Customer getCustomer(String name) {
        if (!customers.containsKey(name)) {
            throw new IllegalArgumentException("Customer not found");
        }
        return customers.get(name);
    }

    public void transfer(String fromCustomer, String fromAccount, String toCustomer, String toAccount, double amount) {
        Customer source = getCustomer(fromCustomer);
        Customer destination = getCustomer(toCustomer);

        BankAccount sourceAccount = source.getAccount(fromAccount);
        BankAccount destinationAccount = destination.getAccount(toAccount);

        sourceAccount.transfer(destinationAccount, amount);
    }
}
