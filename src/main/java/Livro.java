
public class Livro {

    private String isbn;
    private String titulo;
    private String autor;
    private int ano;

    //CONSTRUTOR
    public Livro(String isbn, String titulo, String autor, int ano) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    //GETTERS
    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    //MÉTODO EXIBIR LISTA.
    public void exibir() {
        System.out.println("Titulo: " + titulo + " | Autor: " + autor + " | Ano: " + ano
                + " | ISBN: " + isbn);
    }
}
