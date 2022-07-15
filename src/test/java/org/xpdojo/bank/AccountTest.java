package org.xpdojo.bank;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class AccountTest {

    @Test
    public void testBalanceZero() {
        Account account = new Account();
        assertThat(account.getBalance(), is(0));
    }

    @Test
    public void testBalanceDeposit() {
        Account account = new Account();
        account.depositAmount(100);
        account.depositAmount(50);
        assertThat(account.getBalance(), is(150));
    }

    @Test
    public void testBalanceWithdrawal() {
        Account account = new Account();
        account.depositAmount(500);
        assertThat(account.balance, is(500));
        account.withdrawAmount(50);
        assertThat(account.balance, is(450));
    }
}
