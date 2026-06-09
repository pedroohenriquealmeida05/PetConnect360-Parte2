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
public class Confirmar extends State {
    public Confirmar(Metodos agendamento){
        super(agendamento);
    }
    
    @Override
    public String confirmado(){
    
        return("Seu Cadastro foi confirmado");
    }
    
    @Override
    public String cancelar(){
         agendamento.setState(new Cancelar(agendamento));
        return("Seu Cadastro foi cancelado");
    }
    
    @Override
    public String concluido(){
        agendamento.setState(new Concluir(agendamento));
        return("Seu Cadastro foi confirmado e concluido");
    }
    
      @Override
    public String reagendar(){
        agendamento.setState(new Reagendar(agendamento));
        return("Seu Cadastro foi reagendado foi Confirmado");
    }

   
}
