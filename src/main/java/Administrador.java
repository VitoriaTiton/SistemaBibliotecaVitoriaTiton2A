
public class Administrador {

    private String id;
    private String nome;
    private String email;
    private String cargo;

    //CONSTRUTOR
    public Administrador(String id, String nome, String email, String cargo) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cargo = cargo;
    }

    //GETTERS
    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCargo() {
        return cargo;
    }

    //MÉTODO EXIBIR LISTA.
    public void exibir() {
        System.out.println("Administrador: " + nome + " | ID: " + id + " | Email: " + email + " | Cargo: " + cargo);
    }
}
