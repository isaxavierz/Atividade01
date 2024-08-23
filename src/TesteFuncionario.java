import java.util.Scanner;

public class TesteFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         Funcionario funcionario = new Funcionario();

        System.out.println("Digite o nome: ");
        funcionario.nome = sc.next();

        System.out.println("Digite o sobrenome: ");
        funcionario.sobrenome = sc.next();

        System.out.println("Digite o valor por hora trabalhada: ");
        funcionario.valorPorHora = sc.nextFloat();

        System.out.println("Digite a quantidade de horas trabalhadas: ");
        funcionario.incrementarHoras(sc.nextInt());

        System.out.println("Nome completo: " + funcionario.nomeCompleto());
        System.out.println("Valor por horas: " + funcionario.valorPorHora);
        System.out.println("Quatnidade de horas: " + funcionario.horasTrabalhadas);
        System.out.println("Salário: " + funcionario.calcularSalario());
    }

}
