package co.edu.uniquindio.biblioteca;

public class Main {
    public static void main(String[] args) {
        Libro book001= new Libro();
            book001.setTitle("Cien años de soledad");
            book001.setGender("Novela");
            book001.setAuthor("Gabriel García Márquez");
            book001.setPublicationYear(1967);
            book001.setEditorial("Editorial Sudamericana");
            book001.setPageNumber(400);
        Libro book002= new Libro();
            book002.setTitle("Rayuela");
            book002.setGender("Novela");
            book002.setAuthor("Julio Cortázar");
            book002.setPublicationYear(1963);
            book002.setEditorial("Editorial Sudamericana");
            book002.setPageNumber(600);
        Libro book003= new Libro();
            book003.setTitle("Pedro Páramo");
            book003.setGender("Novela");
            book003.setAuthor("Juan Rulfo");
            book003.setPublicationYear(1955);
            book003.setEditorial("Fondo de Cultura Económica");
            book003.setPageNumber(150);
        Libro book004= new Libro();
            book004.setTitle("La casa de los espíritus");
            book004.setGender("Novela");
            book004.setAuthor("Isabel Allende");
            book004.setPublicationYear(1982);
            book004.setEditorial("Plaza & Janés");
            book004.setPageNumber(400);
        Libro book005= new Libro();
            book005.setTitle("Ficciones");
            book005.setGender("Cuentos");
            book005.setAuthor("Jorge Luis Borges");
            book005.setPublicationYear(1944);
            book005.setEditorial("Editorial Sur");
            book005.setPageNumber(150);

        char C1 = book001.title.charAt(0);
        System.out.println(C1);

    }
}