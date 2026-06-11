package State;

/**
 *
 * @author Igor Massagardi igormassagardi@hotmail.com
 */

/**
 * 
 * Classe para iniciar o agendamento
 */

public abstract class EstadoAgendamento {
  
    protected ContextoAgendamento agendamento;
      
    public EstadoAgendamento(ContextoAgendamento agendamento){
        this.agendamento = agendamento;
    }
    /**
     *   Inicia as classes abistratas para mudar o estado do agendamento para reagendamento
     */
    public abstract String estadoreagendar();
    
    /**
     *   Inicia as classes abistratas para mudar o estado do agendamento para confirmado
     */
    
    public abstract String estadoconfirmado();    
    /**
     *   Inicia as classes abistratas para mudar o estado do agendamento para o cancelamento
     */
    
    public abstract String estadocancelar();
    
    /**
     *   Inicia as classes abistratas para mudar o estado do agendamento para a conclusao
     */
    
    public abstract String estadoconcluido();
        
    /**
     *   Inicia as classes abistratas para mudar o estado do agendamento para pendente
     */
    
    public abstract String pendente();
   
}
         
    
