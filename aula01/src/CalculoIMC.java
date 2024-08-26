import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        Double altura = sc.nextDouble();
        System.out.println("Digite seu peso: ");
        Double peso = sc.nextDouble();

        Double imc = peso/(altura*altura);
        System.out.printf("IMC: %.2f", imc);

        sc.close();
    }
}
