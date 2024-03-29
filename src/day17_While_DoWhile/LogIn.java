package day17_While_DoWhile;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        String username= "Cydeo",
                password="Cydeo123";

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username:");
        String username2= scan.next();
        System.out.println("Enter your password:");
        String password2= scan.next();
        if((username.equals(username2)&& password.equals(password2)) ){
            System.out.println("Logged in");
        }else {
            int attempt = 3;

            while (!(username.equals(username2) && password.equals(password2)) && attempt > 0) {

                System.out.println("Incorrect username or password. Please re-enter:");
                System.out.println("Enter your username:");
                username2 = scan.next();
                System.out.println("Enter your password:");
                password2 = scan.next();
                attempt--;


            }if (username.equals(username2)&& password.equals(password2)){
                System.out.println("Logged in");
            }else {
                System.out.println("Your account is locked.");
            }
        }


    }
}
/*
you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123
        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts
                to enter correct credentials and if all three attempts are failed, then print "Your account is locked."
 */