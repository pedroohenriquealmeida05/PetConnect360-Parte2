/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author violi
 */

   public class AdicionalHidratacao extends ServicoDecorator {
    private float taxaHidratacao = 15.00f;

    public AdicionalHidratacao(Servico s) {
        super(s);
    }

    @Override
    public float getPrecoFinal() {
        return super.getPrecoFinal() + this.taxaHidratacao;
    }

    @Override
    public String getDescricao() {
        return servico.getDescricao() + " + Adicional de Hidratação";
    }
} 

