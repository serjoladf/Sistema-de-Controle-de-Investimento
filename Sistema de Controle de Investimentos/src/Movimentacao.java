public class Movimentacao {

    public String nomeInvestimento;
    public double valorInvestido = 0;
    public double taxaDeRetornoAnual = 0;
    public double rendimento = 0;

    public Movimentacao(String nomeInvestimento, double valorInvestido, double taxaDeRetornoAnual) {
        this.nomeInvestimento = nomeInvestimento;
        this.valorInvestido = valorInvestido;
        this.taxaDeRetornoAnual = taxaDeRetornoAnual;
    }

    public double calculaRendimento(){
        return valorInvestido * (taxaDeRetornoAnual / 100);
    }


    public double getTaxaDeRetornoAnual() {
        return taxaDeRetornoAnual;
    }

    public void setTaxaDeRetornoAnual(double taxaDeRetornoAnual) {
        this.taxaDeRetornoAnual = taxaDeRetornoAnual;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public double getValorInvestido() {
        return valorInvestido;
    }

    public void setValorInvestido(double valorInvestido) {
        this.valorInvestido = valorInvestido;
    }

    public String getNomeInvestimento() {
        return nomeInvestimento;
    }

    public void setNomeInvestimento(String nomeInvestimento) {
        this.nomeInvestimento = nomeInvestimento;
    }
}
