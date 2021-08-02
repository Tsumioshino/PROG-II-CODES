/*Fazer um programa com as seguintes caracteristicas:
◦ Uma classe chamada Universidade que tera como atributo um nome e tera um metodo
para informar o seu nome.
◦ Criar uma classe Departamento que tera como atributo um nome e tera um metodo para
informar o seu nome.
◦ Faca com que haja uma associacao entre Universidade e Departamento (Universidade
"contem" Departamento).
◦ Fazer com que uma Universidade possa ter 10 Departamentos.
◦ Criar, pelo menos, 3 departamentos e 2 pessoas por departamento.*/
import java.util.ArrayList;
public class Departamento {
    private String nome;
    private Universidade uni;
    ArrayList<Pessoa> pessoa_vectorr = new ArrayList<Pessoa>();
    public Departamento(String nome) {
        setNome(nome); 
    }
    public String getNome() {
        return this.nome;
    } 
    private void setNome(String nome) {
        this.nome = nome;
    } 
    protected void registrarUniversidade(Universidade university) {
        if (this.checkUniversidade(university)) { 
            this.uni = university;
        }
        else { 
            System.out.println("Departamento com universidade ja registrada");
        }
    }
    private boolean checkUniversidade(Universidade university) {
        if (this.uni == null) {
            return true;
        }
        return false;
    }
    protected void desvincularUniversidade(Universidade university) {
        if (this.checkUniversidade(university) == false) {
            this.uni = null;
        }
        else {
            System.out.println("Departamento nao registrado a essa universidade");
        }
    }
    public void registrarPessoa(Pessoa person) {
        pessoa_vectorr.add(person);
    }
    public void desvincularPessoa(String nome) {
        for (Pessoa person : pessoa_vectorr) {
            if (person.informaNome().equals(nome)) {
                pessoa_vectorr.remove(person);
            }
        }
    }
    public void mostrarPessoas() {
        for (Pessoa person : pessoa_vectorr) {
            System.out.println(person.informaNome());
        }
    }
}