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
 * Classe de reagendamento, Pode ser cancelado.
 */
public class EstadoReagendar extends EstadoAgendamento {
    
 
     public EstadoReagendar(ContextoAgendamento agendamento){
        super(agendamento);
    }
     
     //Mostra que o agendamento reagendado foi confirmado
    @Override
    public String estadoconfirmado(){
        agendamento.setEstado(new EstadoConfirmar(agendamento));
        return("Seu Agendamento reagendado foi confirmado");
    }
    
     //Mostra que o agendamento reagendado foi cancelado
    @Override
    public String estadocancelar(){
        agendamento.setEstado(new EstadoCancelar(agendamento));
        return("Seu Agendamento reagendado foi cancelado");
    }
     //Mostra que o agendamento reagendado foi concluido
    @Override
    public String estadoconcluido(){
        agendamento.setEstado(new EstadoConcluir(agendamento));
        return("Seu Agendamento reagendado foi concluido");
    }
     //Mostra que o agendamento foi ragendado porem ainda continua pendente
      @Override
    public String estadoreagendar(){
      
        return("Seu Agendamento foi reagendado e vai continuar com o status de pendente");
    }
    //Mostra que o agendamento pendente foi reagendado
      public String pendente(){
      
        return("Seu Agendamento pendente foi ragendado");
    }
}
