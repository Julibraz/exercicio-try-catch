/*Você deve criar um programa simples em Java para verificar se um número de conta bancária é válido.
O número da conta deve ter exatamente 8 dígitos.
    O programa solicitará ao usuário que digite o número da conta bancária.
    O programa utilizará um bloco try-catch para verificar se o número da conta possui exatamente 8 dígitos.
    Se o número da conta tiver 8 dígitos, o programa informará que é um número válido.
    Se o número da conta não tiver 8 dígitos, o programa lançará uma exceção (por exemplo, IllegalArgumentException)
    e informará que o número da conta é inválido.*/

import java.sql.SQLOutput;
import java.util.Scanner;

public class VerificadorNumeroConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Informe o numero da conta: ");
            String numeroConta = scanner.nextLine();

            //Chama o método que veritica se o número da conta é valido
            verificarNumeroConta(numeroConta);
            //Caso nenhuma exceção seja lançada, imprime a mensagem de sucesso.
            System.out.println("Numero de conta valido.");

        } catch (IllegalArgumentException e) {
            // Informa que o número da conta é inválido e exibi a mensagem de erro
            System.out.println("Erro: " + e.getMessage());

        } finally {
            //Fecha o scanner para evitar vazamentos
            scanner.close();
        }
    }

    private static void verificarNumeroConta(String numeroConta) {
        if (numeroConta.length() != 8) {
            //Lança uma IllegalArgumentException com a mensagem a seguir
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");

        }
    }
}
