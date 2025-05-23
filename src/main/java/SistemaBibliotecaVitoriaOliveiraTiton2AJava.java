
import java.util.Scanner;

public class SistemaBibliotecaVitoriaOliveiraTiton2AJava {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n============ MENU PRINCIPAL =============");
            System.out.println("1: Cadastrar Livro.");
            System.out.println("2: Cadastrar Usuário.");
            System.out.println("3: Cadastrar Administrador.");
            System.out.println("5: Listar Livros.");
            System.out.println("6: Listar Usuários.");
            System.out.println("7: Listar Administradores");
            System.out.println("0: Sair.");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Isbn: ");
                    String isbn = scanner.nextLine();
                    System.out.print("TÍtulo: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ano: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine();

                    Livro livro = new Livro(isbn, titulo, autor, ano);
                    biblioteca.cadastrarLivro(livro);
                    break;

                case 2:
                    System.out.print("ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    Usuario usuario = new Usuario(id, nome, email);
                    biblioteca.cadastrarUsuario(usuario);
                    break;

                case 3:
                    System.out.print("ID: ");
                    String idAdmin = scanner.nextLine();
                    System.out.print("Nome: ");
                    String nomeAdmin = scanner.nextLine();
                    System.out.print("Email: ");
                    String emailAdmin = scanner.nextLine();
                    System.out.print("Cargo: ");
                    String cargoAdmin = scanner.nextLine();

                    Administrador administrador = new Administrador(idAdmin, nomeAdmin, emailAdmin, cargoAdmin);
                    biblioteca.cadastrarAdministrador(administrador);
                    break;

                case 5:
                    biblioteca.listarLivros();
                    break;

                case 6:
                    biblioteca.listarUsuarios();
                    break;

                case 7:
                    biblioteca.listarAdministradores();
                    break;

                case 0:
                    System.out.println("PROGRAMA ENCERRADO!");
                    break;

                default:
                    System.out.println("OPÇÃO INVÁLIDA!");
            }

        }

        scanner.close();
    }
}
