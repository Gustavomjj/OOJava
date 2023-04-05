package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Roberta");
		Aluno aluno2 = new Aluno("Fransisco");
		Aluno aluno3 = new Aluno("Joelma");
		
		
		Curso curso1 = new Curso("Java");
		Curso curso2 = new Curso("Web");
		Curso curso3 = new Curso("Html");
		
		
		aluno1.adicionarCurso(curso1);
		aluno1.adicionarCurso(curso2);
		aluno1.adicionarCurso(curso3);
		
		aluno2.adicionarCurso(curso2);
		aluno2.adicionarCurso(curso3);
		
		curso1.adicionarAluno(aluno3);
		
		for (Aluno aluno: curso1.alunos) {
			System.out.println("Estou matriculado no curso " + curso1.nomeCurso);
			System.out.println("e meu nome é " + aluno.nome);
			System.out.println();
		}
		
		System.out.println(aluno1.cursos.get(0).alunos);
	
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java");
		
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nomeCurso);
			System.out.println(cursoEncontrado.alunos);
		}
	}
	
}
