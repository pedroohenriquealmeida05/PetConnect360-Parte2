package decorator;
//FERNANDO AUGUSTO
public class AdicionalHidratacao extends ServicoDecorator {
    private float taxaHidratacao = 15.00f;

    public AdicionalHidratacao(Servico s) {
        super(s);
    }

    @Override
    public float getPrecoFinal() {
        return super.getPrecoFinal() + this.taxaHidratacao;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " + Adicional de Hidratação";
    }
}

