public class ListaEncadeada<T> implements Lista<T> {

    private class No {

        T valor;
        No prox;

        public No(T valor) {
            this.valor = valor;
        }
    }
    private No inicio;
    private int tamanho;

    @Override
    public void add(T valor) {
        No novo = new No(valor);
        if (inicio == null) {
            inicio = novo;
        } else {
            No atual = inicio;
            while (atual.prox != null) {
                atual = atual.prox;
            }
            atual.prox = novo;
        }
        tamanho++;
    }

    @Override
    public T get(int pos) {
        No atual = inicio;
        for (int i = 0; i < pos; i++) {
            atual = atual.prox;
        }
        return atual.valor;
    }

    @Override
    public int size() {
        return tamanho;
    }
}
