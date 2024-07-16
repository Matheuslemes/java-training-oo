public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Math!");

        System.out.println("Filme: Top Gun");

        int anoDelancamento = 2022;

        System.out.println("Ano de lançamento: " + anoDelancamento); //concatenação
        boolean incluidoNoPlano = true; //or false
        double notaDoFilme = 8.1;

        //  média calculada
        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println(media);

        String sinopse;
        // text blocks -> java 15
        sinopse = """
                Filme de ação, continuação de um filme de 1980!
                Ano de lançamento:
                """ + anoDelancamento;
        System.out.println(sinopse);

        // casting -> conversão de tipos
        int classificacao = (int) (media /2);
        System.out.println(classificacao);

    }
}