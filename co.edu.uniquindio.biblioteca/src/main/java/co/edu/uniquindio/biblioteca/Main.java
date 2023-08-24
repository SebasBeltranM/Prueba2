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

        String textoLetraInicial = clasificarLetraInicial( book001, book002, book003, book004, book005);

        imprimirInformacion( textoLetraInicial );

        modificarTitulo( book001, book002, book003, book004, book005);

        buscarLibroMasPaginas( book001, book002, book003, book004, book005);

        String textoGeneroNovelas = buscarNovelas( book001, book002, book003, book004, book005);

        imprimirInformacion( textoGeneroNovelas );

    }

    private static void imprimirInformacion(String mensaje) {
        System.out.println(mensaje);
    }

    private static String clasificarLetraInicial(Libro book001, Libro book002, Libro book003, Libro book004, Libro book005) {

        //Contar los libros según la letra inicial en vocal o consonante.

        int cantFirstVocal = 0;
        int cantFirstCons = 0;

        char firstLetterBook1 = book001.getTitle().charAt(0);
        char firstLetterBook2 = book002.getTitle().charAt(0);
        char firstLetterBook3 = book003.getTitle().charAt(0);
        char firstLetterBook4 = book004.getTitle().charAt(0);
        char firstLetterBook5 = book005.getTitle().charAt(0);

        if (firstLetterBook1 == 'a' || firstLetterBook1 == 'A' || firstLetterBook1 == 'e' || firstLetterBook1 == 'E' || firstLetterBook1 == 'i' || firstLetterBook1 == 'I' || firstLetterBook1 == 'o' || firstLetterBook1 == 'O' || firstLetterBook1 == 'u'|| firstLetterBook1 == 'U') {
            cantFirstVocal = cantFirstVocal + 1;
        } else {
            cantFirstCons = cantFirstCons + 1;
        }
        if (firstLetterBook2 == 'a' || firstLetterBook2 == 'A' || firstLetterBook2 == 'e' || firstLetterBook2 == 'E' || firstLetterBook2 == 'i' || firstLetterBook2 == 'I' || firstLetterBook2 == 'o' || firstLetterBook2 == 'O' || firstLetterBook2 == 'u'|| firstLetterBook2 == 'U') {
            cantFirstVocal = cantFirstVocal + 1;
        } else {
            cantFirstCons = cantFirstCons + 1;
        }
        if (firstLetterBook3 == 'a' || firstLetterBook3 == 'A' || firstLetterBook3 == 'e' || firstLetterBook3 == 'E' || firstLetterBook3 == 'i' || firstLetterBook3 == 'I' || firstLetterBook3 == 'o' || firstLetterBook3 == 'O' || firstLetterBook3 == 'u'|| firstLetterBook3 == 'U') {
            cantFirstVocal = cantFirstVocal + 1;
        } else {
            cantFirstCons = cantFirstCons + 1;
        }
        if (firstLetterBook4 == 'a' || firstLetterBook4 == 'A' || firstLetterBook4 == 'e' || firstLetterBook4 == 'E' || firstLetterBook4 == 'i' || firstLetterBook4 == 'I' || firstLetterBook4 == 'o' || firstLetterBook4 == 'O' || firstLetterBook4 == 'u'|| firstLetterBook4 == 'U') {
            cantFirstVocal = cantFirstVocal + 1;
        } else {
            cantFirstCons = cantFirstCons + 1;
        }
        if (firstLetterBook5 == 'a' || firstLetterBook5 == 'A' || firstLetterBook5 == 'e' || firstLetterBook5 == 'E' || firstLetterBook5 == 'i' || firstLetterBook5 == 'I' || firstLetterBook5 == 'o' || firstLetterBook5 == 'O' || firstLetterBook5 == 'u'|| firstLetterBook5 == 'U') {
            cantFirstVocal = cantFirstVocal + 1;
        } else {
            cantFirstCons = cantFirstCons + 1;
        }
        String letraInicial = "Hay " + cantFirstVocal + " libros que comienzan con vocal y " + cantFirstCons + " libros que comienzan con consonantes.";
        return letraInicial;
    }

    private static void modificarTitulo(Libro book001, Libro book002, Libro book003, Libro book004, Libro book005) {
        // Modificar la información del libro “Cálculo integral” y ponerle “Cálculo integral y diferencial”, informar en cual(es)
        // libros hubo modificación.

        if (book001.getTitle().equalsIgnoreCase("Cálculo integral")){
            book001.setTitle("Cálculo integral y diferencial");
            System.out.println("Se modificó el título del libro con código 001, el nuevo título es: " + book001.getTitle());
        }
        if (book002.getTitle().equalsIgnoreCase("Cálculo integral")){
            book002.setTitle("Cálculo integral y diferencial");
            System.out.println("Se modificó el título del libro con código 002, el nuevo título es: " + book002.getTitle());
        }
        if (book003.getTitle().equalsIgnoreCase("Cálculo integral")){
            book003.setTitle("Cálculo integral y diferencial");
            System.out.println("Se modificó el título del libro con código 003, el nuevo título es: " + book003.getTitle());
        }
        if (book004.getTitle().equalsIgnoreCase("Cálculo integral")){
            book004.setTitle("Cálculo integral y diferencial");
            System.out.println("Se modificó el título del libro con código 004, el nuevo título es: " + book004.getTitle());
        }
        if (book005.getTitle().equalsIgnoreCase("Cálculo integral")){
            book005.setTitle("Cálculo integral y diferencial");
            System.out.println("Se modificó el título del libro con código 005, el nuevo título es: " + book005.getTitle());
        }

    }

    private static void buscarLibroMasPaginas(Libro book001, Libro book002, Libro book003, Libro book004, Libro book005) {
        //Funcionalidad nueva: Libro con mayor cantidad de páginas.

        int highestPage = 0;
        String bookHighestPage = "";

        if (highestPage<book001.getPageNumber()) {
            highestPage = book001.getPageNumber();
            bookHighestPage = book001.getTitle();
        }
        if (highestPage<book002.getPageNumber()) {
            highestPage = book002.getPageNumber();
            bookHighestPage = book002.getTitle();
        }
        if (highestPage<book003.getPageNumber()) {
            highestPage = book003.getPageNumber();
            bookHighestPage = book003.getTitle();
        }
        if (highestPage<book004.getPageNumber()) {
            highestPage = book004.getPageNumber();
            bookHighestPage = book004.getTitle();
        }
        if (highestPage<book005.getPageNumber()) {
            highestPage = book005.getPageNumber();
            bookHighestPage = book005.getTitle();
        }

        System.out.println("El libro con mayor cantidad de páginas es " + bookHighestPage + " con " + highestPage + " páginas.");

    }
    private static String buscarNovelas(Libro book001, Libro book002, Libro book003, Libro book004, Libro book005) {

        int cantidadNovelas = 0;

        if (book001.getGender().equalsIgnoreCase("novela")) {
            cantidadNovelas = cantidadNovelas + 1;
        }
        if (book002.getGender().equalsIgnoreCase("novela")) {
            cantidadNovelas = cantidadNovelas + 1;
        }
        if (book003.getGender().equalsIgnoreCase("novela")) {
            cantidadNovelas = cantidadNovelas + 1;
        }
        if (book004.getGender().equalsIgnoreCase("novela")) {
            cantidadNovelas = cantidadNovelas + 1;
        }
        if (book005.getGender().equalsIgnoreCase("novela")) {
            cantidadNovelas = cantidadNovelas + 1;
        }
        String generoNovela = "Hay " + cantidadNovelas + " libros del género novela";
        return generoNovela;
    }

}