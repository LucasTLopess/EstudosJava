/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizvetor;

import java.util.Scanner;

/**
 *
 * @author Lucas Troleiz Lopes
 */
public class lojaProduto {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String lojas[] = new String[4];
        String produtos[] = new String[6];
        double preco[][] = new double[4][6];

        for (int linha = 0; linha < 4; linha++) {
            System.out.println("Qual é o nome da Loja");
            lojas[linha] = teclado.next();
        }
        for (int linha = 0; linha < 6; linha++) {
            System.out.println("Produto " + linha + ": ");
            produtos[linha] = teclado.next();
        }
        for (int linha = 0; linha < 4; linha++) {
            System.out.println("Quais são os valores dos produtos na loja " + lojas[linha]);
            for (int coluna = 0; coluna < 6; coluna++) {
                System.out.println("Qual é o preço do " + produtos[coluna] + "  ");
                preco[linha][coluna] = teclado.nextDouble();
            }
        }
        for (int linha = 0; linha < 4; linha++) {
            for (int coluna = 0; coluna < 6; coluna++) {
                if (preco[linha][coluna] > 50){
                System.out.println("A loja " + lojas[linha] + " tem o produto " + produtos[coluna] + " por apenas " + preco[linha][coluna]);
                }
            }
            System.out.println("------------ // --------------- ");
        }

    }
}