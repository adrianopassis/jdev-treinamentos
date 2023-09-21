package primeiro_programa.classes;

import java.util.ArrayList;
import java.util.List;

import cursojava.constantes.StatusAluno;

public class Aluno {
	
	private String nome;
	private int idade;
	private String dataNascimento;
	private  String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	
	private List<Disciplina> diciplinas = new ArrayList<Disciplina>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	public List<Disciplina> getDiciplinas() {
		return diciplinas;
	}

	public void setDiciplinas(List<Disciplina> diciplinas) {
		this.diciplinas = diciplinas;
	}


	public double getMediaNota() {
		
		double somaNotas = 0;
		
		for (Disciplina disciplina : diciplinas) {
			somaNotas += disciplina.getNota();
		}
		
		return somaNotas / diciplinas.size();
	}
	
	@Override
	public String toString() {
		return "Nome = " + nome + "\nIdade = " + idade + "\nData de nascimento = "  + dataNascimento + "\nRegistroGeral="
				+ registroGeral + "\nNumero do Cp f=" + numeroCpf + "\nNome da mãe = " + nomeMae + "\nNome do pai = " + nomePai
				+ "\nDataMatricula = " + dataMatricula + "\nNome da escola = " + nomeEscola + "\nSerie matriculado = "
				+ serieMatriculado;
	}
	
	
	public boolean getAlunoAprovado() {
		if (getMediaNota() >= 7) {
			return true;
		}else {
			return false;
		}
	}

	public String getAlunoAprovado2() {
		double media = this.getMediaNota();
		if (getMediaNota() >= 5) {
			if(media >= 7) {
				return StatusAluno.APROVADO;
			}else {
				return StatusAluno.RECUPERACAO;
			}
		}else {
			return StatusAluno.REPROVADO;
		}
	}	
	
	
	
	
}
