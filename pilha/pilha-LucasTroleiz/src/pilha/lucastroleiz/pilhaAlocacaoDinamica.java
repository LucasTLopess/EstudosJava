package pilha.lucastroleiz;

import java.util.Scanner;

/**
 *
 * @author Lucas Troleiz
 */
class Livro {

    String autor;
    String titulo;
    String editora;
    String ano;
    Livro proximo;
}

public class pilhaAlocacaoDinamica {

    static Livro empilhar(Livro topo, String autor, String titulo, String editora, String ano) {
        Livro livro = new Livro();
        livro.autor = autor;
        livro.titulo = titulo;
        livro.editora = editora;
        livro.ano = ano;
        livro.proximo = null;

        Livro aux;
        aux = topo;
        if (aux.autor == null) {
            aux.autor = autor;
            aux.titulo = titulo;
            aux.editora = editora;
            aux.ano = ano;
            aux.proximo = null;
            System.out.println("Livro Adicionado com sucesso\n\n");
            return aux;
        } else {
            while (aux.proximo != null) {

                aux = aux.proximo;

            }
            aux.proximo = livro;
        }
        System.out.println("Livro Adicionado com sucesso\n\n");
        return aux;
    }

    static void mostrarTopo(Livro livros) {
        Livro aux;
        aux = livros;
        System.out.println("Autor: " + aux.autor);
        System.out.println("Titulo: " + aux.titulo);
        System.out.println("Editora: " + aux.editora);
        System.out.println("Ano: " + aux.ano);
        if (aux.autor != null) {
            while (aux.proximo != null) {

                aux = aux.proximo;

            }
            System.out.println("Autor: " + aux.autor);
            System.out.println("Titulo: " + aux.titulo);
            System.out.println("Editora: " + aux.editora);
            System.out.println("Ano: " + aux.ano);
        } else {
            System.out.println("Esta pilha está vazia");
        }

    }

    static Livro desempilhar(Livro livros) {
        Livro paraSerRemovido;
        paraSerRemovido = livros;

        Livro aux;
        aux = livros;
        if(livros.autor == null){
            System.out.println("A pilha está vazia!");
            return livros;
        }
        if (livros.proximo == null) {
            livros.autor = null;
            livros.titulo = null;
            livros.editora = null;
            livros.ano = null;
            livros.proximo = null;
            System.out.println("A pilha esvaziou!");
            return livros;
        } else {
            while (aux.proximo != null) {
                aux = aux.proximo;
            }

            while (paraSerRemovido.proximo != aux) {
                paraSerRemovido = paraSerRemovido.proximo;
            }
            paraSerRemovido.proximo = null;
            System.out.println("Removido com sucesso!");
            return paraSerRemovido;

        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Livro livros = new Livro();
        int item = 0;
        while (item != 4) {
            System.out.println("Menu:\n");
            System.out.println("1 – Empilhar livro (push)");
            System.out.println("2 – Mostrar elemento no topo (top)");
            System.out.println("3 – Desempilhar livro (pop)");
            System.out.println("4 – Sair");
            item = teclado.nextInt();

            switch (item) {
                case 1:
                    System.out.println("Informe Autor do livro:");
                    String autor = teclado.next();
                    System.out.println("Informe Titulo do livro:");
                    String titulo = teclado.next();
                    System.out.println("Informe Editora do livro:");
                    String editora = teclado.next();
                    System.out.println("Informe Ano em que foi escrito:");
                    String ano = teclado.next();
                    empilhar(livros, autor, titulo, editora, ano);
                    break;

                case 2:
                    mostrarTopo(livros);
                    break;

                case 3:
                    desempilhar(livros);
                    break;

            }

        }
    }

}
