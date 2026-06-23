public class ListaUtil {

    public static int count(
            Lista<?> lista,
            Object elemento){

        int contador=0;

        for(int i=0;i<lista.size();i++){

            if(lista.get(i).equals(elemento)){

                contador++;

            }

        }

        return contador;
    }

    public static <T extends Comparable<T>>
    T max(Lista<T> lista){

        if(lista==null || lista.size()==0){

            throw new IllegalArgumentException(
                    "Lista vazia ou null");
        }

        T maior=lista.get(0);

        for(int i=1;i<lista.size();i++){

            if(lista.get(i)
                    .compareTo(maior)>0){

                maior=lista.get(i);

            }

        }

        return maior;
    }

    public static <T extends Comparable<T>>
    T min(Lista<T> lista){

        if(lista==null || lista.size()==0){

            throw new IllegalArgumentException(
                    "Lista vazia ou null");
        }

        T menor=lista.get(0);

        for(int i=1;i<lista.size();i++){

            if(lista.get(i)
                    .compareTo(menor)<0){

                menor=lista.get(i);

            }

        }

        return menor;
    }

}