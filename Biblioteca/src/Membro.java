public class Membro {
    private String nome;
    private String id;
    private String email;

    public Membro(String nome, String id, String email) {
        this.nome = nome;
        this.id = id;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Membro: " + nome + ", ID: " + id + ", Email: " + email;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Membro)) return false;
        Membro membro = (Membro) obj;
        return id.equals(membro.id);
    }
}