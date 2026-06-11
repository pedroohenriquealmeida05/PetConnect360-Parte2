
import org.junit.Test;
import static org.junit.Assert.*;
import seguranca.*;


/**
 * @author Pedro Henrique <pedroohenriquealmeida05@gmail.com>
 */


/**
 * Classe de testes unitários para validar as restrições de segurança do padrão Proxy.
 */
public class ProntuarioProxyTest {
    
 /**
     * CT-04: Profissional (Veterinário) solicita leitura do histórico clínico.
     * Tipo: Válido.
     */
    @Test
    public void testVeterinarioAcessaProntuarioComSucesso() {
        Funcionario vet = new Funcionario("Dr. Pedro", "VETERINARIO");
        ProntuarioReal real = new ProntuarioReal("Gastrite", "Medicando com antiácido");
        IProntuario proxy = new ProntuarioProxy(real, vet);

        // O Proxy deve permitir e retornar a string correspondente
        String dados = proxy.acessarDadosClinicos();
        assertNotNull(dados);
        assertTrue(dados.contains("Gastrite"));
    }

    /**
     * CT-05: Funcionario (Atendente) solicita leitura do histórico clínico.
     * Tipo: Exceção.
     */
    @Test
    public void testAtendenteAcessaProntuarioLancaExcecao() {
        Funcionario atendente = new Funcionario("Mariana", "ATENDENTE");
        ProntuarioReal real = new ProntuarioReal("Gastrite", "Medicando com antiácido");
        IProntuario proxy = new ProntuarioProxy(real, atendente);

        // O Proxy deve lançar SecurityException para bloquear o acesso (LGPD)
        Exception exception = assertThrows(SecurityException.class, () -> {
            proxy.acessarDadosClinicos();
        });

        assertTrue(exception.getMessage().contains("Acesso Negado"));
    }

    /**
     * CT-06: Profissional (Veterinário) adiciona nova evolução clínica.
     * Tipo: Válido.
     */
    @Test
    public void testVeterinarioAdicionaEvolucaoComSucesso() {
        Funcionario vet = new Funcionario("Dr. Pedro", "VETERINARIO");
        ProntuarioReal real = new ProntuarioReal("Gastrite", "Medicando com antiácido");
        IProntuario proxy = new ProntuarioProxy(real, vet);

        // Adiciona nova evolução via proxy
        proxy.adicionarEvolucao("Pet apresentou melhora clínica");

        // Verifica se a informação foi repassada com sucesso ao objeto real
        String dados = proxy.acessarDadosClinicos();
        assertTrue(dados.contains("Pet apresentou melhora clínica"));
    }
    
}
