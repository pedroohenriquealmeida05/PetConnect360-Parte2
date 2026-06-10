package seguranca;

/**
 * @author Pedro Henrique <pedroohenriquealmeida05@gmail.com>
 */


/**
 * Classe que representa os funcionários do sistema para validação de permissões.
 */
public class Funcionario {
    private String nome;
    private String cargo;
    private String senha;

    public Funcionario(String nome, String cargo, String senha) {
        this.nome = nome;
        this.cargo = cargo.toUpperCase();
        this.senha = senha;
    }
    
    // Construtor sobrecarregado para não quebrar o teste antigo que só passava 2 parâmetros
    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo.toUpperCase();
        this.senha = "senhaPadrao123";
    }

    public String getCargo() {
        return cargo;
    }

    
    /**
     * Autentica o usuário validando a credencial de acesso.
     * @param senhaDigitada Senha inserida no momento do login.
     * @return true se a senha estiver correta, false caso contrário.
     */
    public boolean autenticarUsuario(String senhaDigitada) {
        return this.senha.equals(senhaDigitada);
    }
}