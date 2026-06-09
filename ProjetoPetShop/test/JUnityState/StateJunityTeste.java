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
       
       when(mockEstado.pendente()).thenReturn("Seu Cadastro foi confirmado"); 
       
       agendamento.setData("12/06/2026");
       agendamento.setHora("16:50");
       
      
        //2.confirma
           when(mockEstado.confirmado()).thenReturn("Seu Cadastro foi confirmado"); 
           
                
        //3.conclui
         when(mockEstado.concluido()).thenReturn("Seu Cadastro foi concluido"); 
        
        
         String concluido = mockEstado.concluido();
         String Data = agendamento.getData();
         String Hora = agendamento.getHora(   );
         
          assertEquals("Seu Cadastro foi concluido",concluido);
          assertEquals("12/06/2026", Data);
          assertEquals("16:50", Hora);
         
         System.out.println("1-O seu agendamento foi concluido!");
       verify(mockEstado, times(1)).concluido();
      
    }
    
     @Test
    public void testarReagendamento() {
         //1.prepara para ser pendente
        Metodos agendamento = new Metodos();

       Agendamento mockEstado= mock(Agendamento.class);
       
       when(mockEstado.pendente()).thenReturn("Seu Cadastro foi confirmado"); 
       
       agendamento.setData("12/06/2026");
       agendamento.setHora("16:50");
       
      
        //2.Reagenda pendente
       agendamento.setData("17/09/2026");
       agendamento.setHora("13:25");
       
         when(mockEstado.reagendar()).thenReturn("Seu Agendamento pendente foi reagendado"); 
         
        String reagendado = mockEstado.reagendar();
         String Data = agendamento.getData();
         String Hora = agendamento.getHora();
         
          assertEquals("Seu Agendamento pendente foi reagendado",reagendado);
          assertEquals("17/09/2026", Data);
          assertEquals("13:25", Hora);
         
       verify(mockEstado, times(1)).reagendar();
         System.out.println("2-Seu Agendamento pendente foi reagendado");
    }
    
    @Test
      public void testarCancelar() {
          //1.prepara para ser pendente
        Metodos agendamento = new Metodos();

       Agendamento mockEstado= mock(Agendamento.class);
       
       when(mockEstado.pendente()).thenReturn("Seu Cadastro foi confirmado"); 
       
       agendamento.setData("30/07/2026");
       agendamento.setHora("09:50");
       
      
        //2.confirma
           when(mockEstado.confirmado()).thenReturn("Seu Cadastro foi confirmado"); 
           
                
        //3.conclui
         when(mockEstado.concluido()).thenReturn("Seu Cadastro foi concluido"); 
        
        //4. Tenta o cancelamento do cadastro concluido
        
         when(mockEstado.cancelar()).thenReturn("Seu Cadastro foi concluido nao eh possivel cancelar"); 
         
         
         //Verificações
         String concluido = mockEstado.concluido();
         String falha = mockEstado.cancelar();
         String Data = agendamento.getData();
         String Hora = agendamento.getHora( );
         
         
           assertEquals("Seu Cadastro foi concluido nao eh possivel cancelar",falha);
         
          agendamento.setData("30/07/2026");
          agendamento.setHora("09:50");
          System.out.println("3-O seu agendamento ja esta concluido nao eh possivel cancelar");
          
       verify(mockEstado, times(1)).concluido();
        
    }
}
