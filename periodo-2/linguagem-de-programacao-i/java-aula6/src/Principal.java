import java.util.Scanner;

import exercicios.Ex01;
import exercicios.Ex02;
import exercicios.Ex03;
import exercicios.Ex04;
import exercicios.Ex05;

public class Principal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("\nExercício 1");
            Ex01.maiorDeDoisNumeros(scanner);

            System.out.println("\nExercício 2");
            Ex02.classificarSinal(scanner);

            System.out.println("\nExercício 3");
            Ex03.aprovacaoDoAluno(scanner);

            System.out.println("\nExercício 4");
            Ex04.descontoNaCompra(scanner);

            System.out.println("\nExercício 5");
            Ex05.salarioAumento(scanner);
        }
    }
}
