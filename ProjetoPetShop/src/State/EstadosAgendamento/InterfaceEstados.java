/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package State.EstadosAgendamento;
import State.EstadoAgendamento;
/**
 *
 * @author igorg
 */
public class InterfaceEstados {
    
  public interface EstadoAgendamento {

    void EstadoReagendar(EstadoAgendamento estado);

    void EstadoCancelar(EstadoAgendamento agendamento);

    void EstadoConcluir(EstadoAgendamento agendamento);
    
    void EstadoConfirmar(EstadoAgendamento agendamento);
    
    void EstadoPendente(EstadoAgendamento agendamento);
}  
}
