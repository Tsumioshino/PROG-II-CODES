import java.util.Scanner;   
final class Main {
    public static void main(String args[]){
        Scanner imp_variables = new Scanner(System.in); //Scanner para qualquer STRING do código.
        System.out.println("Numero da questao (3, 4, 5, 6 ou 7): ");
        Scanner question_and_numbers = new Scanner(System.in); //Scanner para qualquer INTEIRO do código.
        int number = question_and_numbers.nextInt();
        switch (number) {
            case 3: {
                IntegerComparison test_n = new IntegerComparison();
                System.out.println("Digite o primeiro numero: ");
                int n_one = question_and_numbers.nextInt();
                System.out.println("Digite o segundo numero: ");
                int n_two = question_and_numbers.nextInt();
                System.out.println(test_n.highestBetween(n_one, n_two));
                break;
            }
            case 4: {
                IntegerComparison test_n = new IntegerComparison();
                System.out.println("Digite o numero: ");
                int n_one = question_and_numbers.nextInt();
                test_n.toZero(n_one);
                break;
            }
            case 5: {
                SumMultEvenOdd test_n = new SumMultEvenOdd();
                //Scanner choose = new Scanner(System.in);
                System.out.println("Escolha qual questao voce quer ver: (1 para soma, 2 para multiplicacao)");
                int choice = question_and_numbers.nextInt();
                switch (choice) {
                    case 1: {
                        test_n.sumOdd();
                        break;
                    }
                    case 2: {
                        test_n.evenMult();
                        break;
                    }
                }
                break;
            }
            case 6: {
                SwapAandB swapp = new SwapAandB();
                System.out.println("Digite o valor de 'a': ");
                Object a = imp_variables.nextLine();
                System.out.println("Digite o valor de 'b': ");
                Object b = imp_variables.nextLine();
                System.out.println("Escolha qual questao voce quer ver: (1 para troca com variavel, 2 para troca sem variavel) ");
                int with_or_without = question_and_numbers.nextInt();
                switch (with_or_without) {
                    case 1: {
                        swapp.swapVarWithVar(a, b);
                        break;
                    }
                    case 2: {
                        swapp.swapVarWithoutVar(a, b);
                        break;
                    }
                }
                break;
            }
            case 7: {
                boolean openn = true;
                Agenda cont_book = new Agenda();
                while (openn) {
                    System.out.println("Adicionar, procurar, deletar contato ou sair da agenda? (1, 2, 3, 4) ");
                    int mailll = question_and_numbers.nextInt();
                    //Scanner imp_v1 = new Scanner(System.in);
                    switch (mailll) {
                        case 1: {
                            System.out.println("Digite o nome do contato: ");
                            String contact_a = imp_variables.nextLine();
                            System.out.println("Digite o e-mail do contato: ");
                            String email_a = imp_variables.nextLine();
                            Contato name = new Contato(contact_a, email_a);
                            cont_book.addContato(name.getContatoName(), name.getContatoEmail());
                            break;
                        }
                        case 2: {
                            System.out.println("Digite o nome do contato: ");
                            String contact_f = imp_variables.nextLine();
                            cont_book.findContato(contact_f);
                            break;
                        }
                        case 3: {
                            System.out.println("Digite o nome do contato: ");
                            String contact_d = imp_variables.nextLine();
                            cont_book.delContato(contact_d);
                            break;  
                        }
                        case 4: {
                            openn = false;
                            break;
                        }
                        default:
                            System.out.println("Comando Invalido!");
                    }
                } 
            }
            default: {
                System.exit(1);
            }
        }
        imp_variables.close();
        question_and_numbers.close();
        System.exit(0);
    }
}