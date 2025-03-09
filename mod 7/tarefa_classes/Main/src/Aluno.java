/**
 * @author Wagner Morais
 * Classe que representa um aluno da EBAC
 */
public class Aluno {
    private String nome;
    private int idade;
    private String genero;
    private String curso;

    public Aluno(String nome, int idade, String genero, String endereco, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.curso = curso;
    }
    /**
     * Apresenta o aluno
     */
    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e estou cursando " + curso + ".");
    }

    /**
     * Exibe as informações do aluno
     */
    public void exibirDetalhes() {
        System.out.println("Aluno: " + nome + ", Idade: " + idade + ", Gênero: " + genero + ", Curso: " + curso);
    }


}
