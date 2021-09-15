
public class Animal {
    protected String nome;
    protected float comprimento;
    protected int numero_de_patas;
    protected String cor;
    protected String ambiente;
    protected float velocidade;
    public Animal(String nome, float comprimento, int numero_de_patas, String cor, String ambiente, float velocidade) {
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
    protected void setComprimento(float comprimento) {
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
    protected void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }
    public String getNome() {
        return this.nome;
    }
    public float getComprimento() {
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
    public float getVelocidade() {
        return this.velocidade;
    }
}

