/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package State.EstadosAgendamento;

import State.ContextoAgendamento;
import State.EstadoAgendamento;

/**
 *
 * @author Igor Massagardi Igormassagardi@hotmail.com
 */

/**
 * 
 * Classe para Confirmar o agendamento. Pode ser cancelado.
 */
public class EstadoConfirmar extends EstadoAgendamento {
    
    //Muda o estado anterior para confirmado.
    public EstadoConfirmar(ContextoAgendamento agendamento){
        super(agendamento);
    }
    //Mostra que o agendamento foi confirmado
    @Override
    public String estadoconfirmado(){
    
        return("Seu Agendamento foi confirmado");
    }
    
    
     //Mostra que o agendamento confirmado foi cancelado
    @Override
    public String estadocancelar(){
   agendamento.setEstado(new EstadoCancelar(agendamento));
        return("Seu Agendamento confirmado foi cancelado");
    }
      //Mostra que o agendamento foi concluido apois de ser concluido
    
    @Override
    public String estadoconcluido(){
        agendamento.setEstado(new EstadoConcluir(agendamento));
        return("Seu Agendamento foi confirmado e concluido");
    }
    
     //Mostra que o agendamento reagendado foi confirmado
      @Override
    public String estadoreagendar(){
        agendamento.setEstado(new EstadoReagendar(agendamento));
        return("Seu Agendamento foi reagendado foi Confirmado");
    }

      //Mostra que o agendamento pendente foi confirmado
    public String pendente(){
      
        return("Seu Agendamento pendente foi confirmado");
    }
   
}
