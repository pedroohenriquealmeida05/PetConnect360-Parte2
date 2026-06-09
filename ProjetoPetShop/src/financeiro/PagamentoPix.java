package financeiro;

/**
 * @author Pedro Henrique <pedroohenriquealmeida05@gmail.com>
 */


/**
 * Estratégia concreta para pagamentos via Pix.
 * Regra de negócio: Aplica 5% de desconto automático.
 */

public class PagamentoPix implements EstrategiaPagamento {
    
    @Override
    public float processarPagamento(float valorTotal) {
        return valorTotal - (valorTotal * 0.05f);
    }
    
}