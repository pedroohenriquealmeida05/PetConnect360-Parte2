/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package State;
import java.util.Scanner;
/**
 *
 * @author igorg
 */
public class Agendamento {
    Scanner s;
    private State state; 
    private String Concluir;
    private String data;
    int horario;
    String Pendente = "";
    public void  Agendamento(){
        s = new Scanner(System.in);
        System.out.println("ola qual vai ser o dia do seu agendamento "); 
       data = s.nextLine();
       
     
       
        System.out.println("qual vai ser o horario do seu agendamento "); 
       horario = s.nextInt();
        
        //return Pendente;
    }
    
   
}
