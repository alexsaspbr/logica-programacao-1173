import ada.modelos.Pessoa;
import ada.modelos.PessoaFisica;
import ada.utilitario.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*String nome = "Alex";
        int [] numeros =  {1, 2, 3};
        Integer [] numeros2 =  new Integer [10];
        System.out.println(nome.charAt(2));
        System.out.println(nome.toCharArray());
        System.out.println(Arrays.toString(numeros));
        numeros2[2] = 12;
        System.out.println(Arrays.toString(numeros2));*/

        int [][] matriz = new int[2][2];
        int [][] matriz2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        printMatriz(matriz);
        //printMatriz(matriz2);

        insertMatriz(matriz);
        printMatriz(matriz);
    }

    private static void insertMatriz(int[][] matriz) {
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Digite o numero para a linha %d e coluna %d \n", (i+1), (j+1));
                matriz[i][j] = Integer.parseInt(input.nextLine());;
            }
        }
    }

    private static void printMatriz(int[][] matriz) {
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }


}
