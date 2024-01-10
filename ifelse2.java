import java.util.Scanner;

public class ifelse2 {
    public static void main(String[] args) {
        String nome = "Victor", senha = "2323";
        Scanner scnResp = new Scanner(System.in);
        System.out.println("Crie sua conta, digite seu nome de usuario.\n\rNome: ");
        String respNome = scnResp.nextLine();
        System.out.println("Crie sua senha:");
        String respSenha = scnResp.next();
        if (nome.equals(respNome) && senha.equals(respSenha)) {
            System.out.println("Nome e senha corretos.");
        } else {
            System.out.println("Opções incorretas.");
        }
    }
}
