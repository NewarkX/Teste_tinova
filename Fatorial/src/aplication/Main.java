package aplication;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n,fatorial = 1;

        System.out.println("Qual número deseja calcular o fatorial?");
        n = input.nextInt();

        if (n >= 0) {
            for (int i = 1; i <= n; i++) {
                fatorial = fatorial * i;
            }
            System.out.println("O fatorial é: " + fatorial);
        } else{
            System.out.println("Informe números apartir de 0");
        }

        input.close();
    }
}
