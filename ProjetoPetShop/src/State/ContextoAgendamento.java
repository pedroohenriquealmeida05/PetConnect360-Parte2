/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package State;
import State.EstadosAgendamento.EstadoPendente;
import State.EstadosAgendamento.EstadoReagendar;
/**
 *
 * @author Igor Massagardi Igormassagardi@hotmail.com
 */
public class ContextoAgendamento {
    //Cria Strings para a Data, Horario e cria um atributo ao estado do agendamento
    
    private String data;
    private String horario;
    private EstadoAgendamento estado;
    
    //Cria que sempre o estado vai ser pendente sujeito a alterar seu estado
    public ContextoAgendamento (){
        this.estado = new EstadoPendente(this);
    }
    
    //define o estado do agendamento 
     public void setEstado(EstadoAgendamento estado) {
       this.estado = estado;
    }
     
  //define a data do agendamento
    public void setData(String data){
        this.data = data;
    }
     //pega a data do agendamento
     public String getData(){
        return data;
    }
     //define a hora do agendamento
      public void setHora(String horario){
        this.horario = horario;
    }
    //pega a hora do agendamento
     public String getHora(){
        return horario;
    }
   
}
