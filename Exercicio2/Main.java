package Exercicio2;

public class Main {
    public static void main(String[] args) {
        EntradaSaida entradaSaida = new EntradaSaida();
        Calculo calculo = new Calculo();
        Validacao validacao = new Validacao();

        double salarioBruto = entradaSaida.entradaSalarioBruto();
        while (!validacao.isSalarioValido(salarioBruto)) {
            salarioBruto = entradaSaida.entradaSalarioBruto("Salário inválido. Informe um salário bruto entre 500 e 30000 reais:");
        }

        double inss = calculo.calculaINSS(salarioBruto);
        double irpf = calculo.calculaIRPF(salarioBruto);
        double planoSaude = calculo.calculaPlanoSaude(salarioBruto);
        double horasExtras = entradaSaida.entradaHorasExtras();
        double acrescimoHorasExtras = calculo.calculaHorasExtras(salarioBruto, horasExtras);

        double salarioLiquido = calculo.calculaSalarioLiquido(salarioBruto, inss, irpf, planoSaude, acrescimoHorasExtras);

        entradaSaida.mostraFolhaPagamento(salarioBruto, inss, irpf, planoSaude, acrescimoHorasExtras, salarioLiquido);
    }
}
