package decorator;
//FERNANDO AUGUSTO
public class ServicoBase implements Servico {
private String nomeServico = "Banho Padrão";
private float valorBase = 40.00f;
private int tempoEstimado = 30; 
@Override
public float getPrecoFinal(){ 
return this.valorBase;
}
@Override
public String getDescricao() {
return this.nomeServico;
}
}
