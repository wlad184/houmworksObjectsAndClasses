public class Book {
    private String nameBook;
    private Author author;
    private int yearPublication;

    Book(String nameBook, Author author, int yearPublication) {
        this.nameBook = nameBook;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    String getNameBook() {
        return nameBook;
    }

    int getYearPublication() {
        return yearPublication;
    }

    int setYearPublication(int a) {

        return yearPublication = a;
    }

}
