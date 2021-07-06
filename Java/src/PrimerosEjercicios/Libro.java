package PrimerosEjercicios;

public class Libro {
    public String titulo;
    public String isbn;
    public String author;
    public boolean disponible;

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) {  this.author = author; }

    public String prestamo() {
        if (this.disponible) {
            this.disponible = false;
            return "Prestado";
        }
        else
            return "El libro no se encuentra disponible";
    }

    public String devolucion() {
        if (!this.disponible) {
            this.disponible = true;
            return "Devuelto";
        }
        else
            return "El libro ya se encuentra disponible";
    }

    @Override
    public String toString() {
        return this.titulo + ", " + this.isbn + ", " + this.author;
    }
}
