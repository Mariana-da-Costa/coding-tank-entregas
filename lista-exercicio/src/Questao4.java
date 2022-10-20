import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        String valor;
        if (args.length == 0) {
            Scanner ler = new Scanner(System.in);
            System.out.println("Número inválido de argumentos, é esperado que seja informado um número");
            System.out.println("Informe um número: ");
            valor = ler.nextLine();
            args[0] = valor;
        } else if (args.length == 1) {
            String saida = (Integer.parseInt(args[0]) % 2 == 0) ? "PAR" : "IMPAR";
            System.out.println(saida);
        }
    }
}