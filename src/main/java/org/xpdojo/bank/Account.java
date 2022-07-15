package org.xpdojo.bank;

/**
 * Account entity
 */
public class Account {

    Integer balance = 0;

    /**
     * Return account balance
     * @return balance amount
     */
    public Integer getBalance() {
        return balance;
    }

    /**
     * Add deposit amount to existing balance
     * @param amount to be deposited
     */
    public void depositAmount(Integer amount) {
        this.balance += amount;
    }

    /**
     * Withdraw amount from balance
     * @param amount to be withdrawn
     */
    public void withdrawAmount(Integer amount) {
        this.balance -= amount;
    }

}
