package financeiro;

/**
 * @author Pedro Henrique <pedroohenriquealmeida05@gmail.com>
 */


/**
 * Estratégia concreta para pagamentos via Cartão de Crédito.
 * Regra de negócio: Aplica 5% de taxa da maquininha.
 */

public class PagamentoCartao implements EstrategiaPagamento {
    
    @Override
    public float processarPagamento(float valorTotal) {
        return valorTotal + (valorTotal * 0.05f);
    }
    
}