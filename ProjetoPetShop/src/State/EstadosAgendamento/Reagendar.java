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
public class Reagendar extends Agendamento {
     public Reagendar(Metodos agendamento){
        super(agendamento);
    }
    
    @Override
    public String confirmado(){
        agendamento.setEstado(new Confirmar(agendamento));
        return("Seu Cadastro reagendado foi confirmado");
    }
    
    @Override
    public String cancelar(){
        agendamento.setEstado(new Cancelar(agendamento));
        return("Seu Cadastro reagendado foi cancelado");
    }
    
    @Override
    public String concluido(){
        agendamento.setEstado(new Concluir(agendamento));
        return("Seu Cadastro reagendado foi concluido");
    }
    
      @Override
    public String reagendar(){
      
        return("Seu Cadastro foi reagendado e vai continuar com o status de reagendado");
    }
    
      public String pendente(){
      
        return("Seu cadastro pendente foi ragendado");
    }
}
