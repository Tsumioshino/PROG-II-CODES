public class SumMultEvenOdd {
    public void sumOdd() { //Soma os números ímpares *entre* 1 e 30; (sem incluir os extremos)
        short n = 0; //Tem como base da soma o número 0
        for (int number = 2; number < 30; number++) { //Começa do 2 (não inclui o extremo 1) e vai até o 29 (não inclui o extremo 30), somando +1;
            if (number % 2 == 1) {  //Executa caso seja um número ímpar (resto da divisão por 2 = 1);
                n += number; //Vai somando os números ímpares na variável que tinha como base 0;
            }
        }
        System.out.println(n); //Printa o valor do resultado das múltiplas somas;
    }
    public void evenMult() { //Multiplica os números pares *entre* 1 e 30; (sem incluir os extremos);
        long n = 1; //Base da multiplicação o número 1 (note que o tipo primitivo é long para evitar erros), uma vez que a multiplicação dará um número maior que o tipo int suporta;
        for (int number = 2; number < 30; number++) { //Começa do 2 (não inclui o extremo 1) e vai até o 29 (não inclui o extremo 30), somando +1;
            if (number % 2 == 0) { //Executa caso seja um número par (resto da divisão por 2 = 0);
                n *= number; //Vai multiplicando os números pares na variável que tinha como base 1;
            }          
        }
        System.out.println(n); //Printa o valor do resultado dos múltiplos produtos;
    }
}