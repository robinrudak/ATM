package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class UserHandler {
    ArrayList<Users> userList = new ArrayList<>();
    public UserHandler() {
        userList.add(new Users("Sven", 1234, 1000));
        userList.add(new Users("Erik", 4321, 5000));
        userList.add(new Users("Berit", 1337, 100));
    }


    public void ListUsers(){
        for(Users Users : userList) {
            Users.PrintInfo();
        }
    }
    public Users getUsers(int i) {
        return userList.get(i);
    }
}
