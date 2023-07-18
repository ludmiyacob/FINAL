public class SumaArray {
    public static void main(String[] args){
        int[] array = { 40, 80, 75, 20, 30 };

        int suma = 0;


        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }

        System.out.println("La suma de todos los elementos del array es: " + suma);
    }
}


