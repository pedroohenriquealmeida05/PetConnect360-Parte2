package financeiro;

/**
 * @author Pedro Henrique <pedroohenriquealmeida05@gmail.com>
 */


/**
 * Contexto do PDV que delega o fechamento da conta para uma Estrategia selecionada.
 */

public class AtendimentoPDV {
    private float valorTotal;
    private EstrategiaPagamento estrategiaSelecionada;

    public AtendimentoPDV(float valorBase) {
        this.valorTotal = valorBase;
    }

    /**
     * Permite trocar o algoritmo de pagamento em tempo de execução.
     */
    public void setEstrategiaPagamento(EstrategiaPagamento estrategia) {
        this.estrategiaSelecionada = estrategia;
    }

    /**
     * Fecha a conta utilizando a estratégia injetada.
     * @return O valor final calculado.
     */
    public float fecharConta() {
        if (this.estrategiaSelecionada == null) {
            throw new IllegalStateException("Operação bloqueada: Selecione um método de pagamento.");
        }
        return this.estrategiaSelecionada.processarPagamento(this.valorTotal);
    }
    
}