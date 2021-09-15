public class VIP extends Ingresso {
    protected final float preco_add = preco + 7.50f;
    public void imprimeValor() {
        System.out.println(this.preco_add);
    }
    public void imprimeTipo() {
        System.out.println("Ingresso VIP");
    }
}