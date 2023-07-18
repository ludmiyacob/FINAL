public class NumerosPares {
    public static void main(String[] args ){
        int numero = 1;
        while (numero <= 100) {
            if (numero % 2 == 0) {
                 System.out.println(numero);
            }
            numero++;
        }
    }
}
//usamos el while para que se ejecute el bucle

// utilizamos el if para verificar si el numero actual es par
