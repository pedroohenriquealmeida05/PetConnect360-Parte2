/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package JUnityState;


import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import State.State;
import State.Metodos;
import State.Agendamento;

/**
 *
 * @author igorg
 */
public class StateJunityTeste {
    
 

   @Test
    public void testarconcluirpendente() {
        Metodos dados = new Metodos();

        //1.prepara para ser pendente
        dados.setData("20/12/2026");
        dados.setHora("14:30");
        
        //2.confirma
                
        //3.conclui
    }
}
