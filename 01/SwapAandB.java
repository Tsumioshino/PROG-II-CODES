/*Escreva  um  programa  que  troque  o  valor  de  duas  variáveis  primitivas.  Em  seguida,
reescreva esse programa sem fazer uso de variável auxiliar para trocar os valores.*/
public class SwapAandB {
    //public static void main(String[] args)
    public void swapVarWithVar(Object a, Object b) {
        Object c = a;
        System.out.println("'a' inicial: " + a);
        System.out.println("'b' inicial: " + b);
        a = b;
        b = c;
        System.out.println("'a' final: " + a);
        System.out.println("'b' final: " + b);
    }
    public void swapVarWithoutVar(Object a, Object b) {
        Object[] obj_array;
        System.out.println("'a' inicial: " + a);
        System.out.println("'b' inicial: " + b);
        obj_array = new Object[2]; //Array de tamanho 2
        obj_array[0] = a; //Atribui valores ao array
        obj_array[1] = b;
        b = obj_array[0]; //b pega o valor do index 0 (que está com o valor atual de a)
        a = obj_array[1]; //a pega o valor do index 1 (que está com o antigo valor de b)
        System.out.println("'a' final: " + a);
        System.out.println("'b' final: " + b);
    }
}
