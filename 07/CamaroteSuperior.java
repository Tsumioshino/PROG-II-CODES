public class CamaroteSuperior extends VIP {
    private String localizacao = "SUPERIOR";
    protected final float preco_f = preco_add + 15.50f;
    public void imprimeLocalização() {
        System.out.println(this.localizacao);
    }
    public void imprimeValor() {
        System.out.println(this.preco_f);
    }

}