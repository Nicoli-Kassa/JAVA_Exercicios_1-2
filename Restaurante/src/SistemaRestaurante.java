public class SistemaRestaurante {
    public static void main(String[] args) {
        Cardapio cardapio = new Cardapio();

        // Criando pratos
        Prato prato1 = new Prato("Lamen", 25.00, "Sopa de macarrão com caldo saboroso, legumes e carne.");
        Prato prato2 = new Prato("Yakisoba", 30.00, "Macarrão frito com legumes e carne, temperado com molho especial.");
        Prato prato3 = new Prato("Sushi", 40.00, "Arroz temperado com vinagre, peixe cru e vegetais frescos.");
        Prato prato4 = new Prato("Tempura de Legumes", 39.90, "Legumes empanados e fritos, servidos com molho especial.");

        // Adicionando pratos ao cardápio
        cardapio.adicionarPratoCardapio(prato1);
        cardapio.adicionarPratoCardapio(prato2);
        cardapio.adicionarPratoCardapio(prato3);

        // Removendo prato do cardápio
        cardapio.removerPratoCardapio(prato4);

        // Visualizar o cardápio
        cardapio.visualizarCardapio();

        System.out.println("\n+---------+");
        System.out.println("| PEDIDOS |");
        System.out.println("+---------+ \n");

        // Criando um pedido
        Pedido pedido = new Pedido(1, "João Silva");

        // Adicionando pratos ao pedido
        pedido.adicionarPrato(prato1);
        pedido.adicionarPrato(prato2);

        // Visualizando o pedido
        pedido.visualizarPedido();

        // Removendo um prato do pedido
        System.out.println("\n+-------------------+");
        System.out.println("| Pedido atualizado |");
        System.out.println("+-------------------+\n");
        pedido.removerPrato(prato1);

        // Visualizando o pedido após remoção
        pedido.visualizarPedido();
    }
}
