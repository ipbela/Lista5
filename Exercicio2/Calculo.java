package Exercicio2;

public class Calculo {
    public double calculaINSS(double salarioBruto) {
        return salarioBruto * 0.20;
    }

    public double calculaIRPF(double salarioBruto) {
        return salarioBruto * 0.10;
    }

    public double calculaPlanoSaude(double salarioBruto) {
        return salarioBruto * 0.05;
    }

    public double calculaHorasExtras(double salarioBruto, double horasExtras) {
        double valorHoraNormal = salarioBruto / 160;
        double valorHoraExtra = valorHoraNormal * 1.50;
        return valorHoraExtra * horasExtras;
    }

    public double calculaSalarioLiquido(double salarioBruto, double inss, double irpf, double planoSaude, double acrescimoHorasExtras) {
        return salarioBruto - inss - irpf - planoSaude + acrescimoHorasExtras;
    }
}
