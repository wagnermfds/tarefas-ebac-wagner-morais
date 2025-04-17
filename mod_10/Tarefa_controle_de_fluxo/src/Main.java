import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler =  new Scanner(System.in);
    System.out.print ("Insira a primeira nota:");
    double nota1 = ler.nextDouble();

    System.out.println("Sua primeira nota foi " + nota1 + " qual a próxima nota?");
    double nota2 = ler.nextDouble();

    System.out.println("Sua notas foram " + nota1 + " e " + nota2 + " qual a próxima nota?");
    double nota3 = ler.nextDouble();

    System.out.println("Agora insira sua última nota");
    double nota4 = ler.nextDouble();

    double MEDIA = (nota1 + nota2+ nota3 +nota4)/4;

    if (MEDIA >= 7) {
        System.out.println("Parabéns, sua média foi " + MEDIA + " você foi aprovado!");
    }   else if (MEDIA >=5) {
        System.out.print("Sua média foi " + MEDIA + " você se encontra de recuperação!");
    }   else {
        System.out.println("Sua média foi " + MEDIA + " Você foi reprovado!");
    }

    }

}