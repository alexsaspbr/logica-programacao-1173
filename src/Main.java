import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Double salario = Double.parseDouble(args[0]);
        Util.inss(salario);

    }




}

class Util {

    public static Double inss(Double salario) {

        return (salario <= 1212) ? salario * 0.075 :
                      (salario <= 2427.35) ? salario * 0.09 :
                      (salario <= 3641.03) ? salario * 0.12 : salario * 0.14;

    }

}
