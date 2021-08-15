class Errors05 {
    private void a() {
/*if (age >= 65); //Erro nesse ponto virgula e no fato de que age nao foi declarado anteriormente
            System.out.println("Age is greater than or equal to 65");
        else
            System.out.println("Age is less than 65)"; //E nessas aspas duplas fora do parenteses
    }*/
    int age = 100;
    if (age >= 65) //Basta remover o ponto virgula e declarar o valor de age
            System.out.println("Age is greater than or equal to 65");
        else
            System.out.println("Age is less than 65"); //E colocar as aspas dentro dos parenteses
    }
    private void b() {
        /*int x = 1, total; //Erro no fato de que nao se declara o tipo e atribui simultaneamente
        while (x <= 10) //ENQUANTO declarando mais de uma variavel
        {
            total += x; //alem q como total nao tem um valor predefinido nao tem como somar em cima
            ++x;
        }*/
        int x = 1; //Basta deixar uma linha para cada variavel ou declarar ambas juntas e atribuir um valor apos
        int total = 0; //int x, total; x = 1; total = 0; seria uma opção valida
        while (x <= 10)
        {
            total += x;
            ++x;
        }
    }
    private void c() {
        /*while (x <= 100) //único erro foi que nao foi declarado nem x nem total nessa alternativa, então basta 
            total += x; //adicionar e atribuir valores aos mesmos
            ++x;*/
        int x, total;
        x = 0;
        total = 0;
        while (x <= 100)
            total += x;
            ++x;
    }
    public void d() {
        /*while (y > 0) //nao foi declarado y nessa alternativa e o bloco aberto nao foi fechado
        {
            System.out.println(y);
            ++y;
        }*/
        int y = 100; //entao se declara y
        while (y > 0) 
        {
            System.out.println(y);
            ++y;
        } //e fecha o bloco
    }
}