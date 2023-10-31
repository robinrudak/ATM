package org.example;

import java.util.ArrayList;

public class Users {
    ArrayList<Users> userList = new ArrayList<>();
    public String name; // I can create them without a given value,
    private int password = 0; // or I can have a default value for them.
    public int balance = 0;

    public Users(String name, int password, int balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;

    }

    public void PrintInfo(){
        System.out.println("User Name: " + name + " Password: " +
                password + " Balance: " + balance + ".");
    }

}
