/*Criar a classe Pessoa com as seguintes características:
◦ atributos: idade e dia, mes e ano de nascimento, nome da pessoa
◦ metodos:  o calculaIdade(), que recebe a data atual em dias, mes e anos e calcula e
armazena no atributo idade a idade atual da pessoa; o informaIdade(), que retorna o
valor  da  idade;  o  informaNome(),  que  retorna  o  nome  da  pessoa;  o
ajustaDataDeNascimento(), que recebe dia, mes e ano de nascimento como parametros e
preenche nos atributos correspondentes do objeto.
◦ Criar  dois  objetos  da  classe  Pessoa,  um  representando  Albert  Einstein  (nascido  em
14/3/1879) e o outro representando Isaac Newton (nascido em 4/1/1643).
◦ Fazer uma classe principal que instancie os objetos, inicialize e mostre quais seriam as
idades de Einstein e Newton caso estivessem vivos.
*/
import java.time.LocalDate;
public class Pessoa {
    private String nome;
    private int idade;
    private int dia;
    private int mes;
    private int ano;
    public Pessoa(String nome, int dia, int mes, int ano) {
        setNome(nome); 
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }
    public String informaNome() {
        return this.nome;        
    }
    private void setNome(String nome) {
        this.nome = nome;
    }
    public int informaDiaDeNascimento() { 
        return this.dia;
    }
    public int informaMesDeNascimento() {
        return this.mes;
    }
    public int informaAnoDeNascimento() {
        return this.ano;
    }
    private void setDia(int dia) {
        this.dia = dia;
    }
    private void setMes(int mes) {
        this.mes = mes;
    }
    private void setAno(int ano) {
        this.ano = ano;
    }
    private void calculaIdade(int dia_atual, int mes_atual, int ano_atual) { // "seria o setIdade desse programa"
        this.idade = ano_atual - informaAnoDeNascimento(); // - 1; //usa apenas int no parametro por causa que os metodos de LocalDate retornam int
        if ((mes_atual < informaMesDeNascimento()) || ((mes_atual == informaMesDeNascimento()) && (dia_atual < informaDiaDeNascimento()))) {
            this.idade -= 1; //se a pessoa nao tiver feito aniversario naquele ano
        } //(nao chegou no mes OU esta no mes mas (E) antes do dia do aniversario)
    }
    public int informaIdade()   {
        LocalDate now_1 = LocalDate.now();
        calculaIdade(now_1.getDayOfMonth(), now_1.getMonthValue(), now_1.getYear());
        return this.idade;
    }

    protected void ajustaDataDeNascimento(int dia, int mes, int ano) {
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }
}