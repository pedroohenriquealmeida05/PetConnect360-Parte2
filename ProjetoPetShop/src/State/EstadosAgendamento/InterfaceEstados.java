/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package State.EstadosAgendamento;
import State.EstadoAgendamento;

/**
 *
 * @author Igor Massagardi Igormassagardi@hotmail.com
 */
/**
 * 
 * metodo para a interface
 */

public class InterfaceEstados {

     /**
 * Cria uma interface para os estados
 * 
 */
  public interface EstadoAgendamento {

      /**
       * cria um estado na interface para o reagendamento
       * @param estado
       */
    void EstadoReagendar(EstadoAgendamento estado);
    
    /**
     * cria um estado na interface para o cancelamento
     * @param agendamento
     */
    void EstadoCancelar(EstadoAgendamento agendamento);

    /**
     * cria um estado na interface para a conclusão
       * @param agendamento
     */
    void EstadoConcluir(EstadoAgendamento agendamento);
    
    
    /**
     * cria um estado na interface para a confirmação
       * @param agendamento
     */
    void EstadoConfirmar(EstadoAgendamento agendamento);
    
    /**
     * cria um estado na interface para o agendamento pendente
       * @param agendamento
     */
    void EstadoPendente(EstadoAgendamento agendamento);
  }  
}
