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
 * Classe para Concluir o agendamento, Se acontecer de o sistema tentar cancelar nao vai deixar.
 */

public class EstadoConcluir extends EstadoAgendamento{
    
        public EstadoConcluir(ContextoAgendamento agendamento){
        super(agendamento);
    }
      //Mostra que o agendamento foi concluido 
        
    @Override
    public String estadoconfirmado(){    
        return("Seu Agendamento foi concluido");
    }
    
     //Mostra que o agendamento foi concluido e nao é possivel cancelar
    @Override
    public String estadocancelar(){    
        return("Seu Agendamento foi concluido e nao eh possivel cancelar");
    }
    
     //Mostra que o agendamento foi concluido
    @Override
    public String estadoconcluido(){   
        return("Seu Agendamento foi concluido");
    }
      //Mostra que o agendamento nao é mais possivel ficar pendente pois foi concluido 
      @Override
    public String estadoreagendar(){
      
        return("Seu Agendamento foi reagendado foi concluido");
    }
    
    
      //Mostra que o agendamento nao é mais possivel ficar pendente pois foi concluido 
    
    public String pendente(){
      
        return("nao da mais para deixar pendende pois foi concluido");
    }
   
    
}
