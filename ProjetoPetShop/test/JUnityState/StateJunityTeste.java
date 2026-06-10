/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package JUnityState;


import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import State.EstadoAgendamento;
import State.ContextoAgendamento;

/**
 *
 * @author Igor Massagardi Igormassagardi@hotmail.com
 */


/**
 * 
 * CT-07
 * 
 */
public class StateJunityTeste {
   
//
   @Test
    public void testarCT07_ConcluirAgendamentoPendente() {
  
        
         //1.prepara para ser pendente
        ContextoAgendamento agendamento = new ContextoAgendamento();

       EstadoAgendamento mockEstado= mock(EstadoAgendamento.class);
       
       when(mockEstado.pendente()).thenReturn("Seu Cadastro foi confirmado"); 
       
     
      
        //2.confirma
           when(mockEstado.estadoconfirmado()).thenReturn("Seu Cadastro foi confirmado"); 
           
                
        //3.conclui
         when(mockEstado.estadoconcluido()).thenReturn("Seu Cadastro foi concluido"); 
        
        
         String concluido = mockEstado.estadoconcluido();
         
         
          assertEquals("Seu Cadastro foi concluido",concluido);
        
         
        
       verify(mockEstado, times(1)).estadoconcluido();
        System.out.println("1-O seu agendamento foi concluido!");
      
    }
    
    
     @Test
    public void testarCT08_ReagendamentodoAgendamentoPendente() {
         //1.prepara para ser pendente
        ContextoAgendamento agendamento = new ContextoAgendamento();

       EstadoAgendamento mockEstado= mock(EstadoAgendamento.class);
       
       when(mockEstado.pendente()).thenReturn("Seu Cadastro foi confirmado"); 
       
       agendamento.setData("12/06/2026");
       agendamento.setHora("16:50");
       
      
        //2.Reagenda pendente
       agendamento.setData("17/09/2026");
       agendamento.setHora("13:25");
       
         when(mockEstado.estadoreagendar()).thenReturn("Seu Agendamento pendente foi reagendado"); 
         
        String reagendado = mockEstado.estadoreagendar();
         String Data = agendamento.getData();
         String Hora = agendamento.getHora();
         
          assertEquals("Seu Agendamento pendente foi reagendado",reagendado);
          assertEquals("17/09/2026", Data);
          assertEquals("13:25", Hora);
         
       verify(mockEstado, times(1)).estadoreagendar();
         System.out.println("2-Seu Agendamento pendente foi reagendado");
    }
    
    @Test
      public void testarCT09_TentarCancelarAgendamentoConcluido() {
          //1.prepara para ser pendente
        ContextoAgendamento agendamento = new ContextoAgendamento();

       EstadoAgendamento mockEstado= mock(EstadoAgendamento.class);
       
       when(mockEstado.pendente()).thenReturn("Seu Cadastro foi confirmado"); 
       
       agendamento.setData("30/07/2026");
       agendamento.setHora("09:50");
       
      
        //2.confirma
           when(mockEstado.estadoconfirmado()).thenReturn("Seu Cadastro foi confirmado"); 
           
                
        //3.conclui
         when(mockEstado.estadoconcluido()).thenReturn("Seu Cadastro foi concluido"); 
        
        //4. Tenta o cancelamento do cadastro concluido
        
         when(mockEstado.estadocancelar()).thenReturn("Seu Cadastro foi concluido nao eh possivel cancelar"); 
         
         
         //Verificações
         String concluido = mockEstado.estadoconcluido();
         String falha = mockEstado.estadocancelar();
         String Data = agendamento.getData();
         String Hora = agendamento.getHora( );
         
         
           assertEquals("Seu Cadastro foi concluido nao eh possivel cancelar",falha);
                                                                                            
          agendamento.setData("30/07/2026");
          agendamento.setHora("09:50");
         
          
       verify(mockEstado, times(1)).estadoconcluido();
         System.out.println("3-O seu agendamento ja esta concluido nao eh possivel cancelar");
    }
}
