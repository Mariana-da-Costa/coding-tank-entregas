import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        float nx, total = 0, media;
        Scanner ler = new Scanner(System.in);

        for (int i = 1; i <= 4; i++) {
            System.out.println("Informe a nota da prova " + i + ":");
            nx = ler.nextFloat();
            total = total + nx;
            if (nx > 10 || nx < 0) {
                break;
            } else {
                if (i == 4) {
                    media = total / i;
                    System.out.println("A média do aluno foi: " + media);
                }
            }
        }
    }
}
