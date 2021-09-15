public class Mamifero extends Animal {
    private String alimento;
    public Mamifero(String nome, double comprimento, int numero_de_patas, String cor, String ambiente, double velocidade, String alimento) {
        super(nome, comprimento, numero_de_patas, cor, ambiente, velocidade);
        setAlimento(alimento);        
    }
    protected void setAlimento(String alimento) {
        this.alimento = alimento;
    }
    public String getAlimento()  {
        return this.alimento;
    }
    public String toString() {
        return "--------------------" + "\nAnimal: " + getNome() + "\nComprimento: " + "\nPatas: " + getNDP() + "\nCor: " + getCor() + "\nAmbiente: " + getAmbiente() + "\nVelocidade: " + getVelocidade() + "\nAlimentos: " + getAlimento() + "\n--------------------";
    } 
}