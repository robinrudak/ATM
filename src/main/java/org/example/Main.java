package org.example;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        UserHandler UserHandler = new UserHandler();
        ASCIIArtService ASCIIArtService = new ASCIIArtService();
        System.out.println("---------------------------------");
        ASCIIArtService.art();
        System.out.println("---------------------------------");
        System.out.println("Welcome to Robins ATM\nPlease log in");
        Menu Menu = new Menu();
        Menu.MenuLogin ();
        Menu.Menu();
        System.out.println();
    }
}


//Users test = UserHandler.getUsers(1);