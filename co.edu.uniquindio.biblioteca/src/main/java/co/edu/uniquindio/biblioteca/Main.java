package co.edu.uniquindio.biblioteca;
import co.edu.uniquindio.biblioteca.model.Libro;
public class Main {
    public static void main(String[] args) {
        Libro book001= new Libro();
            book001.setTitle("A Cien años de soledad");
            book001.setGender("Novela");
            book001.setAuthor("Gabriel García Márquez");
            book001.setPublicationYear(1967);
            book001.setEditorial("Editorial Sudamericana");
            book001.setPageNumber(400);
        Libro book002= new Libro();
            book002.setTitle("iRayuela");
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
            book004.setTitle("Cálculo integral");
            book004.setGender("Académico");
            book004.setAuthor("Edwin J. Purcell");
            book004.setPublicationYear(1982);
            book004.setEditorial("McGraw Hill");
            book004.setPageNumber(1400);
        Libro book005= new Libro();
            book005.setTitle("Ficciones");
            book005.setGender("Cuentos");
            book005.setAuthor("Jorge Luis Borges");
            book005.setPublicationYear(1944);
            book005.setEditorial("Editorial Sur");
            book005.setPageNumber(150);

        //Obtener la cantidad de libros donde el título empiece por una vocal y consonante.

        int cantFirstVocal = 0;
        int cantFrirstCons = 0;

        char firstLetterBook1 = book001.title.charAt(0);
        char firstLetterBook2 = book002.title.charAt(0);
        char firstLetterBook3 = book003.title.charAt(0);
        char firstLetterBook4 = book004.title.charAt(0);
        char firstLetterBook5 = book005.title.charAt(0);

        if (firstLetterBook1 == 'a' || firstLetterBook1 == 'A' || firstLetterBook1 == 'e' || firstLetterBook1 == 'E' || firstLetterBook1 == 'i' || firstLetterBook1 == 'I' || firstLetterBook1 == 'o' || firstLetterBook1 == 'O' || firstLetterBook1 == 'u'|| firstLetterBook1 == 'U') {
            cantFirstVocal = cantFirstVocal + 1;
        } else {
            cantFrirstCons = cantFrirstCons + 1;
        }
        if (firstLetterBook2 == 'a' || firstLetterBook2 == 'A' || firstLetterBook2 == 'e' || firstLetterBook2 == 'E' || firstLetterBook2 == 'i' || firstLetterBook2 == 'I' || firstLetterBook2 == 'o' || firstLetterBook2 == 'O' || firstLetterBook2 == 'u'|| firstLetterBook2 == 'U') {
            cantFirstVocal = cantFirstVocal + 1;
        } else {
            cantFrirstCons = cantFrirstCons + 1;
        }
        if (firstLetterBook3 == 'a' || firstLetterBook3 == 'A' || firstLetterBook3 == 'e' || firstLetterBook3 == 'E' || firstLetterBook3 == 'i' || firstLetterBook3 == 'I' || firstLetterBook3 == 'o' || firstLetterBook3 == 'O' || firstLetterBook3 == 'u'|| firstLetterBook3 == 'U') {
            cantFirstVocal = cantFirstVocal + 1;
        } else {
            cantFrirstCons = cantFrirstCons + 1;
        }
        if (firstLetterBook4 == 'a' || firstLetterBook4 == 'A' || firstLetterBook4 == 'e' || firstLetterBook4 == 'E' || firstLetterBook4 == 'i' || firstLetterBook4 == 'I' || firstLetterBook4 == 'o' || firstLetterBook4 == 'O' || firstLetterBook4 == 'u'|| firstLetterBook4 == 'U') {
            cantFirstVocal = cantFirstVocal + 1;
        } else {
            cantFrirstCons = cantFrirstCons + 1;
        }
        if (firstLetterBook5 == 'a' || firstLetterBook5 == 'A' || firstLetterBook5 == 'e' || firstLetterBook5 == 'E' || firstLetterBook5 == 'i' || firstLetterBook5 == 'I' || firstLetterBook5 == 'o' || firstLetterBook5 == 'O' || firstLetterBook5 == 'u'|| firstLetterBook5 == 'U') {
            cantFirstVocal = cantFirstVocal + 1;
        } else {
            cantFrirstCons = cantFrirstCons + 1;
        }
        System.out.println("Hay " + cantFirstVocal + " libros que comienzan con vocal y " + cantFrirstCons + " libros que comienzan con consonantes.");

        // Modificar la información del libro “Cálculo integral” y ponerle “Cálculo integral y diferencial”

        if (book001.title.equalsIgnoreCase("Cálculo integral")){
            book001.setTitle("Cálculo integral y diferencial");
            System.out.println("Se modificó el título del libro con código 001, el nuevo título es: " + book001.title);
        }
        if (book002.title.equalsIgnoreCase("Cálculo integral")){
            book002.setTitle("Cálculo integral y diferencial");
            System.out.println("Se modificó el título del libro con código 002, el nuevo título es: " + book002.title);
        }
        if (book003.title.equalsIgnoreCase("Cálculo integral")){
            book003.setTitle("Cálculo integral y diferencial");
            System.out.println("Se modificó el título del libro con código 003, el nuevo título es: " + book003.title);
        }
        if (book004.title.equalsIgnoreCase("Cálculo integral")){
            book004.setTitle("Cálculo integral y diferencial");
            System.out.println("Se modificó el título del libro con código 004, el nuevo título es: " + book004.title);
        }
        if (book005.title.equalsIgnoreCase("Cálculo integral")){
            book005.setTitle("Cálculo integral y diferencial");
            System.out.println("Se modificó el título del libro con código 005, el nuevo título es: " + book005.title);
        }

        //Funcionalidad nueva: Libro con mayor cantidad de páginas.

        int highestPage = 0;
        String bookHighestPage = "";

        if (highestPage<book001.pageNumber) {
            highestPage = book001.pageNumber;
            bookHighestPage = book001.title;
        }
        if (highestPage<book002.pageNumber) {
            highestPage = book002.pageNumber;
            bookHighestPage = book002.title;
        }
        if (highestPage<book003.pageNumber) {
            highestPage = book003.pageNumber;
            bookHighestPage = book003.title;
        }
        if (highestPage<book004.pageNumber) {
            highestPage = book004.pageNumber;
            bookHighestPage = book004.title;
        }
        if (highestPage<book005.pageNumber) {
            highestPage = book005.pageNumber;
            bookHighestPage = book005.title;
        }

        System.out.println("El libro con mayor cantidad de páginas es " + bookHighestPage + " con " + highestPage + " páginas.");

        //Funcionalidad nueva: Orden alfabético
        
    }

}