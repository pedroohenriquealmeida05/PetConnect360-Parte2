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
 * Classe padrao que todo o agendamento vai usar, Pode ser cancelado ou reagendado.
 */
public class EstadoPendente extends EstadoAgendamento{

  
    public EstadoPendente(ContextoAgendamento agendamento){
        super(agendamento);
    }
     //Mostra que o agendamento pendente foi confirmado
    @Override
    public String estadoconfirmado(){
        agendamento.setEstado(new EstadoConfirmar(agendamento));
        return("Seu Aendamento foi confirmado porem esta pendente espere um instante");
    }
      //Mostra que o agendamento pendente foi cancelado
    @Override
    public String estadocancelar() {
        agendamento.setEstado(new EstadoCancelar(agendamento));
        return("Seu Aendamento pendente foi cancelado");
    }
      //Mostra que o agendamento pendente e nao é possivel concluir
    @Override
    public String estadoconcluido(){
        
        return("Seu Aendamento esta pendente nao eh possivel concluir");
    }
      //Mostra que o agendamento pendente foi reagendado
      @Override
    public String estadoreagendar(){
        agendamento.setEstado(new EstadoReagendar(agendamento));
        return("Seu Aendamento vai ser reagendado seu estatus continua como pendente");
    }
  //Confirma que o agendamento esta pendente
      public String pendente(){
      
        return("Ja esta pendente");
    }
}
