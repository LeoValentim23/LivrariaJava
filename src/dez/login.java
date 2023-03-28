package dez;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner log= new Scanner(System.in);

        System.out.println("Login:");
        String login =  log.next();

        System.out.println("senha:");
        String senha = log.next();

       log.close();

    }
}
