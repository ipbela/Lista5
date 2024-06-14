public class Main {
    public static void main(String[] args) {
        EntradaSaida entradaSaida = new EntradaSaida();
        Calculo calculo = new Calculo();
        Resultado resultado = new Resultado();
        Validacao validacao = new Validacao();

        double nota1 = entradaSaida.entradaNota("Informe a primeira nota:");
        while (!validacao.isNotaValida(nota1)) {
            nota1 = entradaSaida.entradaNota("Nota inválida. Informe a primeira nota novamente (0 a 10):");
        }

        double nota2 = entradaSaida.entradaNota("Informe a segunda nota:");
        while (!validacao.isNotaValida(nota2)) {
            nota2 = entradaSaida.entradaNota("Nota inválida. Informe a segunda nota novamente (0 a 10):");
        }

        String tipoMedia = entradaSaida.entradaTipoMedia();

        double media;
        if (tipoMedia.equalsIgnoreCase("Aritmetica")) {
            media = calculo.mediaAritmetica(nota1, nota2);
        } else {
            double peso1 = entradaSaida.entradaPeso("Informe o peso da primeira nota:");
            double peso2 = entradaSaida.entradaPeso("Informe o peso da segunda nota:");
            media = calculo.mediaPonderada(nota1, nota2, peso1, peso2);
        }

        resultado.mostraResultado(media);
    }
}
