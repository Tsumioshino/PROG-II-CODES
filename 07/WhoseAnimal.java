public class WhoseAnimal {
    public static void main(String[] args) {
        Animal camelo = new Animal("Camelo", 150, 4, "Amarelo", "Terra", 2.0);
        Peixe shark = new Peixe("Tubarão", 300, 0, "Cinzento", "Mar", 1.5, "Barbatanas e Cauda");
        Mamifero bear = new Mamifero("Urso-do-canadá", 180, 4, "Vermelho", "Terra", 0.5, "Mel");
        camelo.toString();
        shark.toString();
        bear.toString();
    }
}