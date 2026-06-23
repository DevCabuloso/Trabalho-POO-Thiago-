public class Main {
    public static void main(String[] args) {

        Integer[] numeros = {1,2,2,4,2};

        System.out.println(
            "Quantidade de vezes que o dois aparece: " +
            ArrayUtil.count(numeros, 2)
        );

        String[] nomes = {
            "Ana",
            "Pedro",
            "Ana"
        };

        String[] materiais = {
            "cadernos",
            "lapis",
            "cadernos",
            "adernos",
            "Borracha"
        };

        System.out.println(
            "Quantidade de Ana: " + ArrayUtil.count(nomes, "Ana") +
            " | Quantidade de lapis: " + ArrayUtil.count(materiais, "lapis")
        );
    }
}