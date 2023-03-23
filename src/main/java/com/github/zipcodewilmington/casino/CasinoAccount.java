package com.github.zipcodewilmington.casino;



import java.util.Scanner;

/**
 * Created by leon on 7/21/2020.
 * `ArcadeAccount` is registered for each user of the `Arcade`.
 * The `ArcadeAccount` is used to log into the system to select a `Game` to play.
 */
public class CasinoAccount {


    Integer balance;
    String userName;
    String password;
    char input1 = 'Z';
    Scanner input = new Scanner(System.in);

    public CasinoAccount(){}


    public CasinoAccount(String username, String password, Integer balance){
        this.userName = username;
        this.password = password;
        this.balance = balance;

    }

    public void deposit(int deposit){
        this.balance = balance + deposit;
    }
    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public CasinoAccount getAccount(){
        CasinoAccount account = new CasinoAccount(userName, password, balance);
        return account;
    }

    public String toString(){
        return userName + "," + password + "," + balance;
    }

    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }



}

