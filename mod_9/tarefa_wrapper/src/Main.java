import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int valorPrimitivo = scanner.nextInt();

        Integer valorWrapper = Integer.valueOf(valorPrimitivo);

        System.out.println("Valor no tipo wrapper: " + valorWrapper);

        scanner.close();
    }
}

