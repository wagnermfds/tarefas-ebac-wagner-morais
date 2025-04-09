/**
 * @author Wagner Morais
 */
public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Wagner", 26, "Masculino", "Rua w, 123", "Especialista Back-end Java");
        Professor professor = new Professor("Rodrigo Pires", 45, "Masculino", "Rua B, 456", "Programacao Back-end");

        aluno.apresentar();
        aluno.exibirDetalhes();

        professor.apresentar();
        professor.exibirDetalhes();
    }
}
