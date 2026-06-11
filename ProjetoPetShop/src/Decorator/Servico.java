/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Decorator;

/**
 *
 * @author violi
 */


/**
 * Interface que define o contrato base para os componentes de serviços do Pet Shop.
 * Funciona como a abstração principal (Component) no padrão Decorator.
 */
public interface Servico {
    float getPrecoFinal();
    String getDescricao();
}

