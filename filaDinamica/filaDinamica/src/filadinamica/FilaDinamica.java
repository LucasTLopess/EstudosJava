package filadinamica;

import java.util.Scanner;

/**
 *
 * @author Lucas Troleiz
 */
class Automoveis {

    String nomeProprietario;
    String placa;
    Automoveis proximo;

}

public class FilaDinamica {

    static Automoveis inserir(Automoveis automoveis, String nomeProprietario, String placa) {
        Automoveis a = new Automoveis();
        a.nomeProprietario = nomeProprietario;
        a.placa = placa;
        a.proximo = automoveis;
        automoveis = a;

        return a;

    }

    static void mostrar(Automoveis automoveis) {
        Automoveis aux;
        aux = automoveis;

        if (aux.nomeProprietario == null) {
            System.out.println("\nA fila está vazia!\n");
        } else {
            while (aux.proximo != null) {
                System.out.println("\nAutmovél:");
                System.out.println("Proprietário: " + aux.nomeProprietario);
                System.out.println("Placa: " + aux.placa + "\n");
                aux = aux.proximo;
            }
        }
    }

    static Automoveis chamar(Automoveis automoveis) {
        Automoveis aux, aux2;
        aux = automoveis;
        aux2 = automoveis;
        Automoveis inicio = null;
        if (aux.nomeProprietario == null) {
            System.out.println("\nA fila já está vazia\n");
            return aux;
        } else {
            if (aux.proximo.proximo == null) {
                System.out.println("\nVeiculo do Sr(a): " + aux.nomeProprietario + "\n");
                aux.nomeProprietario = null;
                aux.placa = null;
                aux.proximo = null;

                return aux;
            } else {

                while (aux.proximo != null) {
                    inicio = aux;
                    aux = aux.proximo;
                }
                while (aux2.proximo != inicio) {
                    aux2 = aux2.proximo;
                }
                System.out.println("\nVeiculo do Sr(a): " + aux2.proximo.nomeProprietario + "\n");
                aux2.proximo.proximo = null;

                return automoveis;
            }
        }

    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Automoveis automoveis = new Automoveis();
        int resp = 0;
        while (resp != 4) {
            System.out.println("\nMenu:\n");
            System.out.println("1 – Inserir novo automóvel na FILA");
            System.out.println("2 – Mostrar TODA a FILA atual");
            System.out.println("3 – Chamar o próximo da FILA");
            System.out.println("4 – Sair");
            resp = teclado.nextInt();

            switch (resp) {
                case 1:
                    System.out.println("\nQual o nome do proprietário do automóvel?");
                    String nomeProprietario = teclado.next();
                    System.out.println("Qual é a placa do automével?");
                    String placa = teclado.next();
                    automoveis = inserir(automoveis, nomeProprietario, placa);
                    break;
                case 2:
                    mostrar(automoveis);
                    break;
                case 3:
                    chamar(automoveis);
                    break;
            }

        }

    }

}
