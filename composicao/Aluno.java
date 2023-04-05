package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	final List<Curso> cursos = new ArrayList<>();
	final String nome;
	
	Aluno(String nome){
		this.nome = nome;
	}
	
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	public String toString() {
		return nome;
	}
	
	Curso obterCursoPorNome(String nome) {
		for (Curso curso: this.cursos) {
			if(curso.nomeCurso.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
	return null;
	
}
}