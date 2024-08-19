import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Qual operação você deseja fazer? \n" +
                "1 - Somar\n" +
                "2 - Subtrair");
        Scanner sc = new Scanner(System.in);

        try {
            var objetoCalculadora = new MinhaCalculadora();
            int num = sc.nextInt();

            if(num == 1){
                System.out.println("Digite os Valores a serem somados separados por ENTER: ");
                ValoresDigitados Valores = lerValores();
                int soma = objetoCalculadora.soma(Valores.valorA, Valores.valorB);
                System.out.println("Resultado: " + soma);
            }

            else if(num == 2){
                System.out.println("Digite os valores a serem subtraídos separados por ENTER: ");
                ValoresDigitados Valores = lerValores();
                int subtr = objetoCalculadora.subtr(Valores.valorA, Valores.valorB);
                System.out.println("Resultado: " + subtr);
            }
            else{
                System.out.println("Opção inválida!");
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
