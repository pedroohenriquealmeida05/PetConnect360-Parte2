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
import State.EstadosAgendamento.EstadoConcluir;
import State.EstadosAgendamento.EstadoPendente;

/**
 *
 * @author Igor Massagardi Igormassagardi@hotmail.com
 */


/**
 * 
 * CT-07 Este serve para fazer a conclusao do agendamento que esta confirmado e vai ser concluido 
 * 
 */
public class StateJunityTeste {
   
//
   @Test
    public void testarCT07_ConcluirAgendamentoPendente() {
  
        
         //prepara o teste
        ContextoAgendamento agendamento = new ContextoAgendamento();
         EstadoAgendamento mockEstado = mock(EstadoAgendamento.class);
        
        //Injeta no mock 
        agendamento.setEstado(mockEstado);
     
        //Conclui
        agendamento.EstadoConcluido();
 
        //Faz A verificacao
       verify(mockEstado, times(1)).estadoconcluido();
       //Mostra que foi com sucesso o agendamento
       System.out.println("1- O seu agendamento foi concluido!");
      
    }
    
    
     @Test
    public void testarCT08_ReagendamentodoAgendamentoPendente() {
        ContextoAgendamento agendamento = new ContextoAgendamento();
            EstadoAgendamento mockEstado = mock(EstadoAgendamento.class);
            
              agendamento.setEstado(mockEstado);
             
              agendamento.EstadoReagendar();
              
              verify(mockEstado, times(1)).estadoreagendar();
              System.out.println("2- Seu Agendamento pendente foi reagendado");
    }
    
    @Test
    public void testarCT09_TentarCancelarAgendamentoConcluido() {
        ContextoAgendamento agendamento = new ContextoAgendamento();
        EstadoAgendamento mockEstado = mock(EstadoAgendamento.class);

        agendamento.setEstado(mockEstado);
        
        doThrow(new IllegalStateException("3-O seu agendamento ja esta concluido nao eh possivel cancelar")).when(mockEstado).estadocancelar();

        assertThrows(IllegalStateException.class, () -> {
            agendamento.Estadocancelar();
        });

        verify(mockEstado, times(1)).estadocancelar();
        System.out.println("3-O seu agendamento ja esta concluido nao eh possivel cancelar");
}
}


