package financeiro;

/**
 * @author Pedro Henrique <pedroohenriquealmeida05@gmail.com>
 */


/**
 * Interface que define o contrato para diferentes algoritmos de pagamento.
 * Aplicação do padrão Strategy para evitar múltiplos ifs no PDV.
 */

public interface EstrategiaPagamento {
    
    /**
     * Processa o valor total aplicando as regras específicas da forma de pagamento.
     * @param valorTotal Valor da compra antes das taxas/descontos.
     * @return Valor final processado.
     */

    float processarPagamento(float valorTotal);
    
}