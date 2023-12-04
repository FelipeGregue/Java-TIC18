package exercicios;

import java.util.Scanner;

public class ConversorMoeda {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário a taxa de câmbio
        System.out.print("Digite a taxa de câmbio (por exemplo, de dólares para euros): ");
        double taxaDeCambio = scanner.nextDouble();

        // Solicita ao usuário a quantidade em dólares
        System.out.print("Digite a quantidade em dólares: ");
        double quantidadeDolares = scanner.nextDouble();

        // Calcula o valor convertido
        double valorConvertido = quantidadeDolares * taxaDeCambio;

        // Exibe o resultado
        System.out.println(quantidadeDolares + " dólares equivalem a " + valorConvertido + " euros.");

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
