import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        float temp1, temp2;
        Scanner ler = new Scanner(System.in);

        System.out.print("Temperatura 1 em graus celsius: ");
        temp1 = ler.nextFloat();

        System.out.print("Temperatura 2 em graus celsius: ");
        temp2 = ler.nextFloat();

        System.out.printf("Temperatura 1: %.0f°C são %.0f°F \n", temp1, calcular(temp1));
        System.out.printf("Temperatura 2: %.0f°C são %.0f°F \n", temp2, calcular(temp2));
    }

    public static Float calcular(float temp) {
        return ((temp * (9 / 5)) + 32);
    }
}