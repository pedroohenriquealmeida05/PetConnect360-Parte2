/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Pacote para o pattern State
package State;
import State.EstadosAgendamento.EstadoPendente;
import State.EstadosAgendamento.EstadoReagendar;

/**
 *
 * @author Igor Massagardi Igormassagardi@hotmail.com                                                                                       
 */

/**
 * 
 * Cria um contexto para o agendamento
 */

public class ContextoAgendamento {
    
    /**
     * Cria String para a Data
     */ 
    private String data;
    /**
     *Cria String para Horario
     */
    private String horario;
    
    /**
     *  Cria um atributo ao estado do agendamento  
     */
    private EstadoAgendamento estado;
    
    /**
     * Cria que sempre o estado vai ser pendente sujeito a alterar seu estado
     */
    public ContextoAgendamento (){
        this.estado = new EstadoPendente(this);
    }
    
    /**
     * define o estado do agendamento 
     */
     public void setEstado(EstadoAgendamento estado) {
       this.estado = estado;
    }
     /**
     Pega o estado atual que esta o agendamento
     * @return 
     */
     public EstadoAgendamento getEstado(){
         return estado;
     }
    
     /**
      * Altera o estado atual para pendente
      */
     public void Estadopendente(){
         this.estado.pendente();
     }
     
    /**
     * Altera o estado atual para confirmado
     */
     public void EstadoConfirmado(){
         this.estado.estadoconfirmado();
     }
     
     /**
      * Altera o estado atual para concluido
      */
     public void EstadoConcluido(){
         this.estado.estadoconcluido();
     }
   
     /**
      * Altera o estado atual para reagendamento  
      */
     public void EstadoReagendar(){
         this.estado.estadoreagendar();
     }
     
    /**
     * Altera o estado atual para cancelar
     */
      public void Estadocancelar(){
         this.estado.estadocancelar();
     }
   
    /**
     * define a data do agendamento
     */
    public void setData(String data){
        this.data = data;
    }
     /**pega a data do agendamento
      * 
      * @return 
      */
     public String getData(){
        return data;
    }
     /**
      * define a hora do agendamento
      */
      public void setHora(String horario){
        this.horario = horario;
    }
      
    /**
     * pega a hora do agendamento
     *@return 
     */
      
     public String getHora(){
        return horario;
    }
   
}
