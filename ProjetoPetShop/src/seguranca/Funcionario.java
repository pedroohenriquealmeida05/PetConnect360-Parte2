package seguranca;

/**
 * @author Pedro Henrique <pedroohenriquealmeida05@gmail.com>
 */


/**
 * Classe que representa os funcionários do sistema para validação de permissões.
 */
public class Funcionario {
    private String nome;
    private String cargo; // Ex: "Veterinario ou atendente.

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo.toUpperCase();
    }

    public String getCargo() {
        return cargo;
    }
}