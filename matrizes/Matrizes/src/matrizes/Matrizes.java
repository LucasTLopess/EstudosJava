package matrizes;

import java.util.Scanner;

public class Matrizes {

    /**
     * @Lucas T. Lopes
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int aux = 0; // variavel auxilia para saber qual é a o menor elemento da matriz
        int cubo[][] = new int[3][3];
        // Recebe valores da matriz
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.println("Informe um numero");
                cubo[linha][coluna] = teclado.nextInt();
            }

        }
        //Recebe valor da matriz da segunda posição
        aux = cubo[1][1];

        //RECEBE CADA LINHA DA MATRIZ
        // UMA DE CADA VEZ
        for (int[] var : cubo) {
            //REBECE CADA ELEMENTO DA COLUNA 
            // UM DE CADA VEZ
            for (int i : var) {
                //VERIFICA SE O ELEMENTO da posição " i " QUE RECEBE O INCREMENTE A CADA LOOP
                //É MENOR QUE O SEGUNDO elemento da matriz
                if (i < aux) {
                    // CASO FOR A variavel AUX recebe o menor valor
                    aux = i;
                }
            }

        }
        //Depois de todos os elementos da matriz passar no teste
        //Imprime o menor valor que ficou registrado na variavel AUX.
        System.out.println("O menor valor da matriz �: " + aux);

    }

}
