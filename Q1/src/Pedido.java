import java.time.LocalDate;
import java.time.LocalTime;

public class Pedido {
    private String nomeCliente;
    private int qntBotijoes;
    private String endereco;
    private LocalTime horaCompra;
    private LocalDate dataCompra;
    private double total;
    private String numeroCartao;
    private String status;
    private int id;
    private static final double VALORUNI = 100.00;
    private static int proximoId = 1;
    private LocalTime horaEntrega;

    public Pedido(String nomeCliente, String endereco, int qntBotijoes) {
        this.id = proximoId++;
        this.nomeCliente = nomeCliente;
        this.endereco = endereco;
        this.qntBotijoes = qntBotijoes;
        this.dataCompra = LocalDate.now();
        this.horaCompra = LocalTime.now();
        this.calcularTotal();
        this.calcularHoraEntrega();
        this.status = "Pendente";
    }

    // Métodos de negócio
    public void alterarEndereco(String novoEndereco) {
        if (!"Entregue".equalsIgnoreCase(this.status)) {
            this.endereco = novoEndereco;
        }
    }

    public void confirmarPedido(String numeroCartao) {
        this.numeroCartao = numeroCartao;
        this.status = "Confirmado";
    }

    public void marcarComoEntregue() {
        this.status = "Entregue";
    }

    public void calcularTotal() {
        this.total = VALORUNI * this.qntBotijoes;
    }

    public void calcularHoraEntrega() {
        this.horaEntrega = this.horaCompra.plusHours(2);
        
        if (this.horaEntrega.isBefore(this.horaCompra)) {
            
            System.out.println("Atenção: Entrega será no próximo dia!");
        }
    }

    public void atualizarQuantidade(int novaQuantidade) {
        if (!"Entregue".equalsIgnoreCase(this.status)) {
            this.qntBotijoes = novaQuantidade;
            this.calcularTotal();
        }
    }

    public boolean isConfirmado() {
        return "Confirmado".equalsIgnoreCase(this.status);
    }

    public boolean isEntregue() {
        return "Entregue".equalsIgnoreCase(this.status);
    }

    public boolean isPendente() {
        return "Pendente".equalsIgnoreCase(this.status);
    }

    // Getters e Setters
    public String getNomeCliente() {
        return nomeCliente;
    }

    public int getQntBotijoes() {
        return qntBotijoes;
    }

    public String getEndereco() {
        return endereco;
    }

    public LocalTime getHoraCompra() {
        return horaCompra;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public double getTotal() {
        return total;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public String getStatus() {
        return status;
    }

    public int getId() {
        return id;
    }

    public LocalTime getHoraEntrega() {
        return horaEntrega;
    }

    public static double getValoruni() {
        return VALORUNI;
    }

    @Override
    public String toString() {
        return "Pedido #" + id +
               "\nCliente: " + nomeCliente +
               "\nEndereço: " + endereco +
               "\nQuantidade: " + qntBotijoes + " botijões" +
               "\nValor Unitário: R$ " + VALORUNI +
               "\nTotal: R$ " + total +
               "\nStatus: " + status +
               "\nData: " + dataCompra +
               "\nHora da Compra: " + horaCompra +
               "\nHora Prevista Entrega: " + horaEntrega +
               "\n" + "=".repeat(50);
    }

    public String toResumo() {
        return "Pedido #" + id + " | " + nomeCliente + " | " + qntBotijoes + 
               " botijões | R$ " + total + " | " + status;
    }
}