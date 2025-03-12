import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numeroPedido;
    private String cliente;
    private List<Prato> listaDePratos;
    private double total;

    public Pedido(int numeroPedido, String cliente){
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.listaDePratos = new ArrayList<>();
        this.total = 0.0;
    }

    public void adicionarPrato(Prato prato) {
        listaDePratos.add(prato);
    }

    public void removerPrato(Prato prato) {
        listaDePratos.remove(prato);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Prato prato : listaDePratos) {
            total += prato.getPreco();
        }
        return total;
    }

    public void visualizarPedido() {
        System.out.println("Número do pedido: " + numeroPedido);
        System.out.println("Cliente: " + cliente);
        System.out.println("Pratos:");
        for (Prato prato : listaDePratos) {
            System.out.println(" - " + prato);
        }
        System.out.println("Total: R$" + String.format("%.2f", calcularTotal()));
    }

}
