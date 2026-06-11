package Factory;


/**
 * Produto Concreto: Representa uma empresa parceira que fornece insumos e vacinas.
 */
public class Fornecedor extends pessoa {
    
    public Fornecedor(String nome, String documento) {
        super(nome, documento);
    }

    @Override
    public String exibirDetalhes() {
        return "Fornecedor: " + this.nome + " | CNPJ: " + this.documento;
    }
}
