import java.util.Vector;
public class Agenda { // Crie outra  classe,  chamada  Agenda
    Vector<Object> vetor_contato = new Vector<Object>(); //que  possui  um  atributo contatos do  tipo  vetor  de Contato.
    public void addContato(String nome, String email) { // deve conter um metodo para adicionar um novo contato em uma posição vazia do vetor
        vetor_contato.add(nome); 
        vetor_contato.add(email);
        System.out.println("Contato e email adicionado com sucesso.");
    }
    public Object findContato(String nome) { //outro metodo para buscar um contato 
        int tamanho = vetor_contato.size();
        if (tamanho > 0) {
            for (int ind = 0; ind < tamanho; ind += 2) {
                if (vetor_contato.get(ind).equals(nome)) {
                    System.out.println("Contato encontrado.");
                    String mail = vetor_contato.get(ind+1).toString();
                    Contato cont_data = new Contato(nome, mail);
                    cont_data.setContatoName(nome);
                    cont_data.setContatoEmail(mail);
                    return cont_data; //(retorna uma instancia de contato)
                }
            }
        }
        System.out.println("Contato inexistente.");
        return false; //(como nao existe nao pode retornar uma instancia de contato)
    }
    public void delContato(String nome) { //e, por fim, um metodo para excluir um contato através do nome.
        if (vetor_contato.contains(nome)) {
            vetor_contato.remove(vetor_contato.indexOf(nome) + 1); //Remove o e-mail associado ao nome.
            vetor_contato.remove(vetor_contato.indexOf(nome)); //Remove o nome
            System.out.println("Contato e email deletados com sucesso.");
        }
        else {
            System.out.println("Contato inexistente.");
        }
    }
}
