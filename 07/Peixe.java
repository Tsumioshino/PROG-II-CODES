public class Peixe extends Animal {
    private String caracteristica;
    public Peixe(String nome, double comprimento, int numero_de_patas, String cor, String ambiente, double velocidade, String caracteristica) {
        super(nome, comprimento, numero_de_patas, cor, ambiente, velocidade);
        setCaracteristica(caracteristica);        
    }
    protected void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
    public String getCaracteristica()  {
        return this.caracteristica;
    }
    public String toString() {
        return "--------------------" + "\nAnimal: " + getNome() + "\nComprimento: " + "\nPatas: " + getNDP() + "\nCor: " + getCor() + "\nAmbiente: " + getAmbiente() + "\nVelocidade: " + getVelocidade() + "\nCaracteristicas: " + getCaracteristica() + "\n--------------------";
    }
}
