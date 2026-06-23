public class ListaEncadeada<T>
implements Lista<T>{

    private class No{

        T valor;
        No prox;

        public No(T valor){

            this.valor=valor;

        }

    }

    private No inicio;
    private int tamanho;


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

        No novo=new No(valor);

        if(pos==0){

            novo.prox=inicio;
            inicio=novo;

        }
        else{

            No atual=inicio;

            for(int i=0;i<pos-1;i++){

                atual=atual.prox;

            }

            novo.prox=atual.prox;
            atual.prox=novo;

        }

        tamanho++;
    }

    @Override
    public T get(int pos){

        No atual=inicio;

        for(int i=0;i<pos;i++){

            atual=atual.prox;

        }

        return atual.valor;
    }

    @Override
    public T remove(int pos){

        if(pos<0 || pos>=tamanho){

            throw new IllegalArgumentException(
                    "Posição inválida");
        }

        T removido;

        if(pos==0){

            removido=inicio.valor;
            inicio=inicio.prox;

        }
        else{

            No atual=inicio;

            for(int i=0;i<pos-1;i++){

                atual=atual.prox;

            }

            removido=atual.prox.valor;
            atual.prox=atual.prox.prox;

        }

        tamanho--;

        return removido;
    }

    @Override
    public boolean remove(T valor){

        for(int i=0;i<tamanho;i++){

            if(get(i).equals(valor)){

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