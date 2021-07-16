public class IntegerComparison {
    public int highestBetween(int number1, int number2) {
        if (number1 > number2) { //se n1 > n2 retorne n1
            return number1;
        }
        else if (number1 < number2) { //se n2 > n1 retorne n2
            return number2;
        }
        return number1; //Caso os números sejam iguais, fica irrelevante qual dos dois retornar (não pode retornar String com print)
    }
    public void toZero(int number1) {
        for (int loop_number = number1; loop_number >= 0; --loop_number) { 
            System.out.println(loop_number);
        }
    }
}

