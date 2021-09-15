public class Mamifero extends Animal {
    private String alimento;
    public Mamifero(String nome, float comprimento, int numero_de_patas, String cor, String ambiente, float velocidade, String alimento) {
        super(nome, comprimento, numero_de_patas, cor, ambiente, velocidade);
        setAlimento(alimento);        
    }
    protected void setAlimento(String alimento) {
        this.alimento = alimento;
    }
    public String getAlimento()  {
        return this.alimento;
    }
    //public String toString() {
      //  return alimento;
    //} 
}