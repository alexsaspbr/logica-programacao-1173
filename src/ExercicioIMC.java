import java.util.Scanner;

public interface ExercicioIMC {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Informe sua altura em metros: ");
        double altura = leitura.nextDouble();

        System.out.print("Informe seu peso em Kg: ");
        double peso = leitura.nextDouble();

        double imc = calcularIMC(peso, altura);

        String classificacao = classificarIMC(imc);

        System.out.printf("O valor do seu IMC é %.1f (%s)", imc, classificacao);

        leitura.close();
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static String classificarIMC(double imc) {
        if (imc < 16) {
            return "Muito abaixo do peso";
        } else if (imc < 17) {
            return "Abaixo do peso";
        } else if (imc >= 17 && imc < 18.5) {
            return "Peso normal";
        } else if (imc >= 18.5 && imc < 25) {
            return "Peso normal";
        } else if (imc >= 25 && imc < 30) {
            return "Acima do peso";
        } else if (imc >= 30 && imc < 35) {
            return "Obesidade I";
        } else if (imc >= 35 && imc < 40) {
            return "Obesidade II";
        } else {
            return "Obesidade II";
        }
    }
}
