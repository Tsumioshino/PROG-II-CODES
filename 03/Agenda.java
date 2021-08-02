/*Crie  uma  classe  Agenda  que  pode  armazenar  10  pessoas  e que seja  capaz de  realizar
as seguintes operações:
◦ void armazenaPessoa(Pessoa pessoa);
◦ void removePessoa(String nome);
◦ int buscaPessoa(String nome); // informa em que posição da agenda está a pessoa
◦ void imprimeAgenda(); // imprime os dados de todas as pessoas da agenda
void imprimePessoa(int index); // imprime os dados da pessoa que esta na posicao "i" da
agenda.
*/
import java.util.ArrayList;
public class Agenda {
    ArrayList<Pessoa> pessoa_vector = new ArrayList<Pessoa>(10);
    public void armazenaPessoa(Pessoa pessoa) {
        pessoa_vector.add(pessoa);
    }
    public void removePessoa(String nome) {
        for (Pessoa person : pessoa_vector) {
            if (person.informaNome().equals(nome)) {
                pessoa_vector.remove(person);
            }
        }
    }
    public int buscaPessoa(String nome) {
        int i = 0;
        for (Pessoa person : pessoa_vector) {
            if (person.informaNome().equals(nome)) {
                return i;
            }
            i += 1;
        }
        return -1;
    }
    public void imprimeAgenda() {
        for (Pessoa person : pessoa_vector) {
            System.out.print("Nome: ");
            System.out.println(person.informaNome());
            System.out.print("Data de nascimento: ");
            System.out.print(person.informaDiaDeNascimento());
            System.out.print("/");
            System.out.print(person.informaMesDeNascimento());
            System.out.print("/");
            System.out.println(person.informaAnoDeNascimento());
            System.out.print("Idade: ");
            System.out.println(person.informaIdade());
        }
    }
    public void imprimePessoa(int index) {
        try {
            System.out.println(pessoa_vector.get(index));
        } catch ( Throwable IndexOutOfBoundsException ) {
            System.out.println("Index Invalido!");
        }
    }

}