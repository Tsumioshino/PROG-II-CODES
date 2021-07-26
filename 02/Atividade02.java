import java.util.Scanner;
import java.util.ArrayList;
class Atividade02 {
    private static double hypotenuse(double side1, double side2) {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }
    private static int smallest(int x, int y, int z) {
        //((x > y)? ((x > z)? return x : return z) : ((y > z)? return y : return z)); falha
        if (x < y) {  
            if (x < z) { 
                return x; 
            } 
            else { 
                return z;
            } 
        } 
        else { 
            if (y < z) { 
                return y; 
            } 
            else {
                return z; 
            } 
        } 
    }
    private static void instructions() {
        System.out.println("O metodo hypotenuse() toma 2 floats de ate duas casas decimais" +
        "(equivalente aos lados de um triangulo) como parametros obrigatorios, " + 
        "e atraves da formula de Pitagoras, calcula a hipotenusa desse triangulo");
        System.out.println("O metodo smallest() toma 3 numeros inteiros como parametros obrigatorios, " +
        "e retorna o menor valor dentre os tres.");
        System.out.println("O metodo intToFloat() toma 1 numero inteiro como parametro obrigatorio, " + 
        "e retorna o mesmo valor convertido em float.");
    }
    private static float intToFloat(int number) {
        return (float)number;
    }
    private static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        else { 
            return false;
        }
    }
    private static float celsius(int fahrenheit) {
        return (float)(5.0 / 9.0 * (fahrenheit - 32));
    }
    private static float fahrenheit(int celsius) {
        return (float)(9.0 / 5.0 * celsius + 32);
    }
    private static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));    
    }
    public static void main(String[] args) {
        Scanner for_strings = new Scanner(System.in);
        Scanner for_numbers = new Scanner(System.in);
        Scanner for_doubles = new Scanner(System.in);
        System.out.println("Digite o numero da questao (1, 2, 4, 5, 6): ");
        int first_choose = for_numbers.nextInt();
        switch (first_choose) {
            case (1): {
                System.out.println("Digite o numero da alternativa: ");
                System.out.println("1 para acessar o metodo hypotenuse");
                System.out.println("2 para acessar o metodo smallest");
                System.out.println("3 para acessar o metodo instructions");
                System.out.println("4 para acessar o metodo intToFloat");
                int first_q_choose = for_numbers.nextInt();
                switch (first_q_choose) {
                    case (1): {
                        System.out.println("Digite o valor do primeiro lado:");
                        double l1 = for_doubles.nextDouble();
                        System.out.println("Digite o valor do segundo lado:"); 
                        double l2 = for_doubles.nextDouble(); 
                        System.out.printf("A hipotenusa desse triangulo e: %2f%n", hypotenuse(l1, l2));
                        break;
                    }
                    case (2): {
                        System.out.println("Digite o valor do primeiro numero: ");
                        int x = for_numbers.nextInt();
                        System.out.println("Digite o valor do segundo numero: ");
                        int y = for_numbers.nextInt();
                        System.out.println("Digite o valor do terceiro numero: ");
                        int z = for_numbers.nextInt();
                        System.out.printf("O menor numero dentre os descritos e: %d%n", smallest(x, y, z));
                        break;
                    }
                    case (3): {
                        instructions();
                        break;
                    }
                    case (4): {
                        System.out.println("Digite um valor inteiro: ");
                        int int_value = for_numbers.nextInt();
                        System.out.printf("Valor em float: %f%n", (intToFloat(int_value)));
                        break;
                    }
                    default: {
                        System.out.println("Comando Invalido");
                        System.exit(1);
                    }
                }
                break;
            }
            case (2): { 
                int x = 2;
                int y = 3;
                System.out.printf("x = %d%n", x);
                System.out.printf("Value of %d + %d is %d%n", x, x, (x + x));
                System.out.printf("%d = %d%n", (x + y), (y + x));
                break;
            }
            case (4): {
                ArrayList<Integer> int_arr = new ArrayList<Integer>();
                String confirmation;
                do {
                System.out.println("Digite o numero que voce quer checar que e par: ");
                int n_for_check = for_numbers.nextInt();
                int_arr.add(n_for_check);
                System.out.print("Digite 'S' para sair ou qualquer outro botao para continuar: ");
                confirmation = for_strings.nextLine();
                } while (confirmation.equals("S") == false);
                for (int n_in_a : int_arr) {
                    System.out.printf("O numero %d ", n_in_a);
                    System.out.printf("e par? %b%n", isEven(n_in_a));
                }
                break;
            }
            case (5): {
                System.out.println("Digite: ");
                System.out.println("a) para abrir o conversor de temperatura de Celsius para Fahrenheit");
                System.out.println("b) para abrir o conversor de temperatura de Fahrenreit para Celsius");
                char option = for_strings.next().charAt(0);
                switch (option) {
                    case ('a'): {
                        System.out.println("Digite o valor, em celsius: ");
                        int c_value = for_numbers.nextInt();
                        System.out.printf("Esse valor, em fahrenheit, equivale a: %f%n", fahrenheit(c_value));
                        break;
                    }
                    case ('b'): {
                        System.out.println("Digite o valor, em fahrenreit: ");
                        int f_value = for_numbers.nextInt();
                        System.out.printf("Esse valor, em celsius, equivale a: %f%n", celsius(f_value));
                        break;
                    }
                    default: {
                        System.out.println("Comando Invalido!");
                        System.exit(1);
                    }
                }
                break;
            }
            case (6): {
                System.out.print("x1 = ");
                double x1 =  for_doubles.nextDouble();
                System.out.print("y1 = ");
                double y1 =  for_doubles.nextDouble();
                System.out.print("x2 = ");
                double x2 =  for_doubles.nextDouble();
                System.out.print("y2 = ");
                double y2 =  for_doubles.nextDouble();
                System.out.printf("A distancia entre essas coordenadas e: %2f%n", distance(x1, y1, x2, y2));
                break;
            }
            default: {
                System.out.println("Comando Invalido!");
                System.exit(1);
            }
        }
       for_strings.close();
       for_numbers.close(); 
       for_doubles.close();
    }
}