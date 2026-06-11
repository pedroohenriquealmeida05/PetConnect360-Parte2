package Factory;


/**
 * Fábrica Concreta responsável por instanciar objetos do tipo Fornecedor.
 */
public class FornecedorFactory implements pessoaFactory {

    @Override
    public pessoa criarPessoa(String nome, String documento) {
        if (documento == null || documento.length() < 14) {
            throw new IllegalArgumentException("CNPJ invalido para fornecedor.");
        }
        return new Fornecedor(nome, documento);
    }

    @Override
    public pessoa criarpessoa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
