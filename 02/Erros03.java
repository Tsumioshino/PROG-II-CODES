public class Erros03 {
 /* void g() 
    {
        System.out.println("Inside method g");

        void h() //E expressamente proibido ter um metodo dentro de outro metodo (h() dentro de g())
        { 
            System.out.println("Inside method h"); //java vai dar levantar o erro illegal start of expression
        }
    }
*/
void g() 
{
    System.out.println("Inside method g");
}
void h() 
{ //Logo, a soluçao e tirar o metodo h dentro do escopo do metodo g
    System.out.println("Inside method h");
}

 /*   int sum(int x, int y) 
    {
        int result; //O erro e que foi declarado no corpo do metodo que um valor int seria retornado. 
        result = x + y;  //Contudo, nada foi retornado.
    }
*/
    int sum(int x, int y)
    {
        int result;  
        result = x + y;  
        return result; //Ou seja, a soluçao e retornar um valor int (nesse caso, result por ser o metodo sum)
    }
 /*   void f(float a); //Um dos erros e esse ponto virgula aqui (nao se utiliza na criaçao do metodo))
    {
        float a; //e essa variavel aqui (pois ela ja foi definida no parametro, entao esta se repetindo)
        System.out.println(a);
    }
*/
    void f(float a) //entao apaga-se o ponto virgula
    {
        System.out.println(a); //e o float a colocado dentro do bloco
    }
/*
    void product() //O erro e o fato de que foi definido void no corpo do metodo (metodo sem retorno)
    {
        int a = 6, b = 5, c = 4, result;
        result = a * b * c;
        System.out.printf("Result is %d%n", result);
        return result;  //Mas esta retornando um inteiro (nao deveria retornar nada)
    }
*/
    void product() //
    {
        int a = 6, b = 5, c = 4, result;
        result = a * b * c;
        System.out.printf("Result is %d%n", result); //A solucao e simplesmente apagar aquele return
                                                    //de modo que nao haja retorno
    }
}