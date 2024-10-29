import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayExemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Uva");
        frutas.add("Pera");

        System.out.println("Frutas que estão na lista:");
        exibirFrutas(frutas);

   
        frutas.remove(2); 
        System.out.println("\nLista após remoção da terceira fruta:");
        exibirFrutas(frutas);

        
        String frutaParaBuscar = "Banana";
        boolean existe = buscarFruta(frutas, frutaParaBuscar);
        System.out.println("\nA fruta " + frutaParaBuscar + " está na lista? " + existe);

  
        Collections.sort(frutas);
        System.out.println("\nFrutas ordenadas:");
        exibirFrutas(frutas);


        ArrayList<Integer> numerosInteiros = new ArrayList<>();
        numerosInteiros.add(1);
        numerosInteiros.add(2);
        numerosInteiros.add(3);
        numerosInteiros.add(4);
        numerosInteiros.add(5);
        
        int contagemPares = contarPares(numerosInteiros);
        System.out.println("\nQuantidade de números pares encontrados na lista: " + contagemPares);

        scanner.close();
    }

    public static void exibirFrutas(ArrayList<String> frutas) {
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }

    public static boolean buscarFruta(ArrayList<String> frutas, String fruta) {
        return frutas.contains(fruta);
    }

    public static int contarPares(ArrayList<Integer> numeros) {
        int contagem = 0;
        
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                contagem++;
            }
        }
        
        return contagem;
    }
}