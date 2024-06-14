package Exercicio3;

import java.util.Scanner;

public class EntradaSaida {
    private Scanner scanner = new Scanner(System.in);

    public double entradaSalario() {
        System.out.println("Informe seu salário atual:");
        return scanner.nextDouble();
    }

    public double entradaSalario(String mensagem) {
        System.out.println(mensagem);
        return scanner.nextDouble();
    }

    public double entradaValorEmprestimo() {
        System.out.println("Informe o valor que deseja emprestar:");
        return scanner.nextDouble();
    }

    public double entradaValorEmprestimo(String mensagem) {
        System.out.println(mensagem);
        return scanner.nextDouble();
    }

    public void mostraAprovacao(double valorTotal, double valorParcela) {
        System.out.println("Empréstimo aprovado!");
        System.out.println("Valor total a ser pago: R$ " + valorTotal);
        System.out.println("Valor de cada parcela (24 meses): R$ " + valorParcela);
    }

    public void mostraReprovacao() {
        System.out.println("Empréstimo não aprovado. O valor da parcela excede 15% do seu salário.");
    }
}
