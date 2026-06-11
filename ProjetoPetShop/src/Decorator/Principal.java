/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author violi
 */
public class Principal {

    public static void main(String[] args) {
        // 1. Começamos com o banho padrão (R$ 40,00)
        Servico meuServico = new ServicoBase();
        System.out.println("Base: " + meuServico.getDescricao() + " -> R$ " + meuServico.getPrecoFinal());

        // 2. Joga a Tosa por cima (+ R$ 20,00)
        meuServico = new AdicionalTosa(meuServico);
        System.out.println("Com Tosa: " + meuServico.getDescricao() + " -> R$ " + meuServico.getPrecoFinal());

        // 3. Joga a Hidratação por cima de tudo (+ R$ 15,00)
        meuServico = new AdicionalHidratacao(meuServico);
        System.out.println("Completo: " + meuServico.getDescricao() + " -> R$ " + meuServico.getPrecoFinal());
    }
}