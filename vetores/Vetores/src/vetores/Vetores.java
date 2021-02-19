package vetores;

import java.util.Scanner;

public class Vetores {

  
    public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
    int vetNum[] = new int[10];

    for ( int i = 0 ; i <= 9 ; i++ ){
        System.out.println("Informe um número");
        vetNum[i]= teclado.nextInt();    
     } 
    
    for (int i = 0; i <=9; i++){
       int cont=0;
       if(vetNum[i]>=50){
            System.out.println(i +"="+vetNum[i]);
        } 
     }
    int cont;
    cont=0;
    for (int i = 0; i <=9; i++){
         
         if(vetNum[i]<50){
           cont++;
        }
        if(cont == 9){
            System.out.println("Só exebimos valores no intervalo (50.....n) ");
        }
    }
  }
}


