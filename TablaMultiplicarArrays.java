public class TablaMultiplicarArrays {
    public static void main(String[] args) {


        // Creamos una matriz (array bidimensional) de 10 x 3 posiciones para almacenar
        // (no para imprimir) la tabla de multiplicar del 1.

        int[][] tablaMultiplicar = new int[10][3];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 3; j++) {
                tablaMultiplicar[i][j] = (j + 1) * (i + 1);
            }
        }
    }

    public static int[][] tablaMultiplicar2(int numero) {

        int[][] tablaMultiplicar2 = new int[10][3];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 3; j++) {
                tablaMultiplicar2[i][j] = (j + 1) * (numero * (i + 1));
            }
        }
        System.out.println(tablaMultiplicar2);
        return tablaMultiplicar2;
    }

    public static int[][][] crearArrayTablasMultiplicar() {
        int[][][] arrayTablasMultiplicar = new int[10][10][3];

        for (int i = 0; i < 10; i++) {
            int numero = i + 1;
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 3; k++) {
                    arrayTablasMultiplicar[i][j][k] = (k + 1) * (numero * (j + 1));
                }
            }
        }
        return arrayTablasMultiplicar;
    }
}

