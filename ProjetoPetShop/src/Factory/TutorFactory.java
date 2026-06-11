package Factory;


/**
 * Fábrica Concreta responsável por instanciar objetos do tipo Tutor.
 */
public class TutorFactory implements pessoaFactory {

    @Override
    public pessoa criarPessoa(String nome, String documento) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome do tutor nao pode ser vazio.");
        }
        return new Tutor(nome, documento);
    }
}