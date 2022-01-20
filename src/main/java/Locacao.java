
public class Locacao extends Imovel{

    public double calculaValor() {
        double v = this.getValor() * 0.01;
        return v;

    }
}
