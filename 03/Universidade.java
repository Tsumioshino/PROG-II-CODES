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
public class Universidade {
    private String nome;
    ArrayList<Departamento> dep_vector = new ArrayList<Departamento>(10);  // Fazer com que uma Universidade possa ter 10 Departamentos.
    public Universidade(String nome) {
        setNome(nome); 
    }
    public String getNome() {
        return this.nome;
    } 
    private void setNome(String nome) {
        this.nome = nome;
    }
    protected void registrarDepartamento(Departamento dep) {
        if (dep_vector.contains(dep) == false) {
            dep.registrarUniversidade(this);
            dep_vector.add(dep);
        }
        else {
            System.out.println("Departamento ja registrado!");
        }
    }
    protected void desvincularDepartamento(Departamento dep) {
        if (dep_vector.contains(dep)) {
            dep.desvincularUniversidade(this);
            dep_vector.remove(dep);
        }
        else {
            System.out.println("Departamento nao registrado");
        }
    }
    public void mostrarDepartamentos() {
        for (Departamento dep : dep_vector) {
            System.out.println(dep.getNome());
        }
    }
}
