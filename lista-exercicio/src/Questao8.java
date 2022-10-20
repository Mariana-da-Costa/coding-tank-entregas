import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        int numero, resultado = 0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe um número: ");
        numero = ler.nextInt();

        for (int i = numero; i >= 0; i--) {
            resultado = resultado + numero;
            numero = numero - 1;
            if (i == 0) {
                System.out.println("Resultado: " + resultado);
            }
        }
    }
}