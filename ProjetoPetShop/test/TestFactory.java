import Factory.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Classe de testes unitários para o Módulo de Cadastros (Factory Method).
 * Vinculado aos Casos de Teste: CT-01, CT-02 e CT-03.
 */
public class TestFactory {

    /**
     * CT-01: (Cenário Válido) Valida a criação de um Tutor através de sua fábrica.
     */
    @Test
    public void testarCT01_CriacaoDeTutorValido() {
        pessoaFactory factory = new TutorFactory();
        pessoa tutor = factory.criarPessoa("Joao Silva", "111.222.333-44");
        
        assertNotNull(tutor);
        assertTrue(tutor instanceof Tutor);
        assertEquals("Tutor: Joao Silva | CPF: 111.222.333-44", tutor.exibirDetalhes());
    }

    /**
     * CT-02: (Cenário Alternativo/Regra de Negócio) Valida se a fábrica de Funcionário 
     * injeta corretamente a senha e o cargo padrão no momento da criação.
     */
    @Test
    public void testarCT02_RegraNegocioCriacaoFuncionario() {
        pessoaFactory factory = new FuncionarioFactory();
        pessoa funcionario = factory.criarPessoa("Maria Souza", "555.666.777-88");
        
        // Verifica se é realmente um Funcionario
        assertTrue(funcionario instanceof Funcionario);
        
        // Faz o cast para acessar métodos específicos
        Funcionario func = (Funcionario) funcionario;
        
        // Valida as injeções automáticas da Fábrica
        assertEquals("Atendimento", func.getCargo());
        assertTrue(func.autenticarUsuario("123456")); // Senha padrão injetada pela Factory
    }

    /**
     * CT-03: (Cenário de Exceção) Valida o tratamento de erro ao tentar 
     * criar um Fornecedor com CNPJ inválido ou incompleto.
     */
    @Test
    public void testarCT03_ExcecaoCriacaoFornecedorInvalido() {
        pessoaFactory factory = new FornecedorFactory();
        
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            // Tenta criar um fornecedor com CNPJ muito curto
            factory.criarPessoa("Pet Distribuidora", "123"); 
        });
        
        assertEquals("CNPJ invalido para fornecedor.", exception.getMessage());
    }
}