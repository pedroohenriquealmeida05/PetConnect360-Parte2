package Factory;


/**
 * Produto Concreto: Representa o cliente do Pet Shop / Clínica.
 */
public class Tutor extends pessoa {
    
    public Tutor(String nome, String documento) {
        super(nome, documento);
    }

    @Override
    public String exibirDetalhes() {
        return "Tutor: " + this.nome + " | CPF: " + this.documento;
    }
}
