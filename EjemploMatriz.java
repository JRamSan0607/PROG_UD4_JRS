import java.util.Arrays;

public class EjemploMatriz {
    public static void main(String[] args) {
        String[][] matrizDeLetras = {{"A", "B", "C"}, {"D","E","F"}, {"G", "H", "I"}};

        //Bucle para mostrar el Array.
        for (int i = 0; i<=matrizDeLetras.length - 1; i++) {
            System.out.println(Arrays.toString(matrizDeLetras[i]));
        }

        //Bucle para hacer mostrar todas las Letras de el Array una a una.
        for (int i = 0; i< matrizDeLetras.length; i++) {
            for (int j = 0; j < matrizDeLetras[i].length; j++) {
                System.out.println(matrizDeLetras[i][j]);
            }
        }

        //Recorre por filas con (While)
        int i = 0;
        while(i< matrizDeLetras.length) {
            System.out.println(Arrays.toString(matrizDeLetras[i]));
            i++;
        }

        //Recorre por columnas con (While)
        int j = 0;
        i = 0;
        while(j < matrizDeLetras.length) {
            System.out.println(matrizDeLetras[i][j]);
            j++;
        }
        i++;
    }

    public static void BuscarElemento (String[] args) {
        int[] matrizDeLetras = {1,2,3,4,5};
        int i = 4;
        // if (matrizDeLetras == i) {
            System.out.println(i);
        }
    }
//}
