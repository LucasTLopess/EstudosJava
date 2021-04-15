package poo.lucastlopes;

import java.util.Scanner;

/**
 *
 * @author trole
 */
public class POOLucasTLopes {

    static void maiorIndice(int array[]) {
        int maiorValor = 0;
        int indice = 0;
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array.length; k++) {
                if (array[i] > array[k] && array[i] > maiorValor) {
                    maiorValor = array[i];
                    indice = i;

                }
            }
        }
        System.out.println("\n1°  O indice com o maior valor é: " + indice);
    }

    static void menorIndice(int array[]) {
        int menorValor = 100000000;
        int indice = 0;
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array.length; k++) {
                if (array[i] < array[k] && array[i] < menorValor) {
                    menorValor = array[i];
                    indice = i;

                }
            }
        }
        System.out.println("\n2°  O indice com o maior valor é: " + indice);
    }

    static void maiorValor(int array[]) {
        int maiorValor = 0;

        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array.length; k++) {
                if (array[i] > array[k] && array[i] > maiorValor) {
                    maiorValor = array[i];

                }
            }
        }
        System.out.println("\n3°  O maior valor do array é: " + maiorValor);
    }

    static void menorValor(int array[]) {
        int menorValor = 100000000;

        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array.length; k++) {
                if (array[i] < array[k] && array[i] < menorValor) {
                    menorValor = array[i];

                }
            }
        }
        System.out.println("\n4°  O menor valor do array é: " + menorValor);
    }

    static void ordenarArray(int array[]) {
        int maiorValor = 0;

        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array.length; k++) {
                if (array[i] < array[k]) {
                    maiorValor = array[i];
                    array[i] = array[k];
                    array[k] = maiorValor;
                }

            }
        }
        System.out.print("\n5°  Array ordenado de forma crescente [");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i]+", ");
        }
        System.out.print(array[array.length-1]+"]\n");
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] array = new int[5];

        System.out.println("Escreva 5 numeros");
        for (int i = 0; i < 5; i++) {
            array[i] = teclado.nextInt();
        }

        maiorIndice(array);

        menorIndice(array);

        maiorValor(array);

        menorValor(array);

        ordenarArray(array);

    }

}
