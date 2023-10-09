import java.util.Scanner;

public class DadosBancarios {
    public static void main(String[] args) {
        String nome = "Paulo Matheus Ferrari";
        String tipoConta = "Conta Corrente";
        float  saldoInicial = 3000;
        int opcao = 0;

        String menu = """
                *** Digite sua opção ***
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4-  Sair
                
                """;

        System.out.println("*************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo: " + saldoInicial);
        System.out.println("\n*************************");

        Scanner leitura = new Scanner(System.in);

        while(opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if(opcao == 1) {
                System.out.println("Seu saldo é: " + saldoInicial);
            } else if (opcao == 2) {
                System.out.println("Digite o valor que deseja transferir");
                float valor = leitura.nextFloat();
                if(valor > saldoInicial) {
                    System.out.println("Valor não pode ser transferido. Saldo insuficiente");
                } else {
                    saldoInicial -= valor;
                    System.out.println("Transferência realizada com sucesso. O novo saldo é: " + saldoInicial);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                float valor = leitura.nextFloat();
                saldoInicial += valor;
                System.out.println("Novo saldo é: " + saldoInicial);
            } else if(opcao != 4) {
                System.out.println("Opção inválida");
            }
        }

    }
}
