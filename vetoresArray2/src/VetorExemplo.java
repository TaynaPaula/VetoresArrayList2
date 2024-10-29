import java.util.Scanner;

public class VetorExemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int soma = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        // Solicitar ao usuário que insira 10 valores inteiros
        System.out.println("Pro favor, digite 10 valores inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];

            // Identificar o maior e o menor valor
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // Exibir resultados
        System.out.println("\nSoma dos valores digitados: " + soma);
        System.out.println("Maior valor digitado: " + maior);
        System.out.println("Menor valor digitado: " + menor);

        System.out.println("\nValores inseridos:");
        for (int numero : numeros) {
            String indicadorMaior = (numero == maior) ? " (Maior)" : "";
            String indicadorMenor = (numero == menor) ? " (Menor)" : "";
            System.out.println(numero + indicadorMaior + indicadorMenor);
        }

        scanner.close();
    }
}