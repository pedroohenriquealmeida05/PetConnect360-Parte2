package Factory;


/**
 * Classe abstrata que representa o produto base no padrão Factory Method.
 * Define os atributos e comportamentos comuns a todos os usuários do PetConnect 360.
 */
public abstract class pessoa {
    protected String nome;
    protected String documento;

    /**
     * Construtor base para a criação de uma pessoa.
     * @param nome Nome do usuário.
     * @param documento Documento de identificação (CPF ou CNPJ).
     */
    public pessoa(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
    }

    public String getNome() { return nome; }
    public String getDocumento() { return documento; }
    
    /**
     * Método abstrato que cada subclasse implementará para exibir seus detalhes específicos.
     * @return String com os dados formatados do usuário.
     */
    public abstract String exibirDetalhes();
}
