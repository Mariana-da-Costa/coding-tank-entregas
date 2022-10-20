import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        String operacao;
        int n1, n2;
        Scanner ler = new Scanner(System.in);

        System.out.print("Qual operacao deseja fazer? (opcoes: + - / *): ");
        operacao = ler.next();

        switch (operacao) {
            case "+":
                n1 = calcular("primeiro");
                n2 = calcular("segundo");
                System.out.println("Resultado = " + (n1 + n2));
                break;
            case "-":
                n1 = calcular("primeiro");
                n2 = calcular("segundo");
                System.out.println("Resultado = " + (n1 - n2));
                break;
            case "/":
                n1 = calcular("primeiro");
                n2 = calcular("segundo");
                System.out.println("Resultado = " + (n1 / n2));
                break;
            case "*":
                n1 = calcular("primeiro");
                n2 = calcular("segundo");
                System.out.println("Resultado = " + (n1 * n2));
                break;
            default:
                System.out.println("Operacao inválida");
                break;
        }

    }

    public static Integer calcular(String ordem) {
        int n;
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe o " + ordem + " numero: ");
        n = ler.nextInt();
        return n;
    }
}