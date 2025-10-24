package modulo01_estruturasSequenciais;

import java.util.Scanner;

public class aula05_entradaSaidaDados {
    public static void main(String[] args) {
//        System.out.print("imprime sem pular linha");
//        System.out.println("imprime e pula para a próxima linha");
//        System.out.printf("imprime formatado");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, digite o seu nome: " );
        String nome = scanner.nextLine();
        System.out.println("Nome: " + nome);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Idade: " + idade);

    }
}
