import java.util.Scanner;
import java.lang.Math;
public class AtividadeFive {
    /*1) Faça um programa que mostre a soma de todos os numeros no intervalo de 1 até 100.
    a) Utiliza o recurso For para iterar sobre o intervalo.
    b) Utiliza o recurso While para iterar sobre o intervalo.*/
    private static int forLoopSumOneToOneHundred() {
        int i_sum = 0;
        for (int i = 1; i < 101; i++) {
            i_sum += i;
        };
        return i_sum;
    }
    private static int whileLoopSumOneToOneHundred() {
        int i_sum = 0;
        int i = 1;
        while (i < 101) {
            i_sum += i;
            i += 1;
        }
        return i_sum;
    }
    //2) Escreva um aplicativo que le um inteiro nao negativo, calcula e imprime seu fatorial.
    private static long factorial(long i) {
        long fac = 1;
        for (; i != 0; i--) {
            fac *= i;
        }
        return fac;
    }
    //3) Fazer um programa que imprima a média aritmética e o desvio padrão de uma sequência de n números.
    private static void mediaAndDesvio(double[] numbers) {
        double numbers_sum, counter, media_arit, media_p, desvio_p;
        numbers_sum = counter = media_p = 0;
        for (double element : numbers) {
            numbers_sum += element;
            counter += 1;
        } 
        System.out.println(media_arit = numbers_sum/counter);
        for (double element_2 : numbers) {
            media_p += Math.pow((element_2 - media_arit), 2);
        }
        desvio_p = Math.sqrt(media_p/counter);
        System.out.println(desvio_p);
    }
    /*Escreva um aplicativo que estima o valor da constante matemática e utilizando a fórmula a
seguir. Permita ao usuário inserir o número de termos a calcular.*/
    private static double euler(long termos) {
        double euler = 1;
        for (int i = 1; i <= termos; i++) {
            euler += (Math.pow(1, i))/(factorial(i));
        }
        return euler;
    }
        /*Escreva um aplicativo que computa o valor de e x utilizando a fórmula a seguir. Permita ao
usuário inserir o número de termos a calcular*/ 
    private static double eulerElevadoX(double x, long termos) {
        double euler_x = 1;
        for (long i = 1; i <= termos; i++) {
            euler_x += (Math.pow(x, i))/(factorial(i));
        }
        return euler_x;
    }
    /*7) Calcule o valor de S a partir de uma série infinita. Imprima uma tabela que mostre o valor aproximado de S calculando os 200.000 primeiros
termos dessa série. Quantos termos você tem de utilizar antes de obter um valor que começa com 3,14159?*/
    private static double pi(long termos) {
        double pi = 0;
        long x = 1;
        if ((termos % 2) == 0) {
            for (long i = 0; i <= (termos/2); i++) {
                long y = x + 2;
                pi += ((4.0/x) - (4.0/y));
                x += 4;
            }
        }
        else if ((termos % 2) == 1) {
            for (int i = 0; i <= ((termos/2)-1); i++) {
                long y = x + 2;
                pi += ((4.0/x) - (4.0/y));
                x += 4;
            }
            pi += (4.0/x);
        }
        return pi;
    }
    public static void main(String[] args) {
        Scanner for_ints = new Scanner(System.in);
        Scanner for_longs = new Scanner(System.in);
        System.out.println("Digite o numero da questao (1, 2, 3, 4, 5, 8) ");
        int option = for_ints.nextInt();
        switch (option) {
            case (1): {
                System.out.println("Digite 1 para ver o resultado do loop com for");
                System.out.println("Digite 2 para ver o resultado do loop com while");
                int option_2 = for_ints.nextInt();
                switch (option_2) {
                    case (1): {
                        System.out.println(forLoopSumOneToOneHundred());
                        break;
                    }
                    case (2): {
                        System.out.println(whileLoopSumOneToOneHundred());
                        break;
                    }
                }
                break;
            }
            case (2): {
                System.out.println("Digite um numero inteiro maior ou igual a 0 para ver seu fatorial: ");
                int n_to_fac = for_ints.nextInt();
                if (n_to_fac < 0) {
                    for_ints.close();
                    for_longs.close();
                    throw new IllegalArgumentException("Numero menor que 0!");
                }
                System.out.println(factorial(n_to_fac));
                break;
            }
            case (3): {
                double[] rray = {1.55d, 1.70d, 1.80d};
                mediaAndDesvio(rray);
                break;
            }
            case (4): {
                System.out.println("Digite o numero de termos: ");
                long termos = for_longs.nextLong();
                System.out.printf("Valor aproximado da equacao para %02d termos: %2f%n", termos, euler(termos));
                break;
            }
            case (5): {
                System.out.println("Digite o valor de x: ");
                long x = for_longs.nextLong();
                System.out.println("Digite o numero de termos: ");
                long termos_ex = for_longs.nextLong();
                System.out.println(eulerElevadoX(x, termos_ex));
                break;
            }
            case (8): {
                System.out.println("Digite o numero de termos: ");
                long termos_pi = for_longs.nextLong();
                System.out.printf("O valor de pi para %02d termos e aproximadamente igual a %2f%n", termos_pi, pi(termos_pi));
                System.out.println("E necessario 317098 termos para se obter o primeiro 3,14159");
                System.out.print("Valor da equacao para 200.000 termos: ");
                System.out.println(pi(200000));
                break;
            }
        }
        for_ints.close();
        for_longs.close();
    }
}