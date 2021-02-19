/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organizedata;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.Scanner;

public class OrganizeData {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma data no modelo 12/01/2021 ou 12/01/21");

        String date = teclado.next();
        LocalDate data = null;

        // Utilizei o DataTimeFormatter para a verificação do formato da data
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("dd/MM/yyyy")
                .withResolverStyle(ResolverStyle.LENIENT);
        DateTimeFormatter parser1 = DateTimeFormatter.ofPattern("dd/MM/yy")
                .withResolverStyle(ResolverStyle.LENIENT);

        // Um try catch, para testar os dois tipos de data.
        try {
            data = LocalDate.parse(date, parser);
            date = data.toString();
            int i = date.indexOf("-");
            String ano = date.substring(0, i);
            int anoMaisUm = Integer.parseInt(ano);
            System.out.println(anoMaisUm + 1);
        } catch (Exception e) {
            data = LocalDate.parse(date, parser1);
            date = data.toString();
            int i = date.indexOf("-");
            String ano = date.substring(0, i);
            int anoMaisUm = Integer.parseInt(ano);
            System.out.println(anoMaisUm + 1);
        }

    }
}
