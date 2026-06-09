package decorator;
//FERNANDO AUGUSTO
public abstract class ServicoDecorator implements Servico {
protected Servico servico;
public ServicoDecorator(Servico s) {
this.servico = s;
}
@Override
public float getPrecoFinal() {
return servico.getPrecoFinal();
}
@Override
public String getDescricao() {
return servico.getDescricao();
}
}
