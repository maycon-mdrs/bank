/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 13 17:07:20 GMT 2024
 */

package com.imd.bank;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.imd.bank.BankAccount;
import com.imd.bank.Customer;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Customer_ESTest extends Customer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Customer customer0 = new Customer((String) null);
      String string0 = customer0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Customer customer0 = new Customer("");
      String string0 = customer0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Customer customer0 = new Customer("jgN.tD/}#0(&E{s");
      BankAccount bankAccount0 = new BankAccount("jgN.tD/}#0(&E{s", 0.0);
      customer0.addAccount(bankAccount0);
      BankAccount bankAccount1 = customer0.getAccount("jgN.tD/}#0(&E{s");
      assertSame(bankAccount1, bankAccount0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Customer customer0 = new Customer("o2t@Br}X..IX-DHK5i");
      BankAccount bankAccount0 = new BankAccount("o2t@Br}X..IX-DHK5i", 2373.07402498);
      customer0.addAccount(bankAccount0);
      BankAccount bankAccount1 = customer0.getAccount("o2t@Br}X..IX-DHK5i");
      assertSame(bankAccount1, bankAccount0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Customer customer0 = new Customer("");
      BankAccount bankAccount0 = new BankAccount("", (-1220.944));
      customer0.addAccount(bankAccount0);
      BankAccount bankAccount1 = customer0.getAccount("");
      assertSame(bankAccount1, bankAccount0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Customer customer0 = new Customer((String) null);
      BankAccount bankAccount0 = new BankAccount((String) null, 836.5860460921012);
      customer0.addAccount(bankAccount0);
      // Undeclared exception!
      try { 
        customer0.getAccount((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Customer customer0 = new Customer((String) null);
      // Undeclared exception!
      try { 
        customer0.addAccount((BankAccount) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Account cannot be null
         //
         verifyException("com.imd.bank.Customer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Customer customer0 = new Customer((String) null);
      BankAccount bankAccount0 = new BankAccount((String) null, (-1.0));
      customer0.addAccount(bankAccount0);
      List<BankAccount> list0 = customer0.getAccounts();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Customer customer0 = new Customer("U ea;");
      // Undeclared exception!
      try { 
        customer0.getAccount("U ea;");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Account not found
         //
         verifyException("com.imd.bank.Customer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Customer customer0 = new Customer((String) null);
      List<BankAccount> list0 = customer0.getAccounts();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Customer customer0 = new Customer("U ea;");
      String string0 = customer0.getName();
      assertEquals("U ea;", string0);
  }
}
