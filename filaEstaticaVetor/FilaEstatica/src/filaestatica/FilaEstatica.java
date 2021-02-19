package filaestatica;

import java.util.Scanner;

public class FilaEstatica {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String pessoas[] = new String[100];
       
        int inicio = 0, fim = 0,resposta;
        for (int i = 0; i < 101; i++) {
            System.out.println(" ");
            System.out.println("Menu");
            System.out.println("1 - Cadastrar nova pessoa na fila");
            System.out.println("2 - Chamar o próximo da fila");
            System.out.println("3 - Listar todos que ainda estão aguardando o atendimento");
            System.out.println("4 - Sair");
            System.out.println(" ");
            resposta = teclado.nextInt();
            if (resposta == 4) {
                break;
            }
            switch (resposta) {
                //Cadastra uma nova pessoa na fila 
                case 1:

                    System.out.println("Insira o nome da nova pessoa que está na Fila:");
                    pessoas[fim] = teclado.next();
                    fim++;

                    break;
                //Chama uma pessoa que está na fila e uma posição de inicio
                case 2:
                    if (pessoas[inicio] != null) {
                        System.out.println("O próximo da fila é : " + pessoas[inicio]);
                        inicio++;
                    } else {
                        System.out.println("Todas as pessoas já foram atendidas.");
                    }
                    break;
                //Lista fila a partir da posição de inicio
                case 3:
                    for (int  cont = inicio; cont < fim; cont++) {
                        //Imprime a posição em que está a próxima pessoa
                        System.out.println(cont + 1 + "° " + "Posicao: " + pessoas[cont]);
                    } 
                    //Criei uma condição que testa se o 
                    if (inicio >= fim)
                        System.out.println("Não há pessoas aguardando o atendimento");
                    break;
                //Encerra o programa caso o usuario digitar o numero 4 no teclado e apertar enter,
                case 4:
                    break;
                //Se caso o usuario não digitar nenhum dos valores do menu
                // O programa entre 
                default:
                    System.out.println("Digite uma opção do menu");
            }
        }
        //Quando o Switch chega ao fim ele exibe esta mensagem ao usuario
        System.out.println("Programa Finalizado.");
    }

}
