/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package univercidade.entidades;

/**
 *
 * @author jean
 */
public class Disciplina {
    private String nome;
    private String identificacao;
    /*objetivo: metodo para verificar e validar pré-requisitos
    de uma disciplina 
    */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }
}
