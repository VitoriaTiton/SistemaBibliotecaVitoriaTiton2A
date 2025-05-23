
public class Usuario {

    private String id;
    private String nome;
    private String email;

    //CONSTRUTOR.
    public Usuario(String id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    //GETTERS.
    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    //MÉTODO EXIBIR LISTA.
    public void exibir() {
        System.out.println("Usuario: " + nome + " | ID: " + id + " | Email: " + email);
    }
}
