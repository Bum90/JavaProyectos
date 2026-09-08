public class Libro {
    private String titulo;
    private String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
public void mostrar() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
}
