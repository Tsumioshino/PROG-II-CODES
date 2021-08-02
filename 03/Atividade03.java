import java.util.Scanner;
public class Atividade03 {
    public static void main(String[] args) {
        Scanner for_ints = new Scanner(System.in);
        System.out.println("Numero da questao (1 ate 5)");
        int question = for_ints.nextInt();
        switch (question) {
            case (1): {
                Pessoa p1 = new Pessoa("Albert Einstein", 14, 3, 1879);
                Pessoa p2 = new Pessoa("Isaac Newton", 4, 1, 1643);
                System.out.println(p1.informaNome());
                System.out.println(p1.informaIdade());
                System.out.println(p2.informaNome());
                System.out.println(p2.informaIdade());
                Pessoa p3 = new Pessoa("Marcus Maciel", 9, 12, 2002);
                System.out.println(p3.informaNome());
                System.out.println(p3.informaIdade());
                break;
            }
            case (2): {
                Universidade u1 = new Universidade("Universidade Federal do Para");
                Universidade u2 = new Universidade("Universidade Federal do Rio de Janeiro");
                Universidade u3 = new Universidade("UNICAMP");
                Departamento d1 = new Departamento("Instituto de Ciencias Naturais e Exatas", new Pessoa("Blaise Pascal", 19, 06, 1623), new Pessoa("George Boole", 2, 11, 1815));
                Departamento d2 = new Departamento("Instituto de Ciencias Juridicas", new Pessoa("Hannah Arendt", 14, 10, 1906), new Pessoa("John Rawls", 21, 02, 1921));
                Departamento d3 = new Departamento("Instituto de Ciencias Biologicas", new Pessoa("Miguel Servet", 27, 10, 1553), new Pessoa("Han", 01, 01, 1991));
                u1.registrarDepartamento(d1);
                d3.desvincularPessoa("Miguel Servet");
                d3.desvincularPessoa("Han");
                d3.mostrarPessoas();
                u2.desvincularDepartamento(d3);
                System.out.println(u3.getNome());
                d1.registrarPessoa(new Pessoa("Albert Einstein", 14, 3, 1879));
                d1.registrarPessoa(new Pessoa("Isaac Newton", 4, 1, 1643));
                d2.registrarPessoa(new Pessoa("Hans Kelsen", 11, 10, 1881));
                d2.registrarPessoa(new Pessoa("Immanuel Kant", 22, 4, 1724));
                d3.registrarPessoa(new Pessoa("George Mendel", 20, 7, 1822));
                d3.registrarPessoa(new Pessoa("Charles Darwin", 12, 2, 1809));
                System.out.println(d1.getNome());
                u1.desvincularDepartamento(d1);
                d1.mostrarPessoas();
                d2.mostrarPessoas();
                d3.mostrarPessoas();
                d3.desvincularPessoa("Charles Darwin");
                u2.registrarDepartamento(d1);
                u2.registrarDepartamento(d2);
                u2.registrarDepartamento(d3);
                u2.mostrarDepartamentos();
                break;
            }
            case (3): {  
                Agenda a1 = new Agenda();
                a1.armazenaPessoa(new Pessoa("Albert Einstein", 14, 3, 1879));
                a1.armazenaPessoa(new Pessoa("Isaac Newton", 4, 1, 1643));
                System.out.println(a1.buscaPessoa("Isaac Newton"));
                System.out.println(a1.buscaPessoa("Albert Einstein"));
                a1.imprimePessoa(a1.buscaPessoa("Albert Einstein"));
                a1.imprimePessoa(a1.buscaPessoa("Isaac Newton"));
                a1.imprimePessoa(a1.buscaPessoa("Alfredo de Sousa"));
                a1.imprimePessoa(a1.buscaPessoa("Isaac Newton"));
                a1.imprimeAgenda();
                a1.armazenaPessoa(new Pessoa("Marcus Maciel", 9, 12, 2002));
                a1.imprimePessoa(a1.buscaPessoa("Marcus Maciel"));
                a1.removePessoa("Albert Einstein");
                a1.imprimePessoa(a1.buscaPessoa("Isaac Newton"));

                break;
            }
            case (4): {
                Elevador e1 = new Elevador(5, 3); //capacidade, numero de andares
                System.out.println(e1.getPessoasAtualmente());
                System.out.println(e1.getAndarAtual());
                e1.desce(); //ele simplesmente n vai descer. n dá erro nem nada. ele NÃO VAI DESCER (programado pra tal caso no térreo)
                System.out.println(e1.getPessoasAtualmente());
                System.out.println(e1.getAndarAtual());
                e1.sobe();
                System.out.println(e1.getPessoasAtualmente());
                System.out.println(e1.getAndarAtual());
                e1.entra();
                e1.sobe();
                System.out.println(e1.getPessoasAtualmente());
                System.out.println(e1.getAndarAtual());
                e1.entra();
                e1.entra();
                e1.entra();
                System.out.println(e1.getPessoasAtualmente());
                System.out.println(e1.getAndarAtual());
                e1.desce();
                System.out.println(e1.getPessoasAtualmente());
                System.out.println(e1.getAndarAtual());
                e1.entra();
                e1.entra();
                e1.entra();
                e1.desce();
                System.out.println(e1.getPessoasAtualmente());
                System.out.println(e1.getAndarAtual());
                e1.desce();
                System.out.println(e1.getPessoasAtualmente());
                System.out.println(e1.getAndarAtual());
                break;
            }
            case (5): {
                Televisao tv1 = new Televisao();
                ControleRemoto cr1 = new ControleRemoto(tv1);
                cr1.aumentarVolume();
                cr1.aumentarVolume();
                cr1.aumentarVolume();
                cr1.aumentarVolume();
                cr1.aumentarVolume();
                System.out.println(tv1.getVolume());
                System.out.println(tv1.getCanal());
                cr1.selecionarCanal(1000);
                System.out.println(tv1.getCanal());
                cr1.mute();
                System.out.println(tv1.getVolume());
                cr1.selecionarCanal(-99);
                System.out.println(tv1.getCanal());
                cr1.canalAnterior();
                System.out.println(tv1.getCanal());
                cr1.canalSeguinte();
                System.out.println(tv1.getCanal());
                for (; tv1.getVolume() < 50; cr1.aumentarVolume()) {}
                System.out.println(tv1.getVolume());
                cr1.selecionarCanal(552);
                for (; tv1.getCanal() > 15; cr1.canalAnterior()) {}
                System.out.println(tv1.getCanal());
                break;
            }
            default: {
                System.out.println("Comando Invalido!");
                System.exit(1);
            }
        }
        for_ints.close();
    }
}