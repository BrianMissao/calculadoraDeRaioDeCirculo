import java.util.Scanner;

public class CalculadoraDeRaioDeCirculo {
    private static final double pi = 3.14;
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o raio do círculo a calcular:");
        double raio = teclado.nextDouble();
        double area = pi * (Math.pow(raio, 2));
        System.out.printf("A area do círculo com raio %.4f é %.4f", raio, area);
    }
}
