package seguranca;

/**
 * @author Pedro Henrique <pedroohenriquealmeida05@gmail.com>
 */


/**
 * Classe que contém as informações reais e confidenciais do pet.
 */
public class ProntuarioReal implements IProntuario {

    private String historicoEvolucao;
    private String diagnostico;

    public ProntuarioReal(String diagnostico, String historicoEvolucao) {
        this.diagnostico = diagnostico;
        this.historicoEvolucao = historicoEvolucao;
    }

    @Override
    public String acessarDadosClinicos() {
        return "Diagnóstico: " + diagnostico + " | Histórico: " + historicoEvolucao;
    }

    @Override
    public void adicionarEvolucao(String texto) {
        this.historicoEvolucao += " -> " + texto;
    }                
    
}
