package co.edu.uniquindio.biblioteca.model;

public class Libro {

    //Atributos
        public String title;
        public String gender;
        public String author;
        public Integer publicationYear;
        public String editorial;
        public Integer pageNumber;

    //Métodos para obtener información
        public String getTitle(){
            return this.title;
        }
        public String getGender(){
            return this.gender;
        }
        public String getAuthor(){
            return this.author;
        }
        public Integer getPublicationYear(){
            return this.publicationYear;
        }
        public String getEditorial(){
            return this.editorial;
        }
        public Integer getPageNumber(){
            return this.pageNumber;
        }

    //Métodos para editar información
        public void setTitle(String title) {
            this.title = title;
        }
        public void setGender(String gender) {
            this.gender = gender;
        }
        public void setAuthor(String author) {
            this.author = author;
        }
        public void setPublicationYear(Integer publicationYear) {
            this.publicationYear = publicationYear;
        }
        public void setEditorial(String editorial) {
            this.editorial = editorial;
        }
        public void setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
        }
 }