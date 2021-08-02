/*Crie  uma  classe Televisao e  uma  classe ControleRemoto que  pode  controlar  o  volume e
trocar os canais da televisão. O controle de volume permite:
◦ Aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
◦ Aumentar e diminuir o número do canal em uma unidade;
◦ Trocar para um canal indicado;
◦ Consultar o valor do volume de som e o canal selecionado.*/
class Televisao {
    protected int canal;
    protected int volume;
    public Televisao() {
        setCanal(1); //Poderia ser qualquer valor positivo (vou adotar de padrão > 0 e < 1000)
        setVolume(15); //Qualquer valor positivo entre -1 e 101 (sem incluir os extremos)
    }
    void setCanal(int canal) {
        if ((canal >= 0) && (canal <= 1000)) {
            switch (canal) {
                case (0): {
                    this.canal = 999;
                    break;
                }
                case (1000): {
                    this.canal = 1;
                    break;
                }
                default: {
                    this.canal = canal;
                    break;
                }
            }
        }
    }
    public int getCanal() {
        return this.canal;        
    }
    void setVolume(int volume) {
        if ((getVolume() > -1) && (getVolume() < 101)) {
            this.volume = volume;
        }        
    }
    public int getVolume() {
        return this.volume;        
    }
}