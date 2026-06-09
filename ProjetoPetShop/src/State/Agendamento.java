/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package State;

import java.util.Scanner;

public class Agendamento {
    private Scanner s;
 
    public void Agendamento(Metodos dados) {
        s = new Scanner(System.in);
        
        System.out.println("Olá, qual vai ser o dia do seu agendamento?"); 
        String dataDigitada = s.nextLine(); 
       
        System.out.println("Qual vai ser o horário do seu agendamento?"); 
        int horarioDigitado = s.nextInt();  
       
        
        dados.setData(dataDigitada);
        dados.setHora(horarioDigitado);
    }
}
    
   

