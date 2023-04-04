public class ContaCorrente extends Conta{

    private double saldo;
    private double taxaOperacao = 0.45;

    @Override

    public void Depositar (double Valor){
        this.saldo += saldo + Valor - taxaOperacao;
    }

    @Override

    public double getSaldo(){
        return this.saldo;
    }

    @Override

    public void sacar(double Valor){
        this.saldo = saldo - Valor + taxaOperacao;
    }
}
