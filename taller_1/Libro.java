package taller_1;
public class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

   
    public Libro() {
        this.titulo = "100 años de soledad";
        this.autor = "Gabriel García Márquez";
        this.numeroPaginas = 250;
    }

   
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    
    @Override
    public String toString() {
        return "Libro: " + titulo + " | Autor: " + autor + " | Páginas: " + numeroPaginas;
    }

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}