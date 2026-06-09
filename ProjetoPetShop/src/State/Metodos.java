/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package State;
import State.Estados.Pendente;
import State.Estados.Reagendar;
/**
 *
 * @author igorg
 */
public class Metodos {
    private String data;
    private int horario;
    private State state;
    
    
    public Metodos (){
        this.state = new Pendente(this);
    }
    
     public void setState(State state) {
       this.state = state;
    }
     
     public String confirmado(){
         return state.confirmado();
     }
     
     public String cancelar(){
         return state.cancelar();
     }

      public String concluido(){
         return state.concluido();
     }
     
     public String reagendar(){
         return state.reagendar();
     }
     
     
     public void mostrarState() {
        System.out.println("Estado atual: " + state.getClass().getSimpleName());
    }
    
    public void setData(String data){
        this.data = data;
    }
    
     public String getData(){
        return data;
    }
     
      public void setHora(int horario){
        this.horario = horario;
    }
    
     public int getHora(){
        return horario;
    }
     

   
    
}
