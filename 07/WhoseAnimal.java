public class WhoseAnimal {
    public static void main(String[] args) {
        Animal camelo = new Animal("Camelo", 150.0, 4, "Amarelo", "Terra", 2.0);
        Peixe shark = new Peixe("Tubarão", 300.0, 0, "Cinzento", "Mar", 1.5, "Barbatanas e Cauda");
        Mamifero bear = new Mamifero("Urso-do-canadá", 180.0, 4, "Vermelho", "Terra", 0.5, "Mel");
        System.out.println(camelo.toString());
        System.out.println(shark.toString());
        System.out.println(bear.toString());
    }
}