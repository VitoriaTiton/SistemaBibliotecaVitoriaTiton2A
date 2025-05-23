
import java.util.ArrayList;

public class Biblioteca {

    ArrayList<Livro> livros = new ArrayList<Livro>();
    ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    ArrayList<Administrador> administradores = new ArrayList<Administrador>();

    public void cadastrarLivro(Livro novoLivro) {
        for (Livro livro:livros) {
            if (livro.getIsbn().equals(novoLivro.getIsbn())) {
                System.out.println("ISBN JÁ CADASTRADO. TENTE NOVAMENTE!");
                return;
            }
        }
        livros.add(novoLivro);
        System.out.println("LIVRO CADASTRADO!");
    }

    public void cadastrarUsuario(Usuario novoUsuario) {
        for (Usuario usuario:usuarios) {
            if (usuario.getId().equals(novoUsuario.getId())) {
                System.out.println("ID JÁ CADASTRADO. TENTE NOVAMENTE!");
                return;
            }
        }
        usuarios.add(novoUsuario);
        System.out.println("USUÁRIO CADASTRADO!");
    }

    public void cadastrarAdministrador(Administrador novoAdministrador) {
        for (Administrador administrador:administradores) {
            if (administrador.getId().equals(novoAdministrador.getId())) {
                System.out.println("ID JÁ CADASTRADO. TENTE NOVAMENTE!");
                return;
            }
        }
        administradores.add(novoAdministrador);
        System.out.println("ADMINISTRADOR CADASTRADO!");
    }

    public void listarLivros() {
        for (Livro livro:livros) {
            livro.exibir();
        }
    }

    public void listarUsuarios() {
        for (Usuario usuario:usuarios) {
            usuario.exibir();
        }
    }

    public void listarAdministradores() {
        for (Administrador administrador:administradores) {
            administrador.exibir();
        }
    }

}
