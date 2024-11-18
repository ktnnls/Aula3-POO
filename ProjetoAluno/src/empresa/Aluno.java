package empresa;

public class Aluno {
	String nome;
	int matricula;
	double desconto;
	Curso curso;
	
	
	public Aluno(String nome, int matricula, double desconto, Curso curso) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.desconto = desconto;
		this.curso = curso;
	}
	
	void info () {
		System.out.println("Nome Aluno: " + nome);
        System.out.println("Matricula do Aluno: " + matricula);
        System.out.println("Desconto total: " + desconto);
        System.out.println("Pagamento da Mensalidade será de: " + pagamento());
        curso.info();
	}
	
	double pagamento() {
		return curso.mensalidade*(1-desconto);
	}
	
}
