public class Main {

    public static void main(String[] args){

        Lista<String> lista=
                new ListaEncadeada<>();

        lista.add("Zeca");
        lista.add("Maria");
        lista.add("Ana");
        lista.add("Pedro");
        lista.add("Ana");

        lista.remove("Maria");

        System.out.println(
                "Quantidade Ana: "+
                ListaUtil.count(
                        lista,
                        "Ana"
                )
        );

        System.out.println(
                "Maior: "+
                ListaUtil.max(lista)
        );

        System.out.println(
                "Menor: "+
                ListaUtil.min(lista)
        );

        System.out.println("\nElementos:");

        for(int i=0;i<lista.size();i++){

            System.out.println(
                    lista.get(i)
            );

        }

    }

}