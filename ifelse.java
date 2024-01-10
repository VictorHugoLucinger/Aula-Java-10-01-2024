import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        System.out.println("Gostaria de coca-cola ou guaraná?");
        String resp = op.nextLine();
        if (resp.equals("coca-cola")) {
            System.out.println("Você comprou coca-cola");
        } else {
            System.out.println("Você comprou guaraná");
        }
    }
}