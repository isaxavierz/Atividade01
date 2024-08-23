import java.util.Scanner;

public class ComprarDolar {
    public static void main(String[] args) {
        Moeda moeda = new Moeda();
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a cotação do dólar: ");
        Moeda.cotacaoDolar = sc.nextDouble();
        System.out.println("Digite  o valor em reais: ");
        Moeda.valorReal = sc.nextDouble();

        System.out.println("Quantidade de dólares que será comprado: ");
        moeda.calcularConversao();
        System.out.println(moeda.quantidadeDolar);
    }
}
