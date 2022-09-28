package br.com.hirataacademia.basicas;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class FichadeTreino {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fichadeTreino_id")

	private Aluno aluno;

	private String nomeAluno;
	private int numeroExercicios;
	private int numeroSeries;
	private int duracao;
	private String intensidade;

	public FichadeTreino(String nomeAluno, int numeroExercicios, int numeroSeries, int duracao, String intensidade) {
		super();
		this.nomeAluno = nomeAluno;
		this.numeroExercicios = numeroExercicios;
		this.numeroSeries = numeroSeries;
		this.duracao = duracao;
		this.intensidade = intensidade;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public int getNumeroExercicios() {
		return numeroExercicios;
	}

	public void setNumeroExercicios(int numeroExercicios) {
		this.numeroExercicios = numeroExercicios;
	}

	public int getNumeroSeries() {
		return numeroSeries;
	}

	public void setNumeroSeries(int numeroSeries) {
		this.numeroSeries = numeroSeries;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public String getIntensidade() {
		return intensidade;
	}

	public void setIntensidade(String intensidade) {
		this.intensidade = intensidade;
	}

}