package manipulacaoarquivos;

/*
 *   Resolvi desenvolver um programa de diário, eu relato acontecimentos diários
 * faz uns 6 anos porém ainda uso o papel e a caneta para isto. Este programa
 * tem como objetivo pertimir que eu relate acontecimentos do dia dia,
 * salvando-o em um arquivo de texto dentro de um pen-drive no Disco:"E://"
 * e também a possibilidade de criar outros diários, listá-los e excluí-los.
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Lucas T. Lopes
 */
public class ManipulacaoArquivos {

    public static void main(String args[]) throws IOException {
        Scanner teclado = new Scanner(System.in);
        String cadeia = null;

        System.out.println("Olá, sou o querido Diário e é sempre um prazer ouvir "
                + "o que você tem a me dizer.");

        // CRIA OS ARQUIVOS EM MEMÓRIA.
        File caminho = new File("E:\\Diários");

        //VERIFICA SE JÁ EXISTEM NA UNIDADE FISICA.
        //CASO NÃO, OS CRIA.
        if (!caminho.exists()) {
            caminho.mkdir();
        }

        int resposta = 1;
        while (resposta != 0) {
            System.out.println("Menu:");
            System.out.println("1 - Vizualizar diários.");
            System.out.println("2 - Acessar diário.");
            System.out.println("3 - Criar novo diário.");
            System.out.println("4 - Deletar novo diário.");
            System.out.println("0 - Para sair do programa.");
            resposta = teclado.nextInt();
            switch (resposta) {
                case 1:
                    File diarios = new File("E:\\Diários");
                    System.out.println("\nLista com os diários gravados :\n");

                    for (File file : diarios.listFiles()) {
                        System.out.println(file + "\n");
                    }
                    break;
                case 2:
                    System.out.println("Qual é o nome do diário que você quer acessar? "
                            + "\n Exemplo: Diario-Do-Lucas.txt (é necessário o nome inteiro)\n");
                    String diarioEscolhido = teclado.next();

                    for (File f : caminho.listFiles()) {
                        if (f.getName().equals(diarioEscolhido)) {
                            FileWriter escritor = new FileWriter(f, true);

                            System.out.println("\nDia : ");
                            int dia = teclado.nextInt();
                            System.out.println("\nMes : ");
                            int mes = teclado.nextInt();
                            System.out.println("\nAno : ");
                            int ano = teclado.nextInt();
                            System.out.println("\nRelato : (sem tamanho máximo(INFINITO) porém sem espaços)");
                            String relato = teclado.next();

                            String Data = ("Data: " + dia + "/" + mes + "/" + ano + "\n Relato:\n");
                            try {
                                escritor.write(Data);
                                escritor.write(relato + "\n\n\n");
                                escritor.close();
                                break;
                            } catch (IOException e) {
                                System.out.println("Não foi possivél gravar");
                            }

                        }
                    }
                    break;

                case 3:
                    System.out.println("Qual o nome que você deseja usar para o diário?");
                    String nomeDiario = teclado.next();
                    File diarioPessoa = new File(caminho, nomeDiario + ".txt");
                    diarioPessoa.createNewFile();
                    break;
                case 4:
                    System.out.println("Qual é o nome do diário que você deseja excluír? "
                            + "\n Exemplo: Diario-Do-Lucas.txt (é necessário o nome inteiro)\n");
                    String diarioParaExcluir = teclado.next();
                    for (File f : caminho.listFiles()) {
                        if (f.getName().equals(diarioParaExcluir)) {
                            if (f.delete()) {
                                System.out.println("O diário foi deletado com sucesso.");
                            } else {
                                System.out.println("Nenhum diário com este nome.");
                            }
                        }
                    }
                    break;

            }
        }

    }
}
