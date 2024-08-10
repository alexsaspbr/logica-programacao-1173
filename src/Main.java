import ada.tratamentoerros.ContaEnquadradaException;
import ada.tratamentoerros.TratamentoErros;
import ada.utilitario.Util;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

   /*     TratamentoErros tratamentoErros = new TratamentoErros();
        try {
            //tratamentoErros.tratarErroChecked();
            tratamentoErros.tratarErroUnChecked();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }*/

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero");
        Integer numero = Util.convertaLiteralParaNumero(entrada.nextLine());
        System.out.println(numero);

    }


}
