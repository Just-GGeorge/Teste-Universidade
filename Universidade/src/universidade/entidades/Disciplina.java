/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidade.entidades;

import java.io.Serializable;

/**
 *
 * @author jean
 */
public class Disciplina implements Serializable {
    private String nome;
    private int identificacao;
    /*objetivo: metodo para verificar e validar pré-requisitos
    de uma disciplina 
    */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }
}
