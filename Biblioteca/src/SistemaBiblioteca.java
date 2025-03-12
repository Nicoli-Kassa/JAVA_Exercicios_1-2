import java.io.*;

public class SistemaBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Criar livros com nomes reais
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", "12345");
        Livro livro2 = new Livro("1984", "George Orwell", "67890");

        // Criar membros com nomes reais
        Membro membro1 = new Membro("Alice Silva", "1", "alice.silva@exemplo.com");
        Membro membro2 = new Membro("João Pereira", "2", "joao.pereira@exemplo.com");

        // Adicionar livros à biblioteca
        System.out.println("\n+--------------------+");
        System.out.println("| ADICIONANDO LIVROS |");
        System.out.println("+--------------------+");
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        // Remover livro
        System.out.println("\n+------------------+");
        System.out.println("| REMOVENDO LIVROS |");
        System.out.println("+------------------+");
        biblioteca.removerLivro(livro2);

        // Registrar membros
        System.out.println("\n+-------------------+");
        System.out.println("| REGISTRAR MEMBROS |");
        System.out.println("+-------------------+");
        biblioteca.registrarMembro(membro1);
        biblioteca.registrarMembro(membro2);

        // Registrar empréstimo
        System.out.println("\n+------------------------+");
        System.out.println("| EMPRÉSTIMO E DEVOLUÇÃO |");
        System.out.println("+------------------------+");
        Emprestimo emprestimo1 = biblioteca.registrarEmprestimo(livro1, membro1);
        biblioteca.devolverLivro(emprestimo1);

        // Salvar e carregar dados
        try {
            biblioteca.salvarDadosEmArquivo("biblioteca.txt");
            biblioteca.carregarDadosDeArquivo("biblioteca.txt");
        } catch (IOException e) {
            System.err.println("Erro ao salvar ou carregar dados: " + e.getMessage());
        }
    }
}