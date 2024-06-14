import java.util.Scanner;

public class EntradaSaida {
    private Scanner scanner = new Scanner(System.in);

    public double entradaNota(String mensagem) {
        System.out.println(mensagem);
        return scanner.nextDouble();
    }

    public double entradaPeso(String mensagem) {
        System.out.println(mensagem);
        return scanner.nextDouble();
    }

    public String entradaTipoMedia() {
        System.out.println("Qual média deseja calcular (Aritmetica/Ponderada)?");
        return scanner.next();
    }
}
