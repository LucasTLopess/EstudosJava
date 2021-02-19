
package duracao;

import java.util.Scanner;
public class Duracao {
    
    static int duracao(int hr1, int min1, int hr2, int min2){
        int result =0, hora=0, minuto=0;
        if ( hr1>=0 && hr1<=24 && hr2>=0 && hr2<=24 && min1>=0 && min1<60 && min2>=0 && min2<60){
            
            if(hr1>hr2){
                hora = (24-hr1) + hr2;
                if (min1>min2 && min1+min2<=60){
                    hora--;
                    minuto = 60 - (min1-min2);
                    result = hora*60 + minuto;
                }else{
                    if(min1>=min2 && min1+min2>60){
                    hora++;
                    minuto = min2-min1;
                    minuto = 60 - minuto;
                    result = hora*60 + minuto;
                    }
                }
                if (min1<=min2 && min1+min2<=60){
                    hora--;
                    minuto = min2-min1;
                    minuto = 60 - minuto;
                    result = hora*60 + minuto;
                }else{
                    if(min1<=min2 && min1+min2>60){
                    hora++;
                    minuto = min2-min1;
                    minuto = 60 - minuto;
                    result = hora*60 + minuto;
                    }
                }                
            }else{
                if(hr2>hr1){
                    hora = hr2 - hr1;
                    if (min1>min2 && min1+min2<=60){
                    hora--;
                    minuto = min1-min2;
                    minuto = 60 - minuto;
                    result = hora*60 + minuto;
                }else{
                    if(min1>=min2 && min1+min2>60){
                    hora++;
                    minuto = min2-min1;
                    minuto = 60 - minuto;
                    result = hora*60 + minuto;
                    }
                }
                if (min1<=min2 && min1+min2<=60){
                    hora--;
                    minuto = min2-min1;
                    minuto = 60 - minuto;
                    result = hora*60 + minuto;
                }else{
                    if(min1<=min2 && min1+min2>60){
                    hora++;
                    minuto = min2-min1;
                    minuto = 60 - minuto;
                    result = hora*60 + minuto;
                    }
                }
                }
            }            
        }else{
           result =0;
        }
    return result;
    }
    public static  void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int h1, m1, h2, m2;
        System.out.println("Horario utilizado 24 horas");
        System.out.println("Informe o horário do inicio do jogo ex HORAS=13 e MINUTOS=30");
        h1=teclado.nextInt();
        m1=teclado.nextInt();
        System.out.println("Informe o horário do final do jogo ex: HORAS=13 e MINUTOS=30");
        h2=teclado.nextInt();
        m2=teclado.nextInt();
        int total=duracao(h1,m1,h2,m2);   
        if(total>=0){
        System.out.println("O tempo do jogo foi = "+total+" minutos");
        }else{
            System.out.println("As horas e minutos são inválidas.");
        }
      }
}
