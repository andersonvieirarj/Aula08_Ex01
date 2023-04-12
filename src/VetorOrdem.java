import java.util.Arrays;
import java.util.Scanner;
public class VetorOrdem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];

        System.out.println("Digite os nomes:");
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = scanner.nextLine();
        }

        Arrays.sort(nomes);

        System.out.println("Nomes em ordem alfabética:");
        for (String n : nomes) {
            System.out.println(n);
        }
    }
}

/* Explicando o código:

Importamos as classes Arrays e Scanner do pacote java.util.
Criamos uma classe chamada OrdenacaoNomes.
Dentro da classe, criamos o método main.
Criamos uma instância da classe Scanner para ler os nomes digitados pelo usuário.
Criamos um vetor de String chamado nomes com tamanho 5.
Pedimos para o usuário digitar os 5 nomes, utilizando um laço for para ler cada um dos nomes e armazená-los no vetor nomes.
Utilizamos o método estático sort da classe Arrays para ordenar o vetor nomes em ordem alfabética.
Imprimimos na tela a mensagem "Nomes em ordem alfabética:".
Utilizamos um laço for-each para percorrer o vetor nomes e imprimir cada um dos nomes na tela, em ordem alfabética.

 */