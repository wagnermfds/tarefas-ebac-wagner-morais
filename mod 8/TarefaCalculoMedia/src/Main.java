import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();

        double soma = nota1 + nota2 + nota3 + nota4;
        double media = soma / 4;

        System.out.println("A média das notas é: " + media);

        scanner.close();
    }
}
