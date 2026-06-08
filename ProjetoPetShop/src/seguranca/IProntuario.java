package seguranca;

/**
 * @author Pedro Henrique <pedroohenriquealmeida05@gmail.com>
 */


/**
 * Interface comum para o Prontuario Real e o Proxy.
 * Define os métodos de acesso e edição clínica do animal.
 */

public interface IProntuario {
    
    /**
     * Retorna os dados clínicos sensíveis do prontuário.
     * @return String contendo o histórico clínico.
     */
    String acessarDadosClinicos();
    
    /**
     * Adiciona uma nova evolução médica ao histórico.
     * @param texto Descrição da evolução clínica.
     */
    void adicionarEvolucao(String texto);
    
}