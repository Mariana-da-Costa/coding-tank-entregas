import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        double peso, altura, imc;
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual a sua altura em metros? ");
        altura = Double.parseDouble(ler.nextLine());
        System.out.println("Qual o seu peso em kg? ");
        peso = Double.parseDouble(ler.nextLine());
        imc = peso / (altura * altura);

        if (imc < 17.0) {
            System.out.printf("O valor do seu imc é: %.2f (considerado magreza)", imc);
        } else if (imc <= 18.49 && imc >= 17.0) {
            System.out.printf("O valor do seu imc é: %.2f (considerado abaixo do peso)", imc);
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.printf("O valor do seu imc é: %.2f (considerado peso normal)", imc);
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.printf("O valor do seu imc é: %.2f (considerado acima do peso)", imc);
        } else if (imc >= 30.0 && imc <= 34.99) {
            System.out.printf("O valor do seu imc é: %.2f (considerado obesidade 1)", imc);
        } else if (imc >= 35.0 && imc <= 39.99) {
            System.out.printf("O valor do seu imc é: %.2f (considerado obesidade 2 (severa)", imc);
        } else {
            System.out.printf("O valor do seu imc é: %.2f (considerado obesidade 3 (mórbida)", imc);
        }
    }
}
