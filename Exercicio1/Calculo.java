public class Calculo {
    
    public double mediaAritmetica(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

    public double mediaPonderada(double nota1, double nota2, double peso1, double peso2) {
        return (nota1 * peso1 + nota2 * peso2) / (peso1 + peso2);
    }
}
