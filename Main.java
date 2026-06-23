public class Main {
    public static void main (String[] args) {
        Integer[] numeros = {1,2,2,4,2};

        System.out.println("Quantidade: "+
                          ArrayUtil.count(numeros,2)
        );

        String[] nomes = {
                "Ana",
                "Pedro",
                "Ana"
        };

        System.out.println(
                  "Quantidade: "+
                  ArrayUtil.count(nomes,"Ana")
        );
    }
}