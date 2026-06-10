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
 * Classe para cancelar o agendamento, so nao consegue cancelar se ja tiver concluido.
 */
public class EstadoCancelar extends EstadoAgendamento{
     public EstadoCancelar(ContextoAgendamento agendamento){
        super(agendamento);
    }
    
    @Override
    public String estadoconfirmado(){
       
        return("Seu Cadastro foi cancelado");
    }
    
    @Override
    public String estadocancelar(){
        return("Seu Cadastro foi cancelado");
    }
    
    @Override
    public String estadoconcluido(){
        agendamento.setEstado(new EstadoConcluir(agendamento));
        return("Seu Cadastro foi concluido nao eh possivel cancelar");
    }
    
      @Override
    public String estadoreagendar(){
        agendamento.setEstado(new EstadoReagendar(agendamento));
        return("Seu Cadastro foi reagendado foi concluido");
    }
    
      public String pendente(){
      
        return("Seu cadastro pendente foi cancelado");
    }

}
