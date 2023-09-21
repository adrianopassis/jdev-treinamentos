package primeiro_programa.principal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.constantes.StatusAluno;
import primeiro_programa.classes.Aluno;
import primeiro_programa.classes.Disciplina;

public class Principal {
	public static void main(String[] args) {

		String login = JOptionPane.showInputDialog("Informe a login:");
		String senha = JOptionPane.showInputDialog("Informe a senha:");
		
		if(login.equalsIgnoreCase("admin") 
				&& senha.equalsIgnoreCase("admin")) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		/*HashMap é uma lista que tem dentro dela uma chave 
		 * que identifica uma sequência de valores também.
		 * <Chave, Valor> 
		 */

		for (int qtd = 1; qtd <= 5; qtd++) {

			Aluno aluno1 = new Aluno();

			String nome = JOptionPane.showInputDialog("Qual nome do aluno?");
			/*
			 * String idade = JOptionPane.showInputDialog("Qual a idade do aluno?"); String
			 * dataNascimento =
			 * JOptionPane.showInputDialog("Data de nasciemnto do aluno? "); String rg =
			 * JOptionPane.showInputDialog("RG do aluno?"); String cpf =
			 * JOptionPane.showInputDialog("Qual o cpf do aluno?"); String mae =
			 * JOptionPane.showInputDialog("Nome da mãe?"); String pai =
			 * JOptionPane.showInputDialog("Nome do pai?"); String matricula =
			 * JOptionPane.showInputDialog("Data da matrícula"); String serie =
			 * JOptionPane.showInputDialog("Qual a série?"); String escola =
			 * JOptionPane.showInputDialog("Nome da escola");
			 */

			aluno1.setNome(nome);
			/*
			 * aluno1.setIdade(Integer.valueOf(idade));
			 * aluno1.setDataNascimento(dataNascimento); aluno1.setRegistroGeral(rg);
			 * aluno1.setNumeroCpf(cpf); aluno1.setNomeMae(mae); aluno1.setNomePai(pai);
			 * aluno1.setDataMatricula(matricula); aluno1.setSerieMatriculado(serie);
			 * aluno1.setNomeEscola(escola);
			 */

			for (int pos = 1; pos <= 1; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina " + pos + " ?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplia " + pos + "? ");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDiciplinas().add(disciplina);

			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

			if (escolha == 0) {/* Opção sim é zero */

				int continuarRemover = 0;
				int posicao = 1;

				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4?");
					aluno1.getDiciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
					// O objeto string se torna em objeto Integer e depois se torna em um primitivo.
				}
			}

			alunos.add(aluno1);

		}
		
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

		
		for (Aluno aluno: alunos) {/*Separei em listas o status dos alunos*/
			if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)){
				maps.get(StatusAluno.APROVADO).add(aluno);
			}else if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
			}else {
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
			}
		}
		
		System.out.println("----Lista dos Aprovados---- ");
		for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println("Nome do Aluno: " + aluno.getNome() +", resultado: " + aluno.getAlunoAprovado2() 
			+ ", média de: " 
					+ aluno.getMediaNota());
		}
		
		System.out.println("----Lista dos Recuperacao---- ");
		for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println("Nome do Aluno: " + aluno.getNome() +", resultado: " + aluno.getAlunoAprovado2() 
			+ ", média de: " 
					+ aluno.getMediaNota());
		}
		
		System.out.println("----Lista dos Repovados---- ");
		for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println("Nome do Aluno: " + aluno.getNome() +", resultado: " + aluno.getAlunoAprovado2() 
			+ ", média de: " 
					+ aluno.getMediaNota());
		}
		
	}// Fim do MAIN
	}
}
