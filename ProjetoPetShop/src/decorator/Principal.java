package decorator;
//FERNANDO AUGUSTO
public class Principal {
    public static void main(String[] args) {
        // 1. Começamos com o banho padrão (R$ 40,00)
        IServico meuServico = new ServicoBase();
        System.out.println("Base: " + meuServico.getDescricao() + " -> R$ " + meuServico.getPrecoFinal());

        // 2. Joga a Tosa por cima (+ R$ 20,00)
        meuServico = new AdicionalTosa(meuServico);
        System.out.println("Com Tosa: " + meuServico.getDescricao() + " -> R$ " + meuServico.getPrecoFinal());

        // 3. Joga a Hidratação por cima de tudo (+ R$ 15,00)
        meuServico = new AdicionalHidratacao(meuServico);
        System.out.println("Completo: " + meuServico.getDescricao() + " -> R$ " + meuServico.getPrecoFinal());
    }
}   

