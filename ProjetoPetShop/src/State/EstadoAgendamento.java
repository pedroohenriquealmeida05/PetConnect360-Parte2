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
   // Agendamento agendar;
    protected ContextoAgendamento agendamento;
      
    public EstadoAgendamento(ContextoAgendamento agendamento){
        this.agendamento = agendamento;
    }
    
    //Inicia as classes abistratas para mudar o estado do agendamento
    public abstract String estadoreagendar();
    public abstract String estadoconfirmado();
    public abstract String estadocancelar();
    public abstract String estadoconcluido();
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