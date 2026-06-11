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
 * O CT-07 do cenario "Válido" serve para fazer a conclusao do agendamento que esta confirmado e vai ser concluido 
 * 
 */
public class StateJunityTeste {
   

   @Test
    public void testarCT07_ConcluirAgendamentoPendente() {      
         /**
          * prepara o teste
          */
        ContextoAgendamento agendamento = new ContextoAgendamento();
         EstadoAgendamento mockEstado = mock(EstadoAgendamento.class);
        
        /**
         * Injeta no mock 
         */
        agendamento.setEstado(mockEstado);
     
        /**
         * Conclui o agendamento
         */
        agendamento.EstadoConcluido();
 
        /**
         * Faz A verificacao
         */
       verify(mockEstado, times(1)).estadoconcluido();
       
       /**
        * Mostra que foi com sucesso o agendamento
        */
       System.out.println("1- O seu agendamento foi concluido!");
      
    }
    
 /**
 * 
 * O CT-08 do cenario "Alternativo" serve para fazer o reagendamento que esta pendente e vai continuar sendo pendente ate ser confirmado.
 * 
 */ 
     @Test
    public void testarCT08_ReagendamentodoAgendamentoPendente() {
        ContextoAgendamento agendamento = new ContextoAgendamento();
            EstadoAgendamento mockEstado = mock(EstadoAgendamento.class);
             
             /**
              * Injeta no mock 
              */
              agendamento.setEstado(mockEstado);
             
              /**
               * Faz o reagendamento
               */
              agendamento.EstadoReagendar();
              
              
              /**
               * Faz a verificação
               */
              verify(mockEstado, times(1)).estadoreagendar();
              
              /**
               * Mostra o que foi feito no output
               */
              System.out.println("2- Seu Agendamento pendente foi reagendado");
    }
    
/**
 * 
 * O CT-09 do cenario "Exceção" serve para fazer tentar cancelar o agendamento que nao consegue pois ja esta concluido.
 * 
 */ 
    
    @Test
    public void testarCT09_TentarCancelarAgendamentoConcluido() {
        /**
         * prepara o teste
         */
        ContextoAgendamento agendamento = new ContextoAgendamento();
        EstadoAgendamento mockEstado = mock(EstadoAgendamento.class);

          /**
           * Injeta no mock
           */
        agendamento.setEstado(mockEstado);
        
        /**
         * Mostra que é uma operação nao permitida
         */
        doThrow(new IllegalStateException("3-O seu agendamento ja esta concluido nao eh possivel cancelar")).when(mockEstado).estadocancelar();

        
        /**
         * Tenta fazer o cancelamento
         */
        assertThrows(IllegalStateException.class, () -> {
            agendamento.Estadocancelar();
        });

        /**
         * Faz a verificação
         */
        verify(mockEstado, times(1)).estadocancelar();
       
        /**
         * Mostra o que foi feito no output
         */
        System.out.println("3-O seu agendamento ja esta concluido nao eh possivel cancelar");
}
}


