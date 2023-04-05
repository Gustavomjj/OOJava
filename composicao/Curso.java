package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	final List<Aluno> alunos = new ArrayList<>();
	final String nomeCurso;
	  
	Curso(String nomeCurso){
		this.nomeCurso = nomeCurso;
	}
	
	void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
		aluno.cursos.add(this);
		
	}
	
}
