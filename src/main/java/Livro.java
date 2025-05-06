
public class Livro {
     //ATRIBUTOS
    private int isbn;
    private String titulo;
    private String autor;
    private int ano;
    private static int proximoIsbn = 1;

    //CONSTRUTOR
    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.isbn = proximoIsbn++;
    }

    //MÉTODOS GETTER
    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;

    }

    public int getAno() {
        return this.ano;
    }

    //MÉTODOS SETTER
    public void setTitulo(String novoTitulo) {
        this.titulo = novoTitulo;
    }

    public void setAutor(String novoAutor) {
        this.autor = novoAutor;
    }

    public void setAno(int novoAno) {
        this.ano = novoAno;
    }
}
