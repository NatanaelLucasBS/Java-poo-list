import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PedidoService pedidoService = new PedidoService(sc);
        int opcao;

        do {
            exibirMenu();
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    pedidoService.fazerPedido();
                    break;

                case 2:
                    pedidoService.listarTodosPedidos();
                    break;

                case 3:
                    pedidoService.listarPedidosConfirmados();
                    break;

                case 4:
                    pedidoService.listarPedidosEntregues();
                    break;

                case 5:
                    pedidoService.confirmarEntrega();
                    break;

                case 6:
                    System.out.println("Saindo do sistema... Obrigado!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

            if (opcao != 6) {
                System.out.println("\nPressione Enter para continuar...");
                sc.nextLine();
            }

        } while (opcao != 6);

        sc.close();
    }

    private static void exibirMenu() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("SISTEMA DE ENTREGA DE BOTIJÕES DE GÁS");
        System.out.println("=".repeat(50));
        System.out.println("1 - Fazer pedido");
        System.out.println("2 - Ver todos os pedidos");
        System.out.println("3 - Ver pedidos confirmados");
        System.out.println("4 - Ver pedidos entregues");
        System.out.println("5 - Confirmar entrega");
        System.out.println("6 - Sair");
        System.out.print("Escolha uma opção: ");
    }
}