/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package JUnityState;


import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import State.Agendamento;
import State.Metodos;

/**
 *
 * @author igorg
 */
public class StateJunityTeste {
    
 

   @Test
    public void testarconcluirpendente() {
         //1.prepara para ser pendente
        Metodos agendamento = new Metodos();

       Agendamento mockEstado= mock(Agendamento.class);
          
       agendamento.setData("20/12/2005");
       agendamento.setHora("12:50");
       
       System.out.println("\n");
        //2.confirma
           when(mockEstado.confirmado()).thenReturn("Seu Cadastro foi confirmado"); 
           
                
        //3.conclui
         when(mockEstado.concluido()).thenReturn("Seu Cadastro foi concluido"); 
        
        
         String concluido = mockEstado.concluido();
         String Data = agendamento.getData();
         String Hora = agendamento.getHora(   );
         
          assertEquals("Seu Cadastro foi concluido",concluido);
          assertEquals("12/12/2026", Data);
          assertEquals("16:50", Hora);
         
       verify(mockEstado, times(1)).concluido();
    }
    /*
      public void testarCancelar() {
         //1.prepara para ser pendente
        Metodos agendamento = new Metodos();

       State mockEstado= mock(State.class);
          
       agendamento.setData("20/12/2005");
       agendamento.setHora("12:50");
       
       System.out.println("\n");
        //2.confirma
           when(mockEstado.confirmado()).thenReturn("Seu Cadastro foi confirmado"); 
           
                
        //3.conclui
         when(mockEstado.concluido()).thenReturn("Seu Cadastro foi concluido"); 
        
        
         String concluido = mockEstado.concluido();
         String Data = agendamento.getData();
         String Hora = agendamento.getHora(   );
         
          assertEquals("Seu Cadastro foi concluido",concluido);
          assertEquals("20/12/2005", Data);
          assertEquals("12:50", Hora);
         
       verify(mockEstado, times(1)).concluido();
    }*/
}
