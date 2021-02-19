/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_urna;

/**
 *
 * @author Lucas Troleiz Lopes
 */
import java.util.Scanner;
public class Ex_urna {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner ler = new Scanner(System.in);
    int cont = 0 ;
    
    System.out.print("Quantas pessoas irão votar?");
    int n_pes = ler.nextInt();
    int cand1=0, cand2=0, cand3=0, branc=0;
    while(cont<n_pes){
        cont ++;
        System.out.println("1) Votar no candidato AAA\n" +
                           "2) Votar no candidato BBB\n" +
                           "3) Votar no candidato CCC\n" +
                           "4) Votar em branco");
    
    int cand = ler.nextInt();
    if(cand == 1){
      cand1= cand1 + 1;
       System.out.println("Obrigado pelo seu voto");
    }
    if(cand == 2){
         cand2= cand2 + 1;
          System.out.println("Obrigado pelo seu voto");  
    }
    if(cand == 3){
         cand3= cand3 + 1;
         System.out.println("Obrigado pelo seu voto");
    }
    if(cand == 4){
         branc= branc + 1;
         System.out.println("Obrigado pelo seu voto");
    }
    if(cand!=1 && cand!=2 && cand!=3 && cand!=4){
        System.out.println("O valor inserido é invalido");
    }    
    }
    System.out.println("O candidato AAA teve :"+cand1+" votos\n"+
                       "O candidato BBB teve :"+cand2+" votos\n"+
                       "O candidato CCC teve :"+cand3+" votos\n"+
                       "E também teve :"+branc+" votos em branco\n");
    if(cand1 > cand2 && cand1 > cand3){
        System.out.println("O Canditado AAA foi o vencedor");
    }else{
      if(cand2 > cand1 && cand2 > cand3){
        System.out.println("O Canditado BBB foi o vencedor");
    }else{
          if(cand3 > cand1 && cand3 > cand2){
        System.out.println("O Canditado CCC foi o vencedor");
        
    }else {
              System.out.println("Nenhum  foi o vencedor");
          }
      }  
    }
    
    }
    }
    
    

