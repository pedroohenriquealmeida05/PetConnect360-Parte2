package decorator;
//FERNANDO AUGUSTO
public class AdicionalTosa extends ServicoDecorator {
    private float taxaTosa = 20.00f;

    public AdicionalTosa(Servico s) {
        super(s);
    }

    @Override
    public float getPrecoFinal() {
        return super.getPrecoFinal() + this.taxaTosa;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " + Adicional de Tosa";
    }
}