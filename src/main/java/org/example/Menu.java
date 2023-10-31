package org.example;


import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in); // Scanner to handle our input.
    // List of Person objects. Objects rarely come alone.
    public Users currentUser;
    UserHandler UserHandler = new UserHandler();

    public void MenuLogin() {
        boolean running1 = true;
        while (true) {
            System.out.println("Input Username");//using usernames since I don't have a card reader :P
            String usrName = scanner.nextLine();

            if (usrName.equals("Sven")) {
                System.out.println("Input Pin");
                String password = scanner.nextLine();
                if (password.equals("1234")) {
                    currentUser = UserHandler.getUsers(0);
                    break;
                }
            } else if (usrName.equals("Erik")) {
                System.out.println("Input Pin");
                String password2 = scanner.nextLine();
                if (password2.equals("4321")) {
                    currentUser = UserHandler.getUsers(1);
                    break;
                }} else if (usrName.equals("Berit")) {
                    System.out.println("Input Pin");
                    String password3 = scanner.nextLine();
                    if (password3.equals("1337")) {
                        currentUser = UserHandler.getUsers(2);
                        break;
                    }
                }

        }
    }

    public void Menu() {
        //boolean running = true;
        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Quit");
            String input = scanner.nextLine();
            if (input.equals("1")) {
                CheckBalance();
            } else if (input.equals("2")) {
                Withdraw();
            } else if (input.equals("3")) {
                Deposit();
            } else if (input.equals("4")) {
                break;
            } else {
                System.out.println("Not a valid option");
            }
        }
    }

    private void Deposit() {

        int depositedCash = 0;
        while (true) {
            System.out.println("Insert cash depending on the number");
            System.out.println("1 = 10");
            System.out.println("2 = 50");
            System.out.println("3 = 200");
            System.out.println("4 = 500");
            System.out.println("5 = Done");
            String input = scanner.nextLine().trim();
            if (input.equals("1")) {
                depositedCash += 10;
            } else if (input.equals("2")) {
                depositedCash += 50;
            } else if (input.equals("3")) {
                depositedCash += 200;
            } else if (input.equals("4")) {
                depositedCash += 500;
            } else if (input.equals("5")) {
                currentUser.balance += depositedCash;
                break;
            } else {
                System.out.println("Not a valid option");
            }
        }
    }

    private void Withdraw() {
        try {

            System.out.println("How much money would you like to withdraw?");
            String input = scanner.nextLine();
            int number = Integer.parseInt(input);
            if (currentUser.balance >= number) {
                currentUser.balance -= number;
            } else {
                System.out.println("insufficient Balance");
            }
        } catch (Exception e) {
            Withdraw();
        }


    }

    private void CheckBalance() {
        System.out.println(currentUser.balance);
    }

}
