/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 * Componente concreto que representa o serviço essencial de banho na clínica.
 * É o objeto base que receberá as extensões dinâmicas dos decoradores.
 * * @author violi
 */
public class ServicoBase implements Servico {
    private String nomeServico = "Banho Padrão";
    private float valorBase = 40.00f;
    private int tempoEstimado = 30;

    @Override
    public float getPrecoFinal() {
        return this.valorBase;
    }

    @Override
    public String getDescricao() {
        return this.nomeServico;
    }
}
