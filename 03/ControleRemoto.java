/*Crie  uma  classe Televisao e  uma  classe ControleRemoto que  pode  controlar  o  volume e
trocar os canais da televisão. O controle de volume permite:
◦ Aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
◦ Aumentar e diminuir o número do canal em uma unidade;
◦ Trocar para um canal indicado;
◦ Consultar o valor do volume de som e o canal selecionado.*/
class ControleRemoto {
    private Televisao tv;
    public ControleRemoto(Televisao tv_access) {
        this.tv = tv_access;
    }
    public void selecionarCanal(int canal) {
        this.tv.setCanal(canal);
    }
    public void canalSeguinte() {
        this.tv.setCanal(tv.getCanal() + 1);
    }
    public void canalAnterior() {
        this.tv.setCanal(tv.getCanal() - 1);
    }
    public void aumentarVolume() {
        this.tv.setVolume(tv.getVolume() + 1);
    }
    public void diminuirVolume() {
        this.tv.setVolume(tv.getVolume() - 1);
    }
    public void mute() { //quis fazer como bonus :p
        this.tv.setVolume(0);
    }
}