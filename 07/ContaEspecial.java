public class ContaEspecial extends ContaCorrente {
    private float limite;
    public ContaEspecial(float saldo, float limite) {
        super(saldo);
        this.limite = limite;
    }

    public boolean sacar(float valor) {
        if (-this.limite == this.saldo) {
            return false;
        }
        if (this.limite+this.saldo < valor) {
            return false;
        }
        else {
            this.saldo -= valor;
            return true;
        }
    }
    public String toString() {
        return "Saldo: " + this.saldo + "\nLimite: " + this.limite;
    }
}