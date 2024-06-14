package Exercicio3;

public class Main {
    public static void main(String[] args) {
        EntradaSaida entradaSaida = new EntradaSaida();
        Emprestimo emprestimo = new Emprestimo();
        Validacao validacao = new Validacao();

        double salario = entradaSaida.entradaSalario();
        while (!validacao.isSalarioValido(salario)) {
            salario = entradaSaida.entradaSalario("Salário inválido. Informe um salário válido (maior que zero):");
        }

        double valorEmprestimo = entradaSaida.entradaValorEmprestimo();
        while (!validacao.isEmprestimoValido(valorEmprestimo)) {
            valorEmprestimo = entradaSaida.entradaValorEmprestimo("Valor de empréstimo inválido. Informe um valor até 200000 reais:");
        }

        double valorTotal = emprestimo.calculaValorTotal(valorEmprestimo);
        double valorParcela = emprestimo.calculaValorParcela(valorTotal);
        
        if (emprestimo.isEmprestimoAprovado(salario, valorParcela)) {
            entradaSaida.mostraAprovacao(valorTotal, valorParcela);
        } else {
            entradaSaida.mostraReprovacao();
        }
    }
}

