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
public class Professor {
    private String nome;
    private double salario;
    private String identificacaoCPF;
    private String email;
    private String titulo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getIdentificacaoCPF() {
        return identificacaoCPF;
    }

    public void setIdentificacaoCPF(String identificacaoCPF) {
        this.identificacaoCPF = identificacaoCPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
    
}
