import java.util.Arrays;
import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        int numero, nota, media = 0;
        Scanner ler = new Scanner(System.in);

        System.out.println("Quantas notas deseja informar? ");
        numero = ler.nextInt();

        Integer[] notas = new Integer[numero];

        for (int i = 0; i < numero; i++) {
            System.out.println("Informe a nota da prova " + (i + 1));
            nota = ler.nextInt();
            notas[i] = nota;
        }

        if (notas.length > 0) {
            Arrays.sort(notas);

            for (int j = 0; j < notas.length; j++) {
                media = media + notas[j];
            }

            System.out.println("A menor nota é: " + notas[0]);
            System.out.println("A maior nota é: " + notas[notas.length - 1]);
            System.out.println("A média das notas é: " + media / notas.length);
        }
    }
}