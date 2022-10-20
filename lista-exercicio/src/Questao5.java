import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        int valor1, valor2;

        if (args.length == 0) {
            Scanner ler = new Scanner(System.in);
            System.out.printf("Informe o primeiro número: ");
            valor1 = Integer.parseInt(ler.nextLine());
            System.out.printf("Informe o segundo número: ");
            valor2 = Integer.parseInt(ler.nextLine());
        } else if (args.length == 1) {
            Scanner ler = new Scanner(System.in);
            System.out.printf("Informe o segundo valor: ");
            valor1 = Integer.parseInt(args[0]);
            valor2 = Integer.parseInt(ler.nextLine());
        } else if (args.length == 2) {
            valor1 = Integer.parseInt(args[0]);
            valor2 = Integer.parseInt(args[1]);
        } else {
            System.out.println("Número esperado inválido");
            return;
        }

        System.out.printf("Soma dos valores = " + (valor1 + valor2) + "\n");
    }
}