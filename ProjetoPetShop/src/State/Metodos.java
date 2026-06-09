/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package State;
import State.EstadosAgendamento.Pendente;
import State.EstadosAgendamento.Reagendar;
/**
 *
 * @author igorg
 */
public class Metodos {
    private String data;
    private String horario;
    private Agendamento estado;
    
    
    public Metodos (){
        this.estado = new Pendente(this);
    }
    
     public void setEstado(Agendamento estado) {
       this.estado = estado;
    }
     
  
    public void setData(String data){
        this.data = data;
    }
    
     public String getData(){
        return data;
    }
     
      public void setHora(String horario){
        this.horario = horario;
    }
    
     public String getHora(){
        return horario;
    }
     

   
     
     
      /*
     
     public void mostrarState() {
        System.out.println("Estado atual: " + estado.getClass().getSimpleName());
    }
    */
    
}
