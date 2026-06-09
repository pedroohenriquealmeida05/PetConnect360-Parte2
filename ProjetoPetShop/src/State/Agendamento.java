package State;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author igorg
 */
public abstract class Agendamento {
   // Agendamento agendar;
    protected Metodos agendamento;
      
    public Agendamento(Metodos agendamento){
        this.agendamento = agendamento;
    }
    public abstract String reagendar();
    public abstract String confirmado();
    public abstract String cancelar();
    public abstract String concluido();
     public abstract String pendente();
   
}
         
    

 /*
    State(Agendamento agendar){
                                        
        this.agendar = agendar;
    }
  
    
      public static void main(String[] args) {
           String data = "";
    int horario;
         Agendamento agendar = new Agendamento();
        
         Metodos dados = new Metodos();
         
         Estado estado = new Estado();
         
         agendar.Agendamento(dados);
         
        
          System.out.println("Seu Cadastro esta pendente espere um instante");
          estado.Concluir();
     
    }*/