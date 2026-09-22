import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("\nExercício 1");
            Ex01.maiorDeDoisNumeros(scanner);

            System.out.println("\nExercício 2");
            Ex02.classificarSinal(scanner);

            System.out.println("\nExercício 3");
            Ex03.aprovacaoDoAluno(scanner);
        }
    }
}
