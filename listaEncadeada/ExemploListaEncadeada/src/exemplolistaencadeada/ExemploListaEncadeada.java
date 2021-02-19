package exemplolistaencadeada;

import java.util.Scanner;

class NoPessoa {

    String CPF;
    String nome;
    double salario;
    NoPessoa proximo;

}

public class ExemploListaEncadeada {

    static NoPessoa insereNoInicio(NoPessoa ini, String cpf, String nom, double sal) {
        NoPessoa p = new NoPessoa();
        p.CPF = cpf;
        p.nome = nom;
        p.salario = sal;
        p.proximo = ini;
        return p;
    }

    static NoPessoa insereNoFim(NoPessoa inicio, String nome, String cpf, double sal) {
        NoPessoa r = new NoPessoa();
        r.nome = nome;
        r.CPF = cpf;
        r.salario = sal;
        r.proximo = null;

        NoPessoa aux;
        aux = inicio;
        if (aux.nome == null) {
            aux.nome = nome;
            aux.CPF = cpf;
            aux.salario = sal;
            aux.proximo = null;
            return aux;
        } else {
            while (aux.proximo != null) {

                aux = aux.proximo;

            }
            aux.proximo = r;
        }

        return aux;

    }

    static NoPessoa procura(String nome, NoPessoa noPessoa) {
        NoPessoa p = new NoPessoa();
        while (noPessoa.proximo != null) {
            if (noPessoa.nome.equals(nome)) {
                p.nome = noPessoa.nome;
                p.CPF = noPessoa.CPF;
                p.salario = noPessoa.salario;
                p.proximo = noPessoa.proximo;

            }
            noPessoa = noPessoa.proximo;
        }
        if (p.nome != null) {
            System.out.println("Esta pessoa existe em nossa memória e os seus dados são estes :");
            System.out.println(p.CPF + ", " + p.nome + ", " + p.salario);

        } else {
            System.out.println("Não existe nenhuma pessoa com este nome.");
        }
        return p;
    }

    static void mostra(NoPessoa ini) {
        NoPessoa p;
        p = ini;
        while (p.proximo != null) {
            System.out.println(p.CPF + " , " + p.nome + " , " + p.salario);
            p = p.proximo;
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        NoPessoa resultadoPesquisa, listaInicio, listaFim;
        resultadoPesquisa = new NoPessoa();
        listaFim = new NoPessoa();
        listaInicio = new NoPessoa();

        //Este "for" insere dados na lista só para exemplo...
        for (int i = 0; i < 20; i++) {
            listaInicio = insereNoInicio(listaInicio, "cpf" + i, "Joazinho" + i, i * 1000);
        }
        
        //Este "for" insere dados no final da lista só para exemplo...
        for (int i = 0; i < 20; i++) {
            insereNoFim(listaFim, "cpf" + i, "Joazinho" + i, i * 1000);
        }
        
        System.out.println("Lista inserida pela inicio digite :::: I");
        String i = teclado.next();
        if (i.equals("i") || i.equals("I")) {
            mostra(listaInicio);
        }

        System.out.println("Lista inserida pelo fim digite :::: F");
        String f = teclado.next();
        if (f.equals("f") || f.equals("F")) {
            mostra(listaFim);
        }

        System.out.println("Qual o nome que você deseja procurar? ");
        String nome = teclado.next();
        resultadoPesquisa = procura(nome, listaInicio);
        
    }

}
