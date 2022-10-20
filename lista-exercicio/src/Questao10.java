import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double totalDeJuros = 0, totalAmortizacao = 0;

        System.out.println("Informe o valor do empréstimo: ");
        double valor = ler.nextDouble();
        System.out.println("Informe a taxa de juros do empréstimo: ");
        double taxa = ler.nextDouble() / 100;
        System.out.println("Informe o tempo para pagamento: ");
        int tempo = ler.nextInt();
        double saldo = valor;

        double prestacao = valor * (Math.pow((1 + taxa), tempo) * taxa) / (Math.pow((1 + taxa), tempo) - 1);
        System.out.printf("Valor fixo da parcela R$ %.2f, Saldo devedor total R$ %.2f%n \n", prestacao, valor);

        for (int i = 0; i < tempo; i++) {
            double juros = saldo * taxa;
            double amortizacao = prestacao - juros;
            totalDeJuros = totalDeJuros + juros;
            totalAmortizacao = totalAmortizacao + amortizacao;
            saldo = saldo - amortizacao;

            if (saldo < 0.01) {
                saldo = 0;
            }

            System.out.printf("Parcela %d | Juros: R$ %.2f | Amortização: R$ %.2f | Saldo devedor: R$ %.2f%n", i + 1,
                    juros, amortizacao, saldo);
        }

        System.out.printf("\nTotal: Prestação R$ %.2f, Juros: R$ %.2f, Amortização R$ %.2f", (valor + totalDeJuros),
                totalDeJuros, totalAmortizacao);
    }
}