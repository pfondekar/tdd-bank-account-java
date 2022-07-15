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


}
