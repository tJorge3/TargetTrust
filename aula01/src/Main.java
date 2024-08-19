import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ValoresDigitados Valores = lerValores();
        System.out.println("Qual operação você deseja fazer? \n" +
                "1 - Somar\n" +
                "2 - Subtrair\n" +
                "3 - Multiplicar\n" +
                "4 - Dividir");
        Scanner sc = new Scanner(System.in);

        try {
            var calculadora = new MinhaCalculadora();
            int num = sc.nextInt();
            int resultado;

            switch (num) {
                case 1:
                    resultado = calculadora.soma(Valores.valorA, Valores.valorB);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    resultado = calculadora.subtr(Valores.valorA, Valores.valorB);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 3:
                    resultado = calculadora.multi(Valores.valorA, Valores.valorB);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 4:
                    resultado = calculadora.div(Valores.valorA, Valores.valorB);
                    System.out.println("Resultado: " + resultado);
                    break;
                default:
                    System.out.println("Valor inválido!");
                    break;
            }
        }catch(Exception exception){
            System.out.println("Digite um valor inteiro.");
        }
    }

    public static ValoresDigitados lerValores(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        Integer valorA = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        Integer valorB = sc.nextInt();
        var Valores = new ValoresDigitados(valorA, valorB);

        return Valores;
    }
}
