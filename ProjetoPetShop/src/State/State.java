package State;
import State.EstadoAgendamento.Estado;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author igorg
 */
public abstract class State {
    Agendamento agendar;
    
    State(Agendamento agendar){
        
        this.agendar = agendar;
    }
    /*
    public String Concluir();
    public String Cancelar();
    public String Pendente();
    public String Confirmado();
    public String Reagendar();
    */
      public static void main(String[] args) {
           String data = "";
    int horario;
         Agendamento agendar = new Agendamento();
        
         Metodos dados = new Metodos();
         
         agendar.Agendamento(dados);
         
          System.out.println("A data cadastrada foi: " + dados.getData());
          System.out.println("A Hora cadastrada foi: " + dados.getHora());
          System.out.println("Seu Cadastro esta pendente espere um instante");
     
    }
}
         
    

