import java.io.*;
import java.util.*;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Membro> membros = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    // Método getter

    public List<Livro> getLivros() {
        return livros;
    }

    public List<Membro> getMembros() {
        return membros;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    // Adicionar livro
    public void adicionarLivro(Livro livro) {
        if (livro != null && !livros.contains(livro)) {
            livros.add(livro);
            System.out.println("ADICIONADO: Livro: '" + livro.getTitulo() + "' | Autor: "+livro.getAutor()+" | ISBN: "+ livro.getISBN());
        } else {
            System.out.println("Livro já existe.");
        }
    }

    // Remove livro
    public void removerLivro(Livro livro) {
        if (livro != null && livros.contains(livro)) {
            livros.remove(livro);
            System.out.println("REMOVIDO: Livro: '" + livro.getTitulo() + "' | Autor: "+livro.getAutor()+" | ISBN: "+ livro.getISBN());
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

    // Registrar membro
    public void registrarMembro(Membro membro) {
        if (membro != null && !membros.contains(membro)) {
            membros.add(membro);
            System.out.println("Membro registrado: " + membro.getNome());
        } else {
            System.out.println("Membro já existe ou é nulo.");
        }
    }

    // Registrar emprestimo
    public Emprestimo registrarEmprestimo(Livro livro, Membro membro) {
        if (livro != null && membro != null && !isLivroEmprestado(livro)) {
            Emprestimo emprestimo = new Emprestimo(livro, membro, new Date());
            emprestimos.add(emprestimo);
            System.out.println("Empréstimo registrado: " + emprestimo);
            return emprestimo; // Retorna o objeto Emprestimo
        } else {
            System.out.println("Não é possível registrar o empréstimo: livro já emprestado ou dados inválidos.");
            return null; // Retorna null se não for possível registrar
        }
    }

    // Verifica se o livro já foi emprestado
    private boolean isLivroEmprestado(Livro livro) {
        return emprestimos.stream().anyMatch(emprestimo -> emprestimo.getLivro().equals(livro));
    }

    // Devolve um livro
    public void devolverLivro(Emprestimo emprestimo) {
        if (emprestimo != null && emprestimos.contains(emprestimo)) {
            emprestimos.remove(emprestimo);
            System.out.println("Devolução Registrada: " + emprestimo);
        } else {
            System.out.println("Empréstimo não encontrado ou é nulo.");
        }
    }

    // Salva os dados em arquivo
    public void salvarDadosEmArquivo(String nomeArquivo) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            // Escreve os livros
            for (Livro livro : livros) {
                writer.write(livro.toString());
                writer.write("\n");
            }
            // Escreve os membros
            for (Membro membro : membros) {
                writer.write(membro.toString());
                writer.write("\n");
            }
            // Escreve os empréstimos
            for (Emprestimo emprestimo : emprestimos) {
                writer.write(emprestimo.toString());
                writer.write("\n");
            }
        }
    }

    // Carrega os dados de um arquivo
    public void carregarDadosDeArquivo(String nomeArquivo) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                // Processar a linha lida
                String[] dados = linha.split(",");
                // Adicionar lógica para criar objetos a partir dos dados
            }
        }
    }
}