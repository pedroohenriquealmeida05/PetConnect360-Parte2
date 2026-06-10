
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import financeiro.*;

/**
 * @author Pedro Henrique <pedroohenriquealmeida05@gmail.com>
 */


/**
 * Classe de testes unitários validando o padrão Strategy com simulações Mocks.
 */

public class AtendimentoPDVTest {

    /**
     * CT-13: Processar o pagamento final selecionando a estratégia Pix.
     * Tipo: Válido.
     */
    @Test
    public void testProcessarPagamentoComMockDaEstrategiaPix() {
        // 1. Prepara o Mock da interface (Comportamento Dinâmico)
        EstrategiaPagamento mockPix = mock(EstrategiaPagamento.class);
        
        // "Ensinar" o mock: Quando pedirem para processar 100.0, retorne 95.0 (5% desconto)
        when(mockPix.processarPagamento(100.0f)).thenReturn(95.0f);

        // 2. Executa a ação no Contexto (PDV)
        AtendimentoPDV pdv = new AtendimentoPDV(100.0f);
        pdv.setEstrategiaPagamento(mockPix);
        float valorFinal = pdv.fecharConta();

        // 3. Validações
        assertEquals(95.0f, valorFinal, 0.01);
        
        // Verifica dinamicamente se o PDV realmente chamou a estratégia certa.
        verify(mockPix, times(1)).processarPagamento(100.0f);
    }

    /**
     * CT-14: Processar o pagamento final selecionando a estratégia Cartão.
     * Tipo: Alternativo.
     */
    @Test
    public void testProcessarPagamentoComMockDaEstrategiaCartao() {
        EstrategiaPagamento mockCartao = mock(EstrategiaPagamento.class);
        
        // Ensina o Mock: Quando pedirem para processar 100.0, retorne 105.0 (5% taxa)
        when(mockCartao.processarPagamento(100.0f)).thenReturn(105.0f);

        AtendimentoPDV pdv = new AtendimentoPDV(100.0f);
        pdv.setEstrategiaPagamento(mockCartao);
        float valorFinal = pdv.fecharConta();

        assertEquals(105.0f, valorFinal, 0.01);
        verify(mockCartao, times(1)).processarPagamento(100.0f);
    }

    /**
     * CT-15: Tentar fechar a conta no PDV sem selecionar estratégia.
     * Tipo: Exceção.
     */
    @Test(expected = IllegalStateException.class)
    public void testFecharContaSemEstrategiaLancaExcecao() {
        AtendimentoPDV pdv = new AtendimentoPDV(50.0f);
        
        // Tenta fechar a conta sem chamar pdv.setEstrategiaPagamento(...)
        pdv.fecharConta(); 
        
        // O JUnit espera que a exceção seja lançada automaticamente (anotação @Test)
    }
}