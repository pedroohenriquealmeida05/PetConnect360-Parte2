/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package State.EstadoAgendamento;
import State.Agendamento;
import State.Metodos;
import State.State;

/**
 *
 * @author igor
 */
public class Estado {
   
    public void Pendente(String data, int horario){
         Agendamento agendar = new Agendamento(); 
        Metodos dados = new Metodos(); 
        agendar.Agendamento(dados);
        System.out.println("A data cadastrada foi: " + dados.getData());
          System.out.println("A Hora cadastrada foi: " + dados.getHora());
        System.out.println("Seu cadastro da data eh"+ data+ "\nO horario cadastrado eh: " + horario); 
        
    }
    
    public void Concluir(){
        System.out.println("Seu Cadastro Foi Concluido");
    }
}
