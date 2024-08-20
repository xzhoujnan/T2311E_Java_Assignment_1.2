
package com.model;

public class Person {
    private String name;
    private String email;
    private String mobile;
    private Wallet wallet;

    public Person() {
        this.name = "";
        this.email = "";
        this.mobile = "";
        this.wallet = new Wallet();
    }

    public Person(String name, String email, String mobile, int amount) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.wallet = new Wallet(amount);
    }

    public Person(int amount) {
        this.name = "";
        this.email = "";
        this.mobile = "";
        this.wallet = new Wallet(amount);
    }
    /*
    getters & setters
     */
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public int getBalance(){
        return wallet.getBalance();
    }
    public Boolean checkBalanceAvailability(int amount){
        return amount <= wallet.getBalance();
    }

    /**
     * The method of calculation of the total bill
     * @param bills bills of people
     * @return total value of all bill
     */
    public int calcTotal(int[] bills) {
        int result = 0;
        for (int i : bills){
            result += i;
        }
        return result;
    }

    /**
     * The method of user pay
     * @param total value of all bill
     */
    public Boolean payMoney(int total) {
        return wallet.pay(total);
    }

    /**
     * The person's wallet*/
    protected static class Wallet {
        /**
         * money in wallet
         */
        private int amount;

        public Wallet() {
            this.amount = 0;
        }

        public Wallet(int amount){
            this.amount = amount;
        }

        public int getBalance(){
            return amount;
        }

        /**
         * Add (amount) money to wallet
         * @param amount amount of money to be added
         * @return transaction status
         */
        public Boolean deposit(int amount) {
            this.amount += amount;
            return true;
        }


        public Boolean pay(int amount) {
            if (this.amount >= amount) {
                this.amount -= amount;
                return true;
            } else {
                return false;
            }
        }
    }
}
