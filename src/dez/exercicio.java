package dez;

import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("Ola! Venha ser nosso cliente!"+ "Diga seu nome por favor");
        String nome =leitor.nextLine();

        System.out.println("Diga seu numero do cartao");
        Double numero_do_cartao = leitor.nextDouble();

        System.out.println("Diga o seu cadastro");
        String cadastro = leitor.next();

        System.out.println("Diga a sua senha");
        Double senha = leitor.nextDouble();

        System.out.println("Diga o seu endereço");
        String endereço = leitor.next();

        leitor.close();


    }
}
