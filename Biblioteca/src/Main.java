public class Main {
    public static void main(String[] args) {

        Biblioteca bibliotecaDeAtenas = new Biblioteca();

        Libro percyJackson = new Libro("Percy Jackson y el ladron del rayo", "Rick Riordan");
        Libro harryPotter = new Libro("Harry Potter y la piedra filosofal", "J. K. Rowling");

        bibliotecaDeAtenas.agregarLibro(percyJackson);
        bibliotecaDeAtenas.agregarLibro(harryPotter);

        bibliotecaDeAtenas.listarLibros();
    }
}