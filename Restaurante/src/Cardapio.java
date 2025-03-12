import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    private List<Prato> pratos;

    public Cardapio(){
        pratos = new ArrayList<>();
    }

    // Adicionar prato
    public void adicionarPratoCardapio(Prato prato){
        if(prato != null & !pratos.contains(prato)){
            pratos.add(prato);
            System.out.println("\nADICIONADO: Prato '" + prato.getNome() + "' | Descrição: " + prato.getDescricao() + " | Preço: " + prato.getPreco());
        }
        else{
            System.out.println("Prato já adicionado!");
        }
    }

    // Remover prato
    public void removerPratoCardapio(Prato prato){
        if(prato != null & !pratos.contains(prato)){
            pratos.remove(prato);
            System.out.println("\nREMOVIDO: Prato '" + prato.getNome() + "' | Descrição: " + prato.getDescricao() + " | Preço: " + prato.getPreco());
        }
        else{
            System.out.println("Prato não encontrado!");
        }
    }

    // Visualizar cardapio
    public void visualizarCardapio(){
        System.out.println("\n +----------+ ");
        System.out.println(" | CARDÁPIO | ");
        System.out.println(" +----------+ \n");
        for (Prato prato : pratos){
            System.out.println(" - " + prato);
        }
    }

    public List<Prato> getPratos(){
        return pratos;
    }
}
