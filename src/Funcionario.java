public class Funcionario {

    public static String nome;
    public static String sobrenome;
    public  static int horasTrabalhadas = 0;
    public  static float valorPorHora;

    public static String nomeCompleto()
    {
        return nome + " " + sobrenome;
    }

    public static float calcularSalario()
    {
        return horasTrabalhadas * valorPorHora;
    }

    public static void incrementarHoras(int qtdeHoras)
    {
        horasTrabalhadas += qtdeHoras;
    }



}
