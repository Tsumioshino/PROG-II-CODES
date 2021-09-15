public class ContaCorrente {
    protected float saldo;
    public ContaCorrente() {
    }

    public ContaCorrente(float saldo) {
        this.depositar(saldo);
    }
    public void depositar(float valor) {
        this.saldo += valor;
    }

    public boolean sacar(float valor) {
        if (this.saldo < valor) {
            return false;
        }
        else {
            this.saldo -= valor;
            return true;
        }
    }
    public boolean transferir(ContaCorrente conta) {
        conta.depositar(this.saldo);
        this.saldo = 0;
        return true;
    }
}