package State;

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
    
    public String Concluir();
    public String Cancelar();
    public String Pendente();
    public String Confirmado();
    public String Reagendar();
}
