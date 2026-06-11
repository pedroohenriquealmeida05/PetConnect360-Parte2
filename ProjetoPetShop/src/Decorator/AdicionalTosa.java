/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package Decorator;

/**
 *
 * @author violi
 */
public class AdicionalTosa implements Servico {
    
    // O Decorator PRECISA guardar uma referência do serviço original que ele está embrulhando
    private final Servico servicoEmbrulhado;

    // O construtor recebe o serviço (que você passou lá no teste)
    public AdicionalTosa(Servico servico) {
        this.servicoEmbrulhado = servico;
    }

    // Você PRECISA implementar os métodos da interface Servico aqui dentro:

    @Override
    public float getPrecoFinal() {
        // Pega o preço do serviço que veio antes e soma o valor da tosa (ex: 20 reais)
        return servicoEmbrulhado.getPrecoFinal() + 20.00f; 
    }

    @Override
    public String getDescricao() {
        // Pega a descrição anterior e acrescenta a tosa
        return servicoEmbrulhado.getDescricao() + " + Adicional de Tosa";
    }
}