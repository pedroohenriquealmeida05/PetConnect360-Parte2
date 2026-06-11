/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author violi
 *
    /**
 * Componente concreto que representa o serviço essencial de banho na clínica.
 * É o objeto base que receberá as extensões dinâmicas dos decoradores.
 */
public abstract class ServicoDecorator implements Servico {
protected Servico servico;
public ServicoDecorator(Servico s) {
this.servico = s;
}
@Override
public float getPrecoFinal() {
return servico.getPrecoFinal();
}
@Override
public String getDescricao() {
return servico.getDescricao();
}
}

