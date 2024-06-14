package Exercicio3;

public class Emprestimo {
    private static final double JUROS = 0.35;
    private static final int MESES = 24;
    private static final double LIMITE_PARCELA_SALARIO = 0.15;

    public double calculaValorTotal(double valorEmprestimo) {
        return valorEmprestimo * (1 + JUROS);
    }

    public double calculaValorParcela(double valorTotal) {
        return valorTotal / MESES;
    }

    public boolean isEmprestimoAprovado(double salario, double valorParcela) {
        return valorParcela <= (salario * LIMITE_PARCELA_SALARIO);
    }
}
