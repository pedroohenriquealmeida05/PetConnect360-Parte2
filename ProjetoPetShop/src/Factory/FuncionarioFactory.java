
package Factory;

/**
 * Fábrica Concreta responsável por instanciar objetos do tipo Funcionario.
 * Aplica a regra de negócio de inicializar uma senha padrão para novos colaboradores.
 */
public class FuncionarioFactory implements pessoaFactory {

    @Override
    public pessoa criarPessoa(String nome, String documento) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome do funcionario nao pode ser vazio.");
        }
        Funcionario novoFuncionario = new Funcionario(nome, documento);
        novoFuncionario.setCargo("Atendimento"); // Cargo padrão inicial
        novoFuncionario.setSenha("123456");      // Senha padrão gerada na criação
        return novoFuncionario;
    }
}
