import java.util.*;

public class Emprestimo {
    private Livro livro;
    private Membro membro;
    private Date dataEmprestimo;

    public Emprestimo(Livro livro, Membro membro, Date dataEmprestimo) {
        this.livro = livro;
        this.membro = membro;
        this.dataEmprestimo = dataEmprestimo;
    }

    public Livro getLivro() {
        return livro;
    }
    public Membro getMembro() {
        return membro;
    }
    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    @Override
    public String toString() {
        return "Empréstimo de '" + livro.getTitulo() + "' para " + membro.getNome() + " em " + dataEmprestimo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Emprestimo)) return false;
        Emprestimo emprestimo = (Emprestimo) obj;
        return livro.equals(emprestimo.livro) && membro.equals(emprestimo.membro);
    }
}