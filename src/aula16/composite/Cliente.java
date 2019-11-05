/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula16.composite;

/**
 *
 * @author felip
 */
public class Cliente {
    
    public static void main(String[] args) {
	Arquivo pasta2 = new Pasta("Pasta2");
        Arquivo imagem1 = new Imagem("Imagem1");
        Arquivo musica1 = new Musica("Musica1");
        Arquivo video1 = new Video("Video1");
        
        ((Pasta) pasta2).adicionar(imagem1);
        ((Pasta) pasta2).adicionar(musica1);
        ((Pasta) pasta2).adicionar(video1);
        
        Arquivo pasta1 = new Pasta("Pasta1");
        Arquivo musica = new Musica("Musica");
        Arquivo imagem = new Imagem("Imagem");
        
        ((Pasta) pasta1).adicionar(pasta2);
        ((Pasta) pasta1).adicionar(musica);
        ((Pasta) pasta1).adicionar(imagem);
        
        System.out.println("Arquivos dentro da Pasta 2:");
        pasta2.imprimirArquivo();   
        
        System.out.println("-----------------------------");
        
        System.out.println("Arquivos dentro da Pasta 1 (Pasta 2 está detro da pasta 1):");
        pasta1.imprimirArquivo(); 
    }   
}
