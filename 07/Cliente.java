public class Cliente {
    private String nome;
    public Cliente() {
 
    }

    public Cliente(String nome) {
        setNome(nome);
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    public String toString() {
        return "Nome " + getNome();
    }
}