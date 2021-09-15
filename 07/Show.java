import java.util.Scanner;
public class Show {
    /*Crie  um   ingresso.   Peça  para   o   usuário   digitar  1  para   normal   e   2   para  VIP.
Conforme a escolha do usuário, diga se o ingresso é do tipo normal ou VIP. Se for VIP,
peça   para   ele   digitar   1   para   camarote   superior   e   2   para   camarote   inferior.
Conforme  a escolha  do usuário, diga  se que o VIP é camarote  superior  ou inferior.
Imprima o valor do ingresso.*/
    static Scanner for_ints = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("DIGITE 1 PARA ADQUIRIR O INGRESSO NORMAL");
        System.out.println("DIGITE 2 PARA ADQUIRIR O INGRESSO VIP   ");
        int ing = for_ints.nextInt();
        switch (ing) {
            case (1): {
                Normal end = new Normal();
                end.imprimeTipo();
                end.imprimeValor();
                System.exit(0);
                break;
            }
            case (2): {
                System.out.println("DIGITE 1 PARA SER INSERIDO NO CAMAROTE INFERIOR");
                System.out.println("DIGITE 2 PARA SER INSERIDO NO CAMAROTE SUPERIOR");
                int cam = for_ints.nextInt();
                switch (cam) {
                    case (1): {
                        CamaroteInferior end2 = new CamaroteInferior();
                        end2.imprimeTipo();
                        end2.imprimeLocalização();
                        end2.imprimeValor();
                        for_ints.close();
                        System.exit(0);
                        break;
                    }
                    case(2): {
                        CamaroteSuperior end3 = new CamaroteSuperior();
                        end3.imprimeTipo();
                        end3.imprimeLocalização();
                        end3.imprimeValor();
                        for_ints.close();
                        System.exit(0);
                        break;
                    }
                }
                break;
            }
         }
    }
}