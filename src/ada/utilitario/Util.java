package ada.utilitario;

import java.util.Scanner;

public class Util {

    public static final Double SELIC = 10.5;

    public static Double inss(Double salario) {

        return (salario <= 1212) ? salario * 0.075 :
                (salario <= 2427.35) ? salario * 0.09 :
                        (salario <= 3641.03) ? salario * 0.12 : salario * 0.14;

    }

    public static String leituraEscrita(String solicitacao) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(solicitacao);
        return "A resposta para sua solicitacao é " + entrada.nextLine();
    }

    public static String leitura(String solicitacao) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(solicitacao);
        return entrada.nextLine();
    }

    public static void escrita(String mensagem) {
        System.out.println("A resposta para sua solicitacao é " + mensagem);
    }

}
