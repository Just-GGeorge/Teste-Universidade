/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidade;

import universidade.entidades.Disciplina;

import universidade.entidades.Professor;
import universidade.entidades.Projeto;
import universidade.persistencia.DisciplinaDAO;
import universidade.persistencia.ProfessorDAO;
import universidade.persistencia.ProjetoDAO;
import universidade.persistencia.arquivo.DisciplinaDAOImplArq;
import universidade.persistencia.arquivo.ProfessorDAOImplArq;
import universidade.persistencia.arquivo.ProjetoDAOImplArq;

public class Main {

    public static void main(String[] args) {
    	
    	Disciplina d = new Disciplina();
    	d.setNome("Algebra linear III");
    	d.setIdentificacao(112);
    	
    	DisciplinaDAO banco = new DisciplinaDAOImplArq();
    	banco.inserir(d);
    	
    	
    	Professor p = new Professor();
    	p.setNome("Joao Cleiton");
    	p.setIdentificacaoCPF("276.124.223-22");
    	p.setEmail("joao@gmail.com");
    	p.setSalario(10000000);
    	p.setTitulo("Mestre sensei");
    	
    	
    	ProfessorDAO banco1 = new ProfessorDAOImplArq();
    	banco1.editar(p);
    	
    	
    	Projeto j = new Projeto();
    	j.setNome("Incredible Project II");
    	j.setId(1578);
    	
    	ProjetoDAO banco2 = new ProjetoDAOImplArq();
    	banco2.inserir(j);
    	
    }
    
}
