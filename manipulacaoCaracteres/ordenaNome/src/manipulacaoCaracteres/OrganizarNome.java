/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author trole
 */
public class OrganizarNome {

    static String desorganizar(String nome) {
        String ultimoNome = new String();
        String nomeCompleto =  new String();
        
        int var = nome.split(" ",-1).length - 1;
        String var2[] = new String[var];
        
        
        var2 = nome.split(" ");
        ultimoNome = var2[var];
         for (int i = 0; i <= var-1; i++) {
            nomeCompleto += var2[i] + " ";
            
         }
        
         
        
        String resposta = ultimoNome.toUpperCase() + ", "+  nomeCompleto;
        return resposta;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um nome");
        String nome = teclado.nextLine();
        String resposta = desorganizar(nome);
        System.out.println(resposta);
    }

}
