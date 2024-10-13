package com.imd.chatgpt;

import com.imd.bank.BankAccount;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {
    private BankAccount account;

    @Before
    public void setUp() {
        account = new BankAccount("12345", 1000);
    }

    @Test
    public void testDeposit() {
        account.deposit(500);
        assertEquals(1500, account.getBalance(), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDepositNegativeAmount() {
        account.deposit(-100);
    }

    @Test
    public void testWithdraw() {
        account.withdraw(200);
        assertEquals(800, account.getBalance(), 0.01);
    }

    @Test(expected = IllegalStateException.class)
    public void testWithdrawInsufficientBalance() {
        account.withdraw(1500);
    }

    @Test
    public void testTransfer() {
        BankAccount destination = new BankAccount("67890", 500);
        account.transfer(destination, 300);
        assertEquals(700, account.getBalance(), 0.01);
        assertEquals(800, destination.getBalance(), 0.01);  // This should fail due to the introduced bug
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTransferToNullAccount() {
        account.transfer(null, 300);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithdrawNegativeAmount() {
        account.withdraw(-100);
    }
}