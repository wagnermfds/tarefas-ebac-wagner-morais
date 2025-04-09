/**
 * @author Wagner Morais
 * Classe que representa um professor
 */
public class Professor {
    private String nome;
    private int idade;
    private String genero;
    private String disciplina;

    public Professor(String nome, int idade, String genero, String endereco, String disciplina) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.disciplina = disciplina;
    }

    /**
     * Apresenta o professor
     */
    public void apresentar() {
        System.out.println("Olá, sou o professor " + nome + " e leciono " + disciplina + ".");
    }

    /**
     * Exibe as informações do professor
     */
    public void exibirDetalhes() {
        System.out.println("Professor: " + nome + ", Idade: " + idade + ", Gênero: " + genero + ", Disciplina: " + disciplina);
    }
}

