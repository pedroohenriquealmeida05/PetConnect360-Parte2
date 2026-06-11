/**
 * teste
 * 
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
    /**
     * cria um constructor com uma super classe para a o estado de cancelamento e cancela qualquer estado exceto para o que ja esta concluido
     * @param agendamento
     */
    public EstadoCancelar(ContextoAgendamento agendamento){
        super(agendamento);
    }
    
     /**
      * Mostra que o agendamento confirmado
     * @return 
      */   
    @Override
    public String estadoconfirmado(){
       
        return("Seu Cadastro confirmado foi cancelado");
    }
    
     /**
      * Mostra que o agendamento foi cancelado
      * @return 
         */
    @Override
    public String estadocancelar(){
        return("Seu Cadastro foi cancelado");
    }
    
    /**
     * Mostra que o agendamento concluido nao pode ser cancelado
     * @return 
    */
    @Override
    public String estadoconcluido(){
        agendamento.setEstado(new EstadoConcluir(agendamento));
        return("Seu Cadastro foi concluido nao eh possivel cancelar");
    }
    
    /**
     * Mostra que o agendamento reagendado foi cancelado
     * @return 
     */
    
      @Override
    public String estadoreagendar(){
        agendamento.setEstado(new EstadoReagendar(agendamento));
        return("Seu Cadastro foi reagendado e foi cancelado");
    }
    
    
      /**
       * Mostra que o agendamento pendente foi cancelado
     * @return 
      */
    @Override
      public String pendente(){
      
        return("Seu cadastro pendente foi cancelado");
    }

}
