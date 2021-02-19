/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacaocarros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrdenacaoCarros {

    private static class Carro {

        int ano;
        String marca;
        String modelo;
        int preco;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int cont = 0;
        Carro[] carros = new Carro[200];

        List<Integer> anos = new ArrayList<>();
        anos.add(1990);
        anos.add(2000);
        anos.add(2010);
        anos.add(2020);

        List<String> marcas = new ArrayList<>();
        marcas.add("Wolksvagem");
        marcas.add("Ford");
        marcas.add("Chevrolet");
        marcas.add("Hyundai");

        List<String> modelos = new ArrayList<>();
        modelos.add("Sedan");
        modelos.add("Ret");
        modelos.add("Suv");

        List<Integer> precos = new ArrayList<>();
        precos.add(10000);
        precos.add(20000);
        precos.add(30000);
        precos.add(40000);

        System.out.println("Informações do carro");

        for (int i = 0; i < 200; i++) {

            //ANO
            System.out.println("Ano"
                    + "\nDigite 1 para 1990"
                    + "\nDigite 2 para 2000"
                    + "\nDigite 3 para 2010"
                    + "\nDigite 4 para 2020\n");
//            int anoEscolhido = teclado.nextInt();
            int anoEscolhido = 1;
            //Marca
            System.out.println("\nMarca"
                    + "\nDigite 1 para Wolksvagem"
                    + "\nDigite 2 para Ford"
                    + "\nDigite 3 para Chevrolet"
                    + "\nDigite 4 para Hyundai\n");
//            int marcaEscolhida = teclado.nextInt();
            int marcaEscolhida = 1;
            //Modelo
            System.out.println("\nModelo"
                    + "\nDigite 1 para Sedan"
                    + "\nDigite 2 para Ret"
                    + "\nDigite 3 para Suv\n"
            );
//            int modeloEscolhido = teclado.nextInt();
            int modeloEscolhido = 1;
            //Preço
            System.out.println("\nValor"
                    + "\nDigite 1 para 10.000"
                    + "\nDigite 2 para 20.000"
                    + "\nDigite 3 para 30.000"
                    + "\nDigite 4 para 40.000\n"
            );
//            int precoPreenchido = teclado.nextInt();
            if (cont > 3) {
                cont = 0;
                System.out.println("true");
            }
            int precoPreenchido = cont;
            cont++;
            Carro carro = new Carro();
            carro.ano = anos.get(anoEscolhido - 1);
            carro.marca = marcas.get(marcaEscolhida - 1);
            carro.modelo = modelos.get(modeloEscolhido - 1);
            carro.preco = precos.get(precoPreenchido);

            carros[i] = carro;

        }

        for (int i = 0; i < carros.length; i++) {

            int min = i;

            for (int j = i + 1; j < carros.length; j++) {

                if (carros[j].preco < carros[min].preco) {

                    min = j;
                    System.out.println("true");
                }

            }

            Carro carro =  carros[i];
            carros[i] = carros[min];
            carros[min] = carro;
            
        }

        for (int j = 0; j < carros.length; j++) {
            System.out.println(carros[j].preco + ", \n"
                    + carros[j].marca + " \n"
                    + carros[j].modelo + " \n "
                    + carros[j].ano + " \n ");

        }
    }

}
