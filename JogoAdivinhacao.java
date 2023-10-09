import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroSecreto = new Random().nextInt(100);
        int tentativas = 0;

        while(tentativas < 5){
            System.out.println("Digite um número entre 0 e 100");
            int numeroDigitado = leitor.nextInt();
            tentativas++;

            if(numeroSecreto == numeroDigitado) {
                System.out.println("Parabéns! Você acertou!");
                break;
            } else if (numeroSecreto < numeroDigitado) {
                System.out.println("O número secreto é MENOR que o número atual");
            } else if (numeroSecreto > numeroDigitado) {
                System.out.println("O número secreto é MAIOR que o número digitado");
            }

            if(tentativas == 5) {
                System.out.println("Suas tentativas acabaram. O número secreto era " + numeroSecreto);
            }
        }
    }
}
