public class Mystery
{
public static void main(String[] args) 
{
    int x = 1; //inicia x como 1
    int total = 0; //inicia total como 0

    while (x <= 10) //enquanto x for menor que 10
    {
        int y = x*x; //y é igual aos produtos de x (1 ao quadrado, 2 ao quadrado, 3 ao quadrado...)
        System.out.println(y); //printa y e pula uma linha
        total += y; //soma os valores de y ao total
        ++x; //incrementa em 1 o valor de x
    }

    System.out.printf("Total is %d%n", total); //printa o valor total (%d printa valor inteiro)(%n quebra linha)
}                                              //note que o valor total é a soma dos quadrados dos valores
} //fim da classe Mystery                      //maiores que 0 mas abaixos de 11

