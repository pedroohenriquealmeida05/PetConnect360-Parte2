/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package State.Estados;

import State.Metodos;
import State.State;
/**
 *
 * @author igorg
 */
public class Pendente extends State{

    public Pendente(Metodos agendamento){
        super(agendamento);
    }
    
    @Override
    public String confirmado(){
        agendamento.setState(new Confirmar(agendamento));
        return("Seu Cadastro foi confirmado porem esta pendente espere um instante");
    }
    
    @Override
    public String cancelar() {
        agendamento.setState(new Cancelar(agendamento));
        return("Seu Cadastro pendente foi cancelado");
    }
    
    @Override
    public String concluido(){
        
        return("Seu Cadastro esta pendente nao eh possivel concluir");
    }
    
      @Override
    public String reagendar(){
        agendamento.setState(new Reagendar(agendamento));
        return("Seu Cadastro vai ser reagendado seu estatus continua como pendente");
    }

    
}
