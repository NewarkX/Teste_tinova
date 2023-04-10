package aplication;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n,soma = 0;

        System.out.println("Qual número deseja saber a soma dos multiplos de 3 ou 5?");
        n = input.nextInt();

        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                soma += i;
            }
        }
        System.out.println("A soma dos multiplos de 3 ou 5 é: " + soma);
        input.close();
    }
}
