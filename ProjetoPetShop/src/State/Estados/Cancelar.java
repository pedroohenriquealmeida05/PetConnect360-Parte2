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
public class Cancelar extends State{
     public Cancelar(Metodos agendamento){
        super(agendamento);
    }
    
    @Override
    public String confirmado(){
       
        return("Seu Cadastro foi cancelado");
    }
    
    @Override
    public String cancelar(){
        return("Seu Cadastro foi cancelado");
    }
    
    @Override
    public String concluido(){
       
        return("Seu Cadastro foi concluido nao eh possivel cancelar");
    }
    
      @Override
    public String reagendar(){
        agendamento.setState(new Reagendar(agendamento));
        return("Seu Cadastro foi reagendado foi concluido");
    }

}
