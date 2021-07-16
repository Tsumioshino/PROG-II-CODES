public class Contato { //Crie uma classe Contato que possui dois atributos:
    private String nome, email; //nome do tipo String e e-mail do tipo String (default, em classes e package apenas)
    public Contato(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    public void setContatoName(String nome) { this.nome = nome; }
    public String getContatoName() { return nome; }
    public void setContatoEmail(String email) { this.email = email; }
    public String getContatoEmail() { return email; }
}
