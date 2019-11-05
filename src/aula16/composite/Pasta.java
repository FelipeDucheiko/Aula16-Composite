/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula16.composite;

import java.util.ArrayList;

/**
 *
 * @author felip
 */
public class Pasta extends Arquivo{
    
    private ArrayList<Arquivo> arquivos;
    
    public Pasta (String nomeArquivo){
        this.setNomeArquivo(nomeArquivo);
        arquivos = new ArrayList<Arquivo>();
    }

    @Override
    public void imprimirArquivo() {
        for (Arquivo a: arquivos){
            a.imprimirArquivo();
        }
    }
    
    public void adicionar(Arquivo arquivo){
        this.arquivos.add(arquivo);
    }
    
    public void remover(Arquivo arquivo){
        this.arquivos.remove(arquivo);
    }
    
    public Arquivo getFilho(int i){
        return this.arquivos.get(i);
    }
    
}
