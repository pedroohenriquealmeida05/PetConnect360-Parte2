/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

package Decorator;

import org.junit.Test;
import static org.junit.Assert.*;
/**
*
*@author violi
*
 * Classe de testes unitários para validação do padrão estrutural Decorator.
 * Verifica a composição dinâmica de preços e descrições do Módulo Comercial.
 * * Vinculado aos Casos de Teste: CT-10, CT-11 e CT-12.
 */

public class ServicoDecoratorTest{

    /**
     * CT-10: Valida o comportamento isolado do serviço base (sem adicionais).
     */
    @Test
    public void testarCT10_ServicoBaseApenasBanho() {
        Servico servico = new ServicoBase();
        
        assertEquals(40.00f, servico.getPrecoFinal(), 0.001);
        assertEquals("Banho Padrão", servico.getDescricao());
    }

    /**
     * CT-11: Valida a agregação dinâmica de um único decorador (Adicional de Tosa).
     */
    @Test
    public void testarCT11_ServicoComAdicionalTosa() {
        Servico servico = new ServicoBase();
        servico = new AdicionalTosa(servico); // Aplica o Decorator de Tosa
        
        assertEquals(60.00f, servico.getPrecoFinal(), 0.001);
        assertEquals("Banho Padrão + Adicional de Tosa", servico.getDescricao());
    }

    /**
     * CT-12: Valida o encapsulamento de múltiplos decoradores empilhados 
     * em tempo de execução (Tosa + Hidratação).
     */
    @Test
    public void testarCT12_ServicoCompletoComTosaEHidratacao() {
        Servico servico = new ServicoBase();
        servico = new AdicionalTosa(servico);       // Primeiro decorator (+20.00)
        servico = new AdicionalHidratacao(servico); // Segundo decorator (+15.00)
        
        assertEquals(75.00f, servico.getPrecoFinal(), 0.001);
        assertEquals("Banho Padrão + Adicional de Tosa + Adicional de Hidratação", servico.getDescricao());
    }
}

