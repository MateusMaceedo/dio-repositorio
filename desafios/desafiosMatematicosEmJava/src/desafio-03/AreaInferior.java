package desafio03;

import java.io.IOException;
import java.util.Scanner;

public class AreaInferior {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double soma = 0;
        char O = leitor.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];

        for(int i = 0; i < M.length;++i){
            for(int j = 0; j < M[i].length;++j){
                M[i][j] = leitor.nextDouble();
            }
        }

        for(int i = 0; i < M.length; ++i){
            for(int j = 0; i < M[i].length; ++j){
                if((i > 6) && (j < i) &&(j > 11 - i))soma += M[i][j];
            }
        }

        if(O == 'M') soma /= 30;
        System.out.println(String.format("%.1f", soma));


        leitor.close();
    }
}