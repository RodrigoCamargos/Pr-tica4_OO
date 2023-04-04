public class Main {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();
        cc.Depositar(1200.20);
        cc.sacar(300);

        ContaPoupanca cp = new ContaPoupanca();
        cp.Depositar(500.50);
        cp.sacar(25);

        GeradorExtratos gerador = new GeradorExtratos();
        gerador.geradorConta(cc);
        gerador.geradorConta(cp);
    }
}