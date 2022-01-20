public class Venda extends Imovel{

    public double calculaValor() {
        double v = this.getValor() + (this.getValor() * 0.1);
        return v;

    }
    @Override
    public String getTipo() {
        return "ImovelVenda";
    }
}
