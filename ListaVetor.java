public class ListaVetor<T>
implements Lista<T>{

    private T[] itens;
    private int tamanho;

    @SuppressWarnings("unchecked")
    public ListaVetor(){

        itens=(T[])new Object[10];

    }

    @Override
    public void add(T valor){

        add(valor,tamanho);

    }

    @Override
    public void add(T valor,int pos){

        if(pos<0 || pos>tamanho){

            throw new IllegalArgumentException(
                    "Posição inválida");
        }

        for(int i=tamanho;i>pos;i--){

            itens[i]=itens[i-1];

        }

        itens[pos]=valor;

        tamanho++;
    }

    @Override
    public T get(int pos){

        return itens[pos];

    }

    @Override
    public T remove(int pos){

        T removido=itens[pos];

        for(int i=pos;i<tamanho-1;i++){

            itens[i]=itens[i+1];

        }

        tamanho--;

        return removido;
    }

    @Override
    public boolean remove(T valor){

        for(int i=0;i<tamanho;i++){

            if(itens[i].equals(valor)){

                remove(i);

                return true;
            }

        }

        return false;
    }

    @Override
    public int size(){

        return tamanho;

    }

}