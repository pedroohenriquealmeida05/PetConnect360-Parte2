/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package State.Estados;

import State.Metodos;
import State.State;

/**
 *
 * @author igorg
 */
public class Reagendar extends State {
     public Reagendar(Metodos agendamento){
        super(agendamento);
    }
    
    @Override
    public String confirmado(){
        agendamento.setState(new Confirmar(agendamento));
        return("Seu Cadastro reagendado foi confirmado");
    }
    
    @Override
    public String cancelar(){
        agendamento.setState(new Cancelar(agendamento));
        return("Seu Cadastro reagendado foi cancelado");
    }
    
    @Override
    public String concluido(){
        agendamento.setState(new Concluir(agendamento));
        return("Seu Cadastro reagendado foi concluido");
    }
    
      @Override
    public String reagendar(){
      
        return("Seu Cadastro foi reagendado e vai continuar com o status de reagendado");
    }
}
