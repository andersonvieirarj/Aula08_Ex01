import java.util.Arrays;
import java.util.Scanner;

public class ExercicioVetor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] valoresInteiros = new int[10];
        double media = 0;
        double soma = 0;
        int i;

        System.out.println("Digite dez valores inteiros: ");

        for (i = 0; i < valoresInteiros.length; i++) {
            valoresInteiros[i] = input.nextInt();
        }
        media = soma / i;
        System.out.println("A soma dos numeros digitados é: " + soma);
        System.out.println("a média dos numeros digitas é: " + media);

        Arrays.sort(valoresInteiros);
        System.out.println("Numeros em ordem crescente:");
        for (double d : valoresInteiros) {
            System.out.println(d);
        }
    }
}