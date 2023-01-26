public class ImprimeArray {
    public static void main(String[] args) {
        int[]a = {2,4,6,8,10};
        a[0] = 2;
        a[1] = 4;
        a[2] = 6;
        a[3] = 8;
        a[4] = 10;

        //Forma de llamar el array a otro lugar.
        metodo(a);

    }
    // Mostrar Array por consola sin corchetes.
    public static void metodo(int[] a) {
        System.out.print("{");
        for (int i=0; i< a.length; i++){
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("}");
    }
}
