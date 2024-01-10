import java.util.Scanner;

public class ifeslse1 {
    public static void main(String[] args) {
        boolean sair = false;
        Scanner scnPalavra = new Scanner(System.in);
        String texto = "Doente de amor fui procurar remédio na vida noturna";
        String palavra;
        int posicaoPalavra;
        while (sair == false) {
            System.out.println(texto);
            System.out.println("Digite uma palavra para pesquisar no texto acima, depois precione enter:");
            palavra = scnPalavra.nextLine();
            posicaoPalavra = texto.indexOf(palavra);
            if (posicaoPalavra >= 0) {
                System.out.println("A palavra " + palavra + " foi encontrada na posição " + posicaoPalavra + " do texto acima");
            } else {
                System.out.println("Opss! Palavra não encontrada");
            }
            System.out.println("Digite 'c' para continuar ou 's' para sair, depois tecla enter");
            if (scnPalavra.nextLine().equals("s")) {
                sair = true;
            }
        }
        scnPalavra.close();
    }
}