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
public class Video extends Arquivo {
    
    public Video (String nomeArquivo){
        this.setNomeArquivo(nomeArquivo);
    }
    
    @Override
    public void imprimirArquivo(){
        System.out.println(this.getNomeArquivo());
    }
    
}
