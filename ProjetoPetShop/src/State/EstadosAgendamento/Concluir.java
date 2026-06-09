/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package State.EstadosAgendamento;

import State.Metodos;
import State.Agendamento;

/**
 *
 * @author igorg
 */
public class Concluir extends Agendamento{
        public Concluir(Metodos agendamento){
        super(agendamento);
    }
    
    @Override
    public String confirmado(){    
        return("Seu Cadastro foi concluido");
    }
    
    @Override
    public String cancelar(){
       
        return("Seu Cadastro foi concluido e nao eh possivel cancelar");
    }
    
    @Override
    public String concluido(){
        
        return("Seu Cadastro foi concluido");
    }
    
      @Override
    public String reagendar(){
      
        return("Seu Cadastro foi reagendado foi concluido");
    }
    
    public String pendente(){
      
        return("nao da mais para deixar pendende pois foi concluido");
    }
   
    
}
