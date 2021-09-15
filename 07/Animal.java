
public class Animal {
    protected String nome;
    protected double comprimento;
    protected int numero_de_patas;
    protected String cor;
    protected String ambiente;
    protected double velocidade;
    public Animal(String nome, double comprimento, int numero_de_patas, String cor, String ambiente, double velocidade) {
        setNome(nome);
        setComprimento(comprimento);
        setNDP(numero_de_patas);
        setCor(cor);
        setAmbiente(ambiente);
        setVelocidade(velocidade);
    }
    protected void setNome(String nome) {
        this.nome = nome;

    }
    protected void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }    
    protected void setNDP(int ndp) {
        this.numero_de_patas = ndp;
    }    
    protected void setCor(String cor) {
        this.cor = cor;
    }    
    protected void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
        
    }  
    protected void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
    public String getNome() {
        return this.nome;
    }
    public double getComprimento() {
        return this.comprimento;
    }    
    protected int getNDP() {
        return this.numero_de_patas;
    }    
    public String getCor() {
        return this.cor;
    }    
    public String getAmbiente() {
        return this.ambiente;
        
    }  
    public double getVelocidade() {
        return this.velocidade;
    }
    public String toString() {
        return "--------------------" + "\nAnimal: " + getNome() + "\nComprimento: " + "\nPatas: " + getNDP() + "\nCor: " + getCor() + "\nAmbiente: " + getAmbiente() + "\nVelocidade: " + getVelocidade() + "\n--------------------";

    }
}

