package seguranca;

/**
 * Proxy de Proteção que intercepta as chamadas ao ProntuarioReal.
 * Garante conformidade com a LGPD através do controle de acesso por nível.
 */
public class ProntuarioProxy implements IProntuario {
    private ProntuarioReal prontuarioReal;
    private Funcionario usuarioLogado;

    /**
     * Construtor do Proxy recebendo a instância real e o usuário que tenta o acesso.
     */
    public ProntuarioProxy(ProntuarioReal prontuarioReal, Funcionario usuarioLogado) {
        this.prontuarioReal = prontuarioReal;
        this.usuarioLogado = usuarioLogado;
    }

    @Override
    public String acessarDadosClinicos() {
        verificarPermissaoVeterinario();
        return prontuarioReal.acessarDadosClinicos();
    }

    @Override
    public void adicionarEvolucao(String texto) {
        verificarPermissaoVeterinario();
        prontuarioReal.adicionarEvolucao(texto);
    }

    /**
     * Método privado que valida se o cargo do usuário é VETERINARIO.
     * Caso contrário, barra a execução lançando uma exceção de segurança.
     */
    private void verificarPermissaoVeterinario() {
        if (usuarioLogado == null || !usuarioLogado.getCargo().equals("VETERINARIO")) {
            throw new SecurityException("Acesso Negado: Usuário não possui o nível de permissão necessário (Veterinário).");
        }
    }
}