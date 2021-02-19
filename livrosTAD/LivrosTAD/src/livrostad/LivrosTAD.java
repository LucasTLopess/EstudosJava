package livrostad;

import java.util.ArrayList;
import java.util.List;

class Livros{
    String autor;
    String titulo;
}

public class LivrosTAD {
    
    static public String referenciaBibliograficaABNT(Livros livro){
      
        String autor = livro.autor;
        int tamanhoNome = autor.length();
        int espacoVazio = autor.lastIndexOf(" ");
        int espacovazio = 1;
        String ultimoNome = autor.substring(espacoVazio +1, tamanhoNome);
        String nomeCompleto = autor.substring(0, espacoVazio);
        String abreviacao = new String();
             
        while( espacovazio > 0 ){
            int tamanhonome = nomeCompleto.length();
            espacovazio = nomeCompleto.indexOf(" ")+1;
            abreviacao += (nomeCompleto.substring(0,1).toUpperCase()) + ". ";
            nomeCompleto = nomeCompleto.substring(espacovazio, tamanhonome);
                              
        }
        String resposta = ultimoNome.toUpperCase() + ", " + abreviacao + livro.titulo;
        
        return resposta;
    }
  
    public static void main(String[] args) {
        
        //Cadastrando livros com o uso da Classe Livros
        Livros livro1 =  new Livros();
        livro1.autor = "Lucas Troleiz Lopes";
        livro1.titulo = "A história barra contada pelos faróis.";
        
        Livros livro2 =  new Livros();
        livro2.autor = "Raissa Karol Luz Lopes";
        livro2.titulo = "O amor suporta tudo.";
        
        Livros livro3 =  new Livros();
        livro3.autor = "Raissa Karol Luz Lopes";
        livro3.titulo = "Vale a pena esperar.";
        
        //Adicionando livros a uma lista 
         List<Livros> livros = new ArrayList();
         livros.add(livro1);
         livros.add(livro2);
         livros.add(livro3);
        
         //Impremindo lista de Livros no padrão da ABNT
        for (int i = 0; i < livros.size(); i++) {
           Livros livro = livros.get(i);
            String referencia = referenciaBibliograficaABNT(livro);
            System.out.println(referencia);
                  
        }
        
    }
    
}
