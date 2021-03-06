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
    public Departamento(String nome, Pessoa p1, Pessoa p2) {
        setNome(nome);
        registrarPessoa(p1);
        registrarPessoa(p2);
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
        this.pessoa_vectorr.add(person);
    }
    public void desvincularPessoa(String nome) {
        if (this.pessoa_vectorr.size() > 2) {
            for (Pessoa person : this.pessoa_vectorr) {
                if (person.informaNome().equals(nome)) {
                    this.pessoa_vectorr.remove(person);
                    break;
                }
            }
        }
        else {
            System.out.println("Cada departamento deve conter no minimo 2 pessoas. Desvinculacao invalida");
        }
    }
    public void mostrarPessoas() {
        for (Pessoa person : this.pessoa_vectorr) {
            System.out.println(person.informaNome());
        }
    }
}