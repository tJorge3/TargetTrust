import java.util.Scanner;

public class CarteiraMotorista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Você possui carteira de motorista? ");
        boolean carteira = sc.nextBoolean();
        System.out.println("Você bebeu alcool hoje?");
        boolean alcool = sc.nextBoolean();
        //Operação lógica

        if (idade >= 18 && carteira && !alcool) {
            System.out.println("Você pode dirigir.");
        }
        else {
            System.out.println("Você não pode dirigir.");
        }

        sc.close();
    }
}
