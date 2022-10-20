import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        double valor, juros, tempo, rendimento, total;
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o valor inicial investido em R$: ");
        valor = ler.nextDouble();

        System.out.println("Informe o juros ao mês em %: ");
        juros = ler.nextDouble();

        System.out.println("Informe o tempo em meses que o dinheiro ficará investido:");
        tempo = ler.nextDouble();

        System.out.println(valor + " reais, " + juros + "% de juros ao mês por " + tempo + " meses.");

        total = valor;

        for (int i = 1; i <= tempo; i++) {
            rendimento = total * (juros / 100);
            total = valor * Math.pow((1 + (juros / 100)), i);
            System.out.printf("Mês " + i + ": Juros: R$ %.2f saldo: R$ %.2f \n", rendimento, total);
        }
    }
}