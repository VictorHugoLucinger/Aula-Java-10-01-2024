public class foreach1 {
    public static void main(String[] args) {
        String[] frutas = {"Morango","Côco","Tomate","Manga","Uva","Melancia"};
        System.out.println("Você tem [ " + frutas.length + " ] frutas cadastradas");
        for (int f = 0; f < frutas.length; f++) {
            System.out.println("Frutas [ " + frutas[f] + " ] conferida com sucesso.");
        }
    }
}