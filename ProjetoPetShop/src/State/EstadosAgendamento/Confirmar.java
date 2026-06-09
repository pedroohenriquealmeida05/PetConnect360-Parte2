/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package State.EstadosAgendamento;

import State.Metodos;
import State.Agendamento;

/**
 *
 * @author igorg
 */
public class Confirmar extends Agendamento {
    public Confirmar(Metodos agendamento){
        super(agendamento);
    }
    
    @Override
    public String confirmado(){
    
        return("Seu Cadastro foi confirmado");
    }
    
    @Override
    public String cancelar(){
   agendamento.setEstado(new Cancelar(agendamento));
        return("Seu Cadastro foi cancelado");
    }
    
    @Override
    public String concluido(){
        agendamento.setEstado(new Concluir(agendamento));
        return("Seu Cadastro foi confirmado e concluido");
    }
    
      @Override
    public String reagendar(){
        agendamento.setEstado(new Reagendar(agendamento));
        return("Seu Cadastro foi reagendado foi Confirmado");
    }

     
    public String pendente(){
      
        return("Seu cadastro pendente foi concluido");
    }
   
}
