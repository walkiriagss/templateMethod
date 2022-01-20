public abstract class Imovel {

    protected String cidade;
    protected String proprietario;
    private float valor;

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }


    public abstract double calculaValor();

    public String getTipo() {
        return "Imovel";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "cidade=" + this.cidade +
                ", proorietário=" + this.proprietario +
                ", valor final=" + this.calculaValor() +
                '}';
    }
}
