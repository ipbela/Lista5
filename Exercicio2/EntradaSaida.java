package Exercicio2;

import java.util.Scanner;

public class EntradaSaida {
    private Scanner scanner = new Scanner(System.in);

    public double entradaSalarioBruto() {
        System.out.println("Informe o salário bruto:");
        return scanner.nextDouble();
    }

    public double entradaSalarioBruto(String mensagem) {
        System.out.println(mensagem);
        return scanner.nextDouble();
    }

    public double entradaHorasExtras() {
        System.out.println("Informe o número de horas extras:");
        return scanner.nextDouble();
    }

    public void mostraFolhaPagamento(double salarioBruto, double inss, double irpf, double planoSaude, double acrescimoHorasExtras, double salarioLiquido) {
        System.out.println("Folha de Pagamento:");
        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("Desconto INSS: " + inss);
        System.out.println("Desconto IRPF: " + irpf);
        System.out.println("Desconto Plano de Saúde: " + planoSaude);
        System.out.println("Acréscimo Horas Extras: " + acrescimoHorasExtras);
        System.out.println("Salário Líquido: " + salarioLiquido);
    }
}
