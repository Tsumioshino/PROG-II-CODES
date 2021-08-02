/*Crie  uma  classe  denominada Elevador para  armazenar  as  informacoes  de  um  elevador
dentro de um predio. A classe deve armazenar o andar atual (terreo = 0), total de andares no
predio  (desconsiderando  o  terreo),  capacidade  do  elevador  e  quantas  pessoas  estao
presentes nele. A classe deve tambem disponibilizar os seguintes métodos:
◦ Inicializa:  que  deve  receber  como  parâmetros  a  capacidade  do  elevador  e  o  total
de andares no prédio (os elevadores sempre começam no térreo e vazio);
◦ Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver
espaço);
◦ Sai:  para  remover  uma  pessoa  do  elevador  (só  deve  remover  se  houver  alguém
dentro dele);
◦ Sobe: para subir um andar (não deve subir se já estiver no último andar);
◦ Desce: para descer um andar (não deve descer se já estiver no térreo);
◦ Encapsular todos os atributos da classe (criar os métodos set e get).*/
public class Elevador {
    private int andar_atual;
    private int total_de_andares;
    private int pessoas_a; //pessoas atualmente no elevador
    private int pessoas_t; //pessoas totais (capacidade total)
    public Elevador(int capacidade_maxima, int andar_maximo) { 
        setPessoasTotal(capacidade_maxima);
        setTotalDeAndares(andar_maximo);
        setPessoasAtualmente(0);
        setAndarAtual(0);
    }
    private void setAndarAtual(int andar_atual) {
        this.andar_atual = andar_atual;        
    }
    public int getAndarAtual() {
        return this.andar_atual;        
    }
    private void setTotalDeAndares(int total_de_andares) {
        this.total_de_andares = total_de_andares;        
    }
    public int getTotalDeAndares() {
        return this.total_de_andares;        
    }
    private void setPessoasAtualmente(int pessoas_a) {
        this.pessoas_a = pessoas_a;        
    }
    public int getPessoasAtualmente() {
        return this.pessoas_a;        
    }
    private void setPessoasTotal(int pessoas_t) {
        this.pessoas_t = pessoas_t;        
    }
    public int getPessoasTotal() {
        return this.pessoas_t;        
    }
    public void entra() {
        if (getPessoasAtualmente() < getPessoasTotal()) {
            setPessoasAtualmente(getPessoasAtualmente() + 1);
        }
    }
    public void sai() {
        if (getPessoasAtualmente() != 0) {
            setPessoasAtualmente(getPessoasAtualmente() - 1);
        }
    }
    public void sobe() {
        if (getAndarAtual() < getTotalDeAndares()) {
            setAndarAtual(getAndarAtual() + 1);
        }
    }
    public void desce() {
        if (getAndarAtual() > 0) {
            setAndarAtual(getAndarAtual() - 1);
        }
    }
}