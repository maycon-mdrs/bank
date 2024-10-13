package com.imd;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest22 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        com.imd.bank.Customer customer1 = new com.imd.bank.Customer("");
        java.lang.Class<?> wildcardClass2 = customer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.imd.bank.Bank bank0 = new com.imd.bank.Bank();
        com.imd.bank.Customer customer2 = new com.imd.bank.Customer("");
        bank0.addCustomer(customer2);
        // The following exception was thrown during execution in test generation
        try {
            bank0.transfer("hi!", "hi!", "hi!", "", (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer not found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.imd.bank.Customer customer1 = new com.imd.bank.Customer("");
        com.imd.bank.BankAccount bankAccount2 = null;
        // The following exception was thrown during execution in test generation
        try {
            customer1.addAccount(bankAccount2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.imd.bank.Customer customer1 = new com.imd.bank.Customer("");
        // The following exception was thrown during execution in test generation
        try {
            com.imd.bank.BankAccount bankAccount3 = customer1.getAccount("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account not found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.imd.bank.Bank bank0 = new com.imd.bank.Bank();
        // The following exception was thrown during execution in test generation
        try {
            bank0.transfer("", "hi!", "", "", (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer not found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.imd.bank.Customer customer1 = new com.imd.bank.Customer("");
        // The following exception was thrown during execution in test generation
        try {
            com.imd.bank.BankAccount bankAccount3 = customer1.getAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account not found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.imd.bank.Bank bank0 = new com.imd.bank.Bank();
        com.imd.bank.Customer customer2 = new com.imd.bank.Customer("");
        bank0.addCustomer(customer2);
        com.imd.bank.BankAccount bankAccount4 = null;
        // The following exception was thrown during execution in test generation
        try {
            customer2.addAccount(bankAccount4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.imd.bank.Bank bank0 = new com.imd.bank.Bank();
        // The following exception was thrown during execution in test generation
        try {
            com.imd.bank.Customer customer2 = bank0.getCustomer("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer not found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.imd.bank.Bank bank0 = new com.imd.bank.Bank();
        com.imd.bank.Customer customer2 = new com.imd.bank.Customer("");
        bank0.addCustomer(customer2);
        // The following exception was thrown during execution in test generation
        try {
            com.imd.bank.BankAccount bankAccount5 = customer2.getAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account not found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.imd.bank.Customer customer1 = new com.imd.bank.Customer("");
        java.util.List<com.imd.bank.BankAccount> bankAccountList2 = customer1.getAccounts();
        java.lang.String str3 = customer1.getName();
        com.imd.bank.BankAccount bankAccount4 = null;
        // The following exception was thrown during execution in test generation
        try {
            customer1.addAccount(bankAccount4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bankAccountList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.imd.bank.Bank bank0 = new com.imd.bank.Bank();
        com.imd.bank.Customer customer2 = new com.imd.bank.Customer("");
        bank0.addCustomer(customer2);
        // The following exception was thrown during execution in test generation
        try {
            bank0.transfer("", "hi!", "hi!", "", (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer not found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.imd.bank.Customer customer1 = new com.imd.bank.Customer("");
        java.lang.String str2 = customer1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.imd.bank.Customer customer1 = new com.imd.bank.Customer("");
        java.util.List<com.imd.bank.BankAccount> bankAccountList2 = customer1.getAccounts();
        // The following exception was thrown during execution in test generation
        try {
            com.imd.bank.BankAccount bankAccount4 = customer1.getAccount("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account not found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bankAccountList2);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.imd.bank.Bank bank0 = new com.imd.bank.Bank();
        com.imd.bank.Customer customer2 = new com.imd.bank.Customer("");
        bank0.addCustomer(customer2);
        com.imd.bank.Customer customer5 = bank0.getCustomer("");
        // The following exception was thrown during execution in test generation
        try {
            bank0.transfer("hi!", "", "hi!", "", (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer not found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(customer5);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.imd.bank.BankAccount bankAccount2 = new com.imd.bank.BankAccount("hi!", (double) 0.0f);
        bankAccount2.deposit((double) 100);
        java.lang.String str5 = bankAccount2.getAccountNumber();
        // The following exception was thrown during execution in test generation
        try {
            bankAccount2.withdraw((double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Withdrawal amount must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.imd.bank.BankAccount bankAccount2 = new com.imd.bank.BankAccount("hi!", (double) 0.0f);
        com.imd.bank.BankAccount bankAccount5 = new com.imd.bank.BankAccount("hi!", (double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            bankAccount2.transfer(bankAccount5, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Withdrawal amount must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.imd.bank.Bank bank0 = new com.imd.bank.Bank();
        com.imd.bank.Customer customer2 = new com.imd.bank.Customer("");
        bank0.addCustomer(customer2);
        java.lang.String str4 = customer2.getName();
        com.imd.bank.BankAccount bankAccount7 = new com.imd.bank.BankAccount("hi!", (double) 0.0f);
        customer2.addAccount(bankAccount7);
        // The following exception was thrown during execution in test generation
        try {
            bankAccount7.withdraw((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Insufficient balance");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.imd.bank.Bank bank0 = new com.imd.bank.Bank();
        com.imd.bank.Customer customer2 = new com.imd.bank.Customer("");
        bank0.addCustomer(customer2);
        java.lang.String str4 = customer2.getName();
        com.imd.bank.BankAccount bankAccount7 = new com.imd.bank.BankAccount("hi!", (double) 0.0f);
        customer2.addAccount(bankAccount7);
        java.util.List<com.imd.bank.BankAccount> bankAccountList9 = customer2.getAccounts();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(bankAccountList9);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.imd.bank.Customer customer1 = new com.imd.bank.Customer("");
        java.util.List<com.imd.bank.BankAccount> bankAccountList2 = customer1.getAccounts();
        // The following exception was thrown during execution in test generation
        try {
            com.imd.bank.BankAccount bankAccount4 = customer1.getAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account not found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bankAccountList2);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.imd.bank.BankAccount bankAccount2 = new com.imd.bank.BankAccount("", 10.0d);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.imd.bank.BankAccount bankAccount2 = new com.imd.bank.BankAccount("hi!", (double) 0.0f);
        java.lang.String str3 = bankAccount2.getAccountNumber();
        com.imd.bank.BankAccount bankAccount6 = new com.imd.bank.BankAccount("hi!", (double) 0.0f);
        bankAccount6.deposit((double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            bankAccount2.transfer(bankAccount6, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Insufficient balance");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.imd.bank.Bank bank0 = new com.imd.bank.Bank();
        com.imd.bank.Customer customer2 = new com.imd.bank.Customer("");
        bank0.addCustomer(customer2);
        com.imd.bank.Customer customer5 = bank0.getCustomer("");
        com.imd.bank.Bank bank6 = new com.imd.bank.Bank();
        com.imd.bank.Customer customer8 = new com.imd.bank.Customer("");
        bank6.addCustomer(customer8);
        com.imd.bank.Customer customer11 = bank6.getCustomer("");
        bank0.addCustomer(customer11);
        com.imd.bank.Bank bank13 = new com.imd.bank.Bank();
        com.imd.bank.Customer customer15 = new com.imd.bank.Customer("");
        bank13.addCustomer(customer15);
        com.imd.bank.Customer customer18 = bank13.getCustomer("");
        com.imd.bank.Bank bank19 = new com.imd.bank.Bank();
        com.imd.bank.Customer customer21 = new com.imd.bank.Customer("");
        bank19.addCustomer(customer21);
        java.util.List<com.imd.bank.BankAccount> bankAccountList23 = customer21.getAccounts();
        bank13.addCustomer(customer21);
        bank0.addCustomer(customer21);
        com.imd.bank.Customer customer27 = bank0.getCustomer("");
        org.junit.Assert.assertNotNull(customer5);
        org.junit.Assert.assertNotNull(customer11);
        org.junit.Assert.assertNotNull(customer18);
        org.junit.Assert.assertNotNull(bankAccountList23);
        org.junit.Assert.assertNotNull(customer27);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.imd.bank.Bank bank0 = new com.imd.bank.Bank();
        com.imd.bank.Customer customer2 = new com.imd.bank.Customer("");
        bank0.addCustomer(customer2);
        com.imd.bank.Customer customer5 = bank0.getCustomer("");
        com.imd.bank.Customer customer7 = new com.imd.bank.Customer("");
        java.util.List<com.imd.bank.BankAccount> bankAccountList8 = customer7.getAccounts();
        java.lang.String str9 = customer7.getName();
        java.lang.String str10 = customer7.getName();
        bank0.addCustomer(customer7);
        java.lang.String str12 = customer7.getName();
        org.junit.Assert.assertNotNull(customer5);
        org.junit.Assert.assertNotNull(bankAccountList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.imd.bank.Bank bank0 = new com.imd.bank.Bank();
        com.imd.bank.Customer customer2 = new com.imd.bank.Customer("");
        bank0.addCustomer(customer2);
        java.lang.String str4 = customer2.getName();
        java.lang.String str5 = customer2.getName();
        // The following exception was thrown during execution in test generation
        try {
            com.imd.bank.BankAccount bankAccount7 = customer2.getAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account not found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.imd.bank.BankAccount bankAccount2 = new com.imd.bank.BankAccount("hi!", (double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            bankAccount2.withdraw(1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Insufficient balance");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.imd.bank.Customer customer1 = new com.imd.bank.Customer("");
        java.util.List<com.imd.bank.BankAccount> bankAccountList2 = customer1.getAccounts();
        java.util.List<com.imd.bank.BankAccount> bankAccountList3 = customer1.getAccounts();
        java.util.List<com.imd.bank.BankAccount> bankAccountList4 = customer1.getAccounts();
        java.util.List<com.imd.bank.BankAccount> bankAccountList5 = customer1.getAccounts();
        org.junit.Assert.assertNotNull(bankAccountList2);
        org.junit.Assert.assertNotNull(bankAccountList3);
        org.junit.Assert.assertNotNull(bankAccountList4);
        org.junit.Assert.assertNotNull(bankAccountList5);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.imd.bank.BankAccount bankAccount2 = new com.imd.bank.BankAccount("hi!", (double) 0.0f);
        bankAccount2.deposit((double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            bankAccount2.deposit((double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Deposit amount must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.imd.bank.BankAccount bankAccount2 = new com.imd.bank.BankAccount("hi!", (double) 0.0f);
        java.lang.String str3 = bankAccount2.getAccountNumber();
        bankAccount2.deposit((double) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.imd.bank.Customer customer1 = new com.imd.bank.Customer("");
        java.util.List<com.imd.bank.BankAccount> bankAccountList2 = customer1.getAccounts();
        java.lang.String str3 = customer1.getName();
        // The following exception was thrown during execution in test generation
        try {
            com.imd.bank.BankAccount bankAccount5 = customer1.getAccount("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account not found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bankAccountList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.imd.bank.BankAccount bankAccount2 = new com.imd.bank.BankAccount("", 1.0d);
        double double3 = bankAccount2.getBalance();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.imd.bank.Customer customer1 = new com.imd.bank.Customer("");
        java.util.List<com.imd.bank.BankAccount> bankAccountList2 = customer1.getAccounts();
        java.lang.String str3 = customer1.getName();
        java.lang.String str4 = customer1.getName();
        java.lang.Class<?> wildcardClass5 = customer1.getClass();
        org.junit.Assert.assertNotNull(bankAccountList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.imd.bank.Bank bank0 = new com.imd.bank.Bank();
        com.imd.bank.Customer customer2 = new com.imd.bank.Customer("");
        bank0.addCustomer(customer2);
        java.util.List<com.imd.bank.BankAccount> bankAccountList4 = customer2.getAccounts();
        // The following exception was thrown during execution in test generation
        try {
            com.imd.bank.BankAccount bankAccount6 = customer2.getAccount("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account not found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bankAccountList4);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.imd.bank.BankAccount bankAccount2 = new com.imd.bank.BankAccount("hi!", (double) (byte) 1);
        com.imd.bank.BankAccount bankAccount5 = new com.imd.bank.BankAccount("hi!", (double) 0.0f);
        bankAccount5.deposit((double) 100);
        bankAccount5.deposit((double) 'a');
        double double10 = bankAccount5.getBalance();
        // The following exception was thrown during execution in test generation
        try {
            bankAccount2.transfer(bankAccount5, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Insufficient balance");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 197.0d + "'", double10 == 197.0d);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.imd.bank.BankAccount bankAccount2 = new com.imd.bank.BankAccount("hi!", (double) (byte) 1);
        com.imd.bank.BankAccount bankAccount5 = new com.imd.bank.BankAccount("hi!", (double) 0.0f);
        bankAccount5.deposit((double) 100);
        java.lang.String str8 = bankAccount5.getAccountNumber();
        java.lang.String str9 = bankAccount5.getAccountNumber();
        // The following exception was thrown during execution in test generation
        try {
            bankAccount2.transfer(bankAccount5, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Withdrawal amount must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.imd.bank.BankAccount bankAccount2 = new com.imd.bank.BankAccount("hi!", (double) 0.0f);
        java.lang.String str3 = bankAccount2.getAccountNumber();
        com.imd.bank.BankAccount bankAccount6 = new com.imd.bank.BankAccount("hi!", (double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            bankAccount2.transfer(bankAccount6, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Withdrawal amount must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.imd.bank.Bank bank0 = new com.imd.bank.Bank();
        com.imd.bank.Customer customer2 = new com.imd.bank.Customer("");
        bank0.addCustomer(customer2);
        com.imd.bank.Customer customer5 = bank0.getCustomer("");
        com.imd.bank.Bank bank6 = new com.imd.bank.Bank();
        com.imd.bank.Customer customer8 = new com.imd.bank.Customer("");
        bank6.addCustomer(customer8);
        java.lang.String str10 = customer8.getName();
        bank0.addCustomer(customer8);
        com.imd.bank.BankAccount bankAccount12 = null;
        // The following exception was thrown during execution in test generation
        try {
            customer8.addAccount(bankAccount12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(customer5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.imd.bank.Bank bank0 = new com.imd.bank.Bank();
        com.imd.bank.Customer customer2 = new com.imd.bank.Customer("");
        bank0.addCustomer(customer2);
        com.imd.bank.Customer customer5 = bank0.getCustomer("");
        // The following exception was thrown during execution in test generation
        try {
            bank0.transfer("hi!", "", "hi!", "hi!", (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer not found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(customer5);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.imd.bank.Bank bank0 = new com.imd.bank.Bank();
        com.imd.bank.Customer customer2 = new com.imd.bank.Customer("");
        bank0.addCustomer(customer2);
        com.imd.bank.BankAccount bankAccount6 = new com.imd.bank.BankAccount("hi!", (double) 0.0f);
        bankAccount6.deposit((double) 1L);
        double double9 = bankAccount6.getBalance();
        customer2.addAccount(bankAccount6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.imd.bank.Bank bank0 = new com.imd.bank.Bank();
        com.imd.bank.Customer customer2 = new com.imd.bank.Customer("");
        bank0.addCustomer(customer2);
        com.imd.bank.Customer customer5 = bank0.getCustomer("");
        com.imd.bank.Bank bank6 = new com.imd.bank.Bank();
        com.imd.bank.Customer customer8 = new com.imd.bank.Customer("");
        bank6.addCustomer(customer8);
        java.lang.String str10 = customer8.getName();
        bank0.addCustomer(customer8);
        java.lang.String str12 = customer8.getName();
        org.junit.Assert.assertNotNull(customer5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.imd.bank.Bank bank0 = new com.imd.bank.Bank();
        com.imd.bank.Customer customer2 = new com.imd.bank.Customer("");
        bank0.addCustomer(customer2);
        java.lang.String str4 = customer2.getName();
        java.util.List<com.imd.bank.BankAccount> bankAccountList5 = customer2.getAccounts();
        // The following exception was thrown during execution in test generation
        try {
            com.imd.bank.BankAccount bankAccount7 = customer2.getAccount("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account not found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(bankAccountList5);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.imd.bank.Bank bank0 = new com.imd.bank.Bank();
        com.imd.bank.Customer customer2 = new com.imd.bank.Customer("");
        bank0.addCustomer(customer2);
        com.imd.bank.Customer customer5 = bank0.getCustomer("");
        com.imd.bank.Bank bank6 = new com.imd.bank.Bank();
        com.imd.bank.Customer customer8 = new com.imd.bank.Customer("");
        bank6.addCustomer(customer8);
        com.imd.bank.Customer customer11 = bank6.getCustomer("");
        bank0.addCustomer(customer11);
        com.imd.bank.Bank bank13 = new com.imd.bank.Bank();
        com.imd.bank.Customer customer15 = new com.imd.bank.Customer("");
        bank13.addCustomer(customer15);
        com.imd.bank.Customer customer18 = bank13.getCustomer("");
        bank0.addCustomer(customer18);
        org.junit.Assert.assertNotNull(customer5);
        org.junit.Assert.assertNotNull(customer11);
        org.junit.Assert.assertNotNull(customer18);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.imd.bank.BankAccount bankAccount2 = new com.imd.bank.BankAccount("hi!", (double) 0.0f);
        bankAccount2.deposit((double) 100);
        java.lang.String str5 = bankAccount2.getAccountNumber();
        java.lang.String str6 = bankAccount2.getAccountNumber();
        double double7 = bankAccount2.getBalance();
        double double8 = bankAccount2.getBalance();
        double double9 = bankAccount2.getBalance();
        com.imd.bank.BankAccount bankAccount12 = new com.imd.bank.BankAccount("hi!", (double) 0.0f);
        bankAccount12.deposit((double) 1L);
        double double15 = bankAccount12.getBalance();
        bankAccount12.deposit((double) 1);
        // The following exception was thrown during execution in test generation
        try {
            bankAccount2.transfer(bankAccount12, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Withdrawal amount must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.imd.bank.BankAccount bankAccount2 = new com.imd.bank.BankAccount("hi!", (double) 0.0f);
        bankAccount2.deposit((double) 100);
        bankAccount2.deposit((double) '4');
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        com.imd.bank.Customer customer1 = new com.imd.bank.Customer("hi!");
        java.util.List<com.imd.bank.BankAccount> bankAccountList2 = customer1.getAccounts();
        java.lang.Class<?> wildcardClass3 = customer1.getClass();
        org.junit.Assert.assertNotNull(bankAccountList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        com.imd.bank.BankAccount bankAccount2 = new com.imd.bank.BankAccount("hi!", (double) 0.0f);
        bankAccount2.deposit((double) 100);
        java.lang.String str5 = bankAccount2.getAccountNumber();
        java.lang.String str6 = bankAccount2.getAccountNumber();
        com.imd.bank.BankAccount bankAccount9 = new com.imd.bank.BankAccount("", (double) '#');
        bankAccount9.deposit((double) 1L);
        bankAccount2.transfer(bankAccount9, (double) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        com.imd.bank.BankAccount bankAccount2 = new com.imd.bank.BankAccount("hi!", (double) 0.0f);
        bankAccount2.deposit((double) 100);
        double double5 = bankAccount2.getBalance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        com.imd.bank.BankAccount bankAccount2 = new com.imd.bank.BankAccount("hi!", (double) 0.0f);
        bankAccount2.deposit(10.0d);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        com.imd.bank.BankAccount bankAccount2 = new com.imd.bank.BankAccount("", (double) (short) 0);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        com.imd.bank.Bank bank0 = new com.imd.bank.Bank();
        com.imd.bank.Customer customer2 = new com.imd.bank.Customer("");
        bank0.addCustomer(customer2);
        com.imd.bank.Customer customer5 = bank0.getCustomer("");
        com.imd.bank.Bank bank6 = new com.imd.bank.Bank();
        com.imd.bank.Customer customer8 = new com.imd.bank.Customer("");
        bank6.addCustomer(customer8);
        java.lang.String str10 = customer8.getName();
        com.imd.bank.BankAccount bankAccount13 = new com.imd.bank.BankAccount("hi!", (double) 0.0f);
        customer8.addAccount(bankAccount13);
        customer5.addAccount(bankAccount13);
        double double16 = bankAccount13.getBalance();
        double double17 = bankAccount13.getBalance();
        org.junit.Assert.assertNotNull(customer5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        com.imd.bank.Bank bank0 = new com.imd.bank.Bank();
        com.imd.bank.Customer customer2 = new com.imd.bank.Customer("");
        bank0.addCustomer(customer2);
        com.imd.bank.Customer customer5 = bank0.getCustomer("");
        com.imd.bank.Bank bank6 = new com.imd.bank.Bank();
        com.imd.bank.Customer customer8 = new com.imd.bank.Customer("");
        bank6.addCustomer(customer8);
        com.imd.bank.Customer customer11 = bank6.getCustomer("");
        bank0.addCustomer(customer11);
        com.imd.bank.Bank bank13 = new com.imd.bank.Bank();
        com.imd.bank.Customer customer15 = new com.imd.bank.Customer("");
        bank13.addCustomer(customer15);
        java.lang.String str17 = customer15.getName();
        java.lang.String str18 = customer15.getName();
        bank0.addCustomer(customer15);
        org.junit.Assert.assertNotNull(customer5);
        org.junit.Assert.assertNotNull(customer11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        com.imd.bank.Bank bank0 = new com.imd.bank.Bank();
        com.imd.bank.Customer customer2 = new com.imd.bank.Customer("");
        bank0.addCustomer(customer2);
        com.imd.bank.Customer customer5 = bank0.getCustomer("");
        com.imd.bank.Bank bank6 = new com.imd.bank.Bank();
        com.imd.bank.Customer customer8 = new com.imd.bank.Customer("");
        bank6.addCustomer(customer8);
        java.util.List<com.imd.bank.BankAccount> bankAccountList10 = customer8.getAccounts();
        bank0.addCustomer(customer8);
        com.imd.bank.Bank bank12 = new com.imd.bank.Bank();
        com.imd.bank.Customer customer14 = new com.imd.bank.Customer("");
        bank12.addCustomer(customer14);
        com.imd.bank.Customer customer17 = bank12.getCustomer("");
        com.imd.bank.Bank bank18 = new com.imd.bank.Bank();
        com.imd.bank.Customer customer20 = new com.imd.bank.Customer("");
        bank18.addCustomer(customer20);
        com.imd.bank.Customer customer23 = bank18.getCustomer("");
        bank12.addCustomer(customer23);
        com.imd.bank.Bank bank25 = new com.imd.bank.Bank();
        com.imd.bank.Customer customer27 = new com.imd.bank.Customer("");
        bank25.addCustomer(customer27);
        com.imd.bank.Customer customer30 = bank25.getCustomer("");
        com.imd.bank.Bank bank31 = new com.imd.bank.Bank();
        com.imd.bank.Customer customer33 = new com.imd.bank.Customer("");
        bank31.addCustomer(customer33);
        java.util.List<com.imd.bank.BankAccount> bankAccountList35 = customer33.getAccounts();
        bank25.addCustomer(customer33);
        bank12.addCustomer(customer33);
        bank0.addCustomer(customer33);
        com.imd.bank.Customer customer40 = new com.imd.bank.Customer("hi!");
        java.lang.String str41 = customer40.getName();
        bank0.addCustomer(customer40);
        org.junit.Assert.assertNotNull(customer5);
        org.junit.Assert.assertNotNull(bankAccountList10);
        org.junit.Assert.assertNotNull(customer17);
        org.junit.Assert.assertNotNull(customer23);
        org.junit.Assert.assertNotNull(customer30);
        org.junit.Assert.assertNotNull(bankAccountList35);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        com.imd.bank.Bank bank0 = new com.imd.bank.Bank();
        com.imd.bank.Customer customer2 = new com.imd.bank.Customer("");
        bank0.addCustomer(customer2);
        com.imd.bank.Customer customer5 = bank0.getCustomer("");
        com.imd.bank.Bank bank6 = new com.imd.bank.Bank();
        com.imd.bank.Customer customer8 = new com.imd.bank.Customer("");
        bank6.addCustomer(customer8);
        java.lang.String str10 = customer8.getName();
        com.imd.bank.BankAccount bankAccount13 = new com.imd.bank.BankAccount("hi!", (double) 0.0f);
        customer8.addAccount(bankAccount13);
        customer5.addAccount(bankAccount13);
        java.lang.Class<?> wildcardClass16 = customer5.getClass();
        org.junit.Assert.assertNotNull(customer5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        com.imd.bank.Bank bank0 = new com.imd.bank.Bank();
        com.imd.bank.Customer customer2 = new com.imd.bank.Customer("");
        bank0.addCustomer(customer2);
        com.imd.bank.Customer customer5 = bank0.getCustomer("");
        com.imd.bank.Customer customer7 = new com.imd.bank.Customer("");
        java.util.List<com.imd.bank.BankAccount> bankAccountList8 = customer7.getAccounts();
        java.lang.String str9 = customer7.getName();
        java.lang.String str10 = customer7.getName();
        bank0.addCustomer(customer7);
        // The following exception was thrown during execution in test generation
        try {
            bank0.transfer("hi!", "hi!", "", "", (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer not found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(customer5);
        org.junit.Assert.assertNotNull(bankAccountList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        com.imd.bank.BankAccount bankAccount2 = new com.imd.bank.BankAccount("", 100.0d);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        com.imd.bank.BankAccount bankAccount2 = new com.imd.bank.BankAccount("hi!", (double) 0.0f);
        bankAccount2.deposit((double) 1L);
        double double5 = bankAccount2.getBalance();
        bankAccount2.deposit((double) 1);
        double double8 = bankAccount2.getBalance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.0d + "'", double8 == 2.0d);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        com.imd.bank.BankAccount bankAccount2 = new com.imd.bank.BankAccount("hi!", (double) 0.0f);
        bankAccount2.deposit((double) 100);
        java.lang.String str5 = bankAccount2.getAccountNumber();
        // The following exception was thrown during execution in test generation
        try {
            bankAccount2.withdraw(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Withdrawal amount must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        com.imd.bank.BankAccount bankAccount2 = new com.imd.bank.BankAccount("hi!", 0.0d);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        com.imd.bank.Bank bank0 = new com.imd.bank.Bank();
        com.imd.bank.Customer customer2 = new com.imd.bank.Customer("");
        bank0.addCustomer(customer2);
        com.imd.bank.Customer customer5 = bank0.getCustomer("");
        com.imd.bank.Bank bank6 = new com.imd.bank.Bank();
        com.imd.bank.Customer customer8 = new com.imd.bank.Customer("");
        bank6.addCustomer(customer8);
        java.util.List<com.imd.bank.BankAccount> bankAccountList10 = customer8.getAccounts();
        bank0.addCustomer(customer8);
        com.imd.bank.Bank bank12 = new com.imd.bank.Bank();
        com.imd.bank.Customer customer14 = new com.imd.bank.Customer("");
        bank12.addCustomer(customer14);
        com.imd.bank.Customer customer17 = bank12.getCustomer("");
        com.imd.bank.Bank bank18 = new com.imd.bank.Bank();
        com.imd.bank.Customer customer20 = new com.imd.bank.Customer("");
        bank18.addCustomer(customer20);
        com.imd.bank.Customer customer23 = bank18.getCustomer("");
        bank12.addCustomer(customer23);
        com.imd.bank.Bank bank25 = new com.imd.bank.Bank();
        com.imd.bank.Customer customer27 = new com.imd.bank.Customer("");
        bank25.addCustomer(customer27);
        com.imd.bank.Customer customer30 = bank25.getCustomer("");
        com.imd.bank.Bank bank31 = new com.imd.bank.Bank();
        com.imd.bank.Customer customer33 = new com.imd.bank.Customer("");
        bank31.addCustomer(customer33);
        java.util.List<com.imd.bank.BankAccount> bankAccountList35 = customer33.getAccounts();
        bank25.addCustomer(customer33);
        bank12.addCustomer(customer33);
        bank0.addCustomer(customer33);
        com.imd.bank.Bank bank39 = new com.imd.bank.Bank();
        com.imd.bank.Customer customer41 = new com.imd.bank.Customer("");
        bank39.addCustomer(customer41);
        java.lang.String str43 = customer41.getName();
        java.util.List<com.imd.bank.BankAccount> bankAccountList44 = customer41.getAccounts();
        bank0.addCustomer(customer41);
        org.junit.Assert.assertNotNull(customer5);
        org.junit.Assert.assertNotNull(bankAccountList10);
        org.junit.Assert.assertNotNull(customer17);
        org.junit.Assert.assertNotNull(customer23);
        org.junit.Assert.assertNotNull(customer30);
        org.junit.Assert.assertNotNull(bankAccountList35);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(bankAccountList44);
    }
}

