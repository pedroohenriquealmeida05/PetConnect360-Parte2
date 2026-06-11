/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package Decorator;

/**
 *
 * @author violi
 */
public class AdicionalTosa extends ServicoDecorator {
    private float taxaTosa = 20.00f;

    public AdicionalTosa(Servico s) {
        super(s);
    }

    @Override
    public float getPrecoFinal() {
        return super.getPrecoFinal() + this.taxaTosa;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Adicional de Tosa";
    }
}