package Exercicio3;

public class Validacao {
    public boolean isSalarioValido(double salario) {
        return salario >= 100 && salario <= 100000;
    }

    public boolean isEmprestimoValido(double valorEmprestimo) {
        return valorEmprestimo > 0 && valorEmprestimo <= 200000;
    }
}
