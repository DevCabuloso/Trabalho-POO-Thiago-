public class ArrayUtil {
    public static <T> int count(T[] vetor, T elemento) {
        int contador = 0;
        for (T item : vetor) {
            if (item.equals(elemento)) {
                contador++;
            }
        }    

        return contador;
    }
}
