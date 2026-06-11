
package Factory;

/**
 * Produto Concreto: Representa um colaborador da clínica.
 * Possui regras adicionais de segurança, integrando-se com o Módulo Proxy.
 */
public class Funcionario extends pessoa {
    private String cargo;
    private String senha;

    public Funcionario(String nome, String documento) {
        super(nome, documento);
    }

    public void setCargo(String cargo) { this.cargo = cargo; }
    public String getCargo() { return cargo; }
    
    public void setSenha(String senha) { this.senha = senha; }
    
    /**
     * Valida a senha do funcionário (usado pelo padrão Proxy).
     * @param senhaDigitada Senha inserida no momento do acesso.
     * @return true se a senha estiver correta, false caso contrário.
     */
    public boolean autenticarUsuario(String senhaDigitada) {
        return this.senha.equals(senhaDigitada);
    }

    @Override
    public String exibirDetalhes() {
        return "Funcionario: " + this.nome + " | Cargo: " + this.cargo;
    }
}
