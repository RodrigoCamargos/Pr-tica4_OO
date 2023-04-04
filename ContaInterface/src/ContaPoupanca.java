public class ContaPoupanca extends Conta {

    private double saldo;
    private double TaxaOperacao = 0.45;
    @Override

    public void  Depositar(double Valor) {
        this.saldo += saldo + Valor - TaxaOperacao;
    }
    @Override
    public double getSaldo(){
        return this.saldo;
    }

    @Override
    public void sacar (double Valor) {
        this.saldo = saldo - Valor ;
    }

}
