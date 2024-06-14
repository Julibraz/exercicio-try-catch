import java.util.Scanner;
import java.text.DecimalFormat;

    public class SimulacaoBancaria {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double saldo = 0;
            int casasDecimais = 1;
            DecimalFormat df = new DecimalFormat("0.0");
            String SaldoFormatado = df.format(saldo);
            boolean continuar = true;

            while (continuar) {
                System.out.println("Selecione uma opcao: ");
                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.print("Informe o valor que será depositado: R$");
                        saldo = scanner.nextDouble();
                        SaldoFormatado = df.format(saldo);
                        System.out.println("Saldo atualizado: R$" + SaldoFormatado);
                        break;
                    case 2:
                        System.out.println("Saldo atual: R$" + SaldoFormatado);
                        System.out.print("Quando você deseja sacar? R$");
                        double saque = scanner.nextDouble();
                        if(saque > saldo){
                            System.out.println("\nValor acima do saldo disponível.");
                        }else{
                            saldo -= saque;
                            SaldoFormatado = df.format(saldo);
                            System.out.println("\nSaque de R$" + saque + " efetuado.");
                            System.out.println("Saldo Atualizado: R$" + SaldoFormatado);
                        }
                        break;
                    case 3:
                        System.out.println("O saldo atual é de R$" + SaldoFormatado);
                        break;
                    case 0:
                        System.out.println("Programa encerrado.");
                        continuar = false;  // Atualiza a variável de controle para encerrar o loop
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            }
            scanner.close();
        }
    }
