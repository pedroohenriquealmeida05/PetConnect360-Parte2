package Factory;


/**
 * Interface Creator do padrão Factory Method.
 * Declara o método fábrica que será implementado pelas subclasses para gerar os produtos.
 */
public interface pessoaFactory {
    
    /**
     * Método fábrica principal.
     * @param nome Nome do usuário a ser criado.
     * @param documento Documento do usuário.
     * @return Uma instância de uma subclasse concreta de Pessoa.
     */
    pessoa criarPessoa(String nome, String documento);
}
