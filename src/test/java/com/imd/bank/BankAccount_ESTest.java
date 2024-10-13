/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 13 17:12:35 GMT 2024
 */

package com.imd.bank;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BankAccount_ESTest extends BankAccount_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BankAccount bankAccount0 = new BankAccount("_a/pP)7EKd>rQs", 2264.53232);
      bankAccount0.deposit(1500.0);
      bankAccount0.withdraw(1500.0);
      assertEquals(2264.53232, bankAccount0.getBalance(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BankAccount bankAccount0 = new BankAccount("", 1989.85214);
      // Undeclared exception!
      try { 
        bankAccount0.withdraw(0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Withdrawal amount must be positive
         //
         verifyException("com.imd.bank.BankAccount", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BankAccount bankAccount0 = new BankAccount("", 0.0);
      // Undeclared exception!
      try { 
        bankAccount0.deposit(0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Deposit amount must be positive
         //
         verifyException("com.imd.bank.BankAccount", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BankAccount bankAccount0 = new BankAccount("tt!p'eTF>+, _`RS^", 3297.865522171873);
      BankAccount bankAccount1 = new BankAccount("", 3297.865522171873);
      bankAccount0.transfer(bankAccount1, 3297.865522171873);
      double double0 = bankAccount0.getBalance();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BankAccount bankAccount0 = new BankAccount("", (-1562.13367));
      double double0 = bankAccount0.getBalance();
      assertEquals((-1562.13367), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BankAccount bankAccount0 = new BankAccount((String) null, (-159.7));
      bankAccount0.getAccountNumber();
      assertEquals((-159.7), bankAccount0.getBalance(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BankAccount bankAccount0 = new BankAccount("", 3297.865522171873);
      bankAccount0.getAccountNumber();
      assertEquals(3297.865522171873, bankAccount0.getBalance(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BankAccount bankAccount0 = new BankAccount("", 0.0);
      // Undeclared exception!
      try { 
        bankAccount0.transfer(bankAccount0, 1130.64);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Insufficient balance
         //
         verifyException("com.imd.bank.BankAccount", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BankAccount bankAccount0 = new BankAccount("", 0.0);
      // Undeclared exception!
      try { 
        bankAccount0.transfer((BankAccount) null, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Destination account cannot be null
         //
         verifyException("com.imd.bank.BankAccount", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BankAccount bankAccount0 = new BankAccount("3BN5K%`dfWN\u0005", 1713.150142);
      BankAccount bankAccount1 = new BankAccount("3BN5K%`dfWN\u0005", 0.0);
      bankAccount0.transfer(bankAccount1, 1713.150142);
      // Undeclared exception!
      try { 
        bankAccount0.withdraw(1713.150142);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Insufficient balance
         //
         verifyException("com.imd.bank.BankAccount", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BankAccount bankAccount0 = new BankAccount((String) null, 1.0);
      // Undeclared exception!
      try { 
        bankAccount0.withdraw((-2660.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Withdrawal amount must be positive
         //
         verifyException("com.imd.bank.BankAccount", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BankAccount bankAccount0 = new BankAccount("Z+", 531.29);
      // Undeclared exception!
      try { 
        bankAccount0.deposit((-1835.899));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Deposit amount must be positive
         //
         verifyException("com.imd.bank.BankAccount", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BankAccount bankAccount0 = new BankAccount("tt!p'eTF>+, _`RS^", 3297.865522171873);
      bankAccount0.getAccountNumber();
      assertEquals(3297.865522171873, bankAccount0.getBalance(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BankAccount bankAccount0 = new BankAccount("tt!p'eTF>+, _`RS^", 3297.865522171873);
      double double0 = bankAccount0.getBalance();
      assertEquals(3297.865522171873, double0, 0.01);
  }
}
