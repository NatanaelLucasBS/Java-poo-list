import java.util.ArrayList;
import java.util.Scanner;

public class PedidoService {
    private ArrayList<Pedido> pedidos;
    private Scanner sc;

    public PedidoService(Scanner scanner) {
        this.pedidos = new ArrayList<>();
        this.sc = scanner;
    }

    // a) Fazer pedido
    public void fazerPedido() {
        System.out.println("\n=== FAZER PEDIDO ===");
        
        System.out.print("Nome do cliente: ");
        String nome = sc.nextLine();

        System.out.print("Endereço de entrega: ");
        String endereco = sc.nextLine();

        System.out.print("Quantidade de botijões: ");
        int quantidade = sc.nextInt();
        sc.nextLine();

        Pedido novoPedido = new Pedido(nome, endereco, quantidade);
        
        // b) Confirmar ou alterar dados
        confirmarOuAlterarPedido(novoPedido);
    }

    // b) Confirmar ou alterar pedido
    private void confirmarOuAlterarPedido(Pedido pedido) {
        System.out.println("\n=== CONFIRMAR DADOS DO PEDIDO ===");
        System.out.println(pedido);
        
        System.out.println("\n1 - Confirmar dados");
        System.out.println("2 - Alterar endereço");
        System.out.print("Escolha uma opção: ");
        int opcao = sc.nextInt();
        sc.nextLine();

        if (opcao == 2) {
            System.out.print("Novo endereço: ");
            String novoEndereco = sc.nextLine();
            pedido.alterarEndereco(novoEndereco);
            System.out.println("Endereço alterado com sucesso!");
            System.out.println(pedido);
        }

        // c) Calcular e mostrar totais
        System.out.println("\nPreço unitário: R$ " + Pedido.getValoruni());
        System.out.println("Total da compra: R$ " + pedido.getTotal());
        System.out.println("Hora prevista de entrega: " + pedido.getHoraEntrega());

        // d) Confirmar pagamento
        confirmarPagamento(pedido);
    }

    // d) Confirmar pagamento
    private void confirmarPagamento(Pedido pedido) {
        System.out.print("\nNúmero do cartão de crédito: ");
        String numeroCartao = sc.nextLine();
        
        pedido.confirmarPedido(numeroCartao);
        pedidos.add(pedido);
        
        System.out.println("\n Pedido confirmado com sucesso!");
        System.out.println("Código do pedido: #" + pedido.getId());
    }

    // e) Confirmar entrega
    public void confirmarEntrega() {
        System.out.println("\n=== CONFIRMAR ENTREGA ===");
        System.out.print("Informe o código do pedido: ");
        int id = sc.nextInt();
        sc.nextLine();

        Pedido pedido = buscarPedido(id);
        if (pedido != null) {
            if (pedido.isConfirmado()) {
                pedido.marcarComoEntregue();
                System.out.println(" Pedido #" + id + " marcado como ENTREGUE!");
            } else {
                System.out.println(" Pedido não está confirmado!");
            }
        } else {
            System.out.println("Pedido não localizado!");
        }
    }

    // f) Listar pedidos por status
    public void listarPedidosConfirmados() {
        System.out.println("\n=== PEDIDOS CONFIRMADOS ===");
        boolean encontrou = false;
        for (Pedido pedido : pedidos) {
            if (pedido.isConfirmado()) {
                System.out.println(pedido.toResumo());
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum pedido confirmado encontrado.");
        }
    }

    public void listarPedidosEntregues() {
        System.out.println("\n=== PEDIDOS ENTREGUE ===");
        boolean encontrou = false;
        for (Pedido pedido : pedidos) {
            if (pedido.isEntregue()) {
                System.out.println(pedido.toResumo());
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum pedido entregue encontrado.");
        }
    }

    public void listarTodosPedidos() {
        System.out.println("\n=== TODOS OS PEDIDOS ===");
        if (pedidos.isEmpty()) {
            System.out.println("Nenhum pedido cadastrado.");
        } else {
            for (Pedido pedido : pedidos) {
                System.out.println(pedido.toResumo());
            }
        }
    }

    // Método auxiliar
    private Pedido buscarPedido(int id) {
        for (Pedido p : pedidos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
}