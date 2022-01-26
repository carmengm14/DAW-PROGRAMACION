import javax.swing.text.StyledEditorKit.BoldAction;

/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private String refNumber = "";
    private int borrowed;
    private int pages;
    private boolean courseText;
    
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean courseTextt)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        courseText = courseTextt;
    }

    // Add the methods here ...
    public String getAuthor(){
        return author;
    }
    public String getTitle(){
        return title;
    }
    public int getPages(){
        return pages;
    }
    //impirmir el autor y titulo del libro
    public void printAuthor(){
        System.out.println("El autor del libro es: " + author);
    }
    public void printTitle(){
        System.out.println("El titulo del libro es: " + title);
    }
    //mutador de referencia 
    public void setRefNumbre(String ref){
        if (ref.length() >= 3) {
            refNumber = ref;
        }
        System.out.println("Error, no se ha podido modificar el campo.");
    }
    //el getter de referencia
    public String getRefNumbre(){
        return refNumber;
    }
    //mutador de borrowed
    public void borrow(){
        this.borrowed++;
    }
    //el getter de borrowed
    public int getBorrowed(){
        return borrowed;
    }
    //getter de si se esta usando un libro o no
    public boolean isCourseText() {
        return courseText;
    }

    public void printDetails(){
        printAuthor();
        printTitle();
        System.out.println("Numero de paginas: " + this.pages);
        System.out.println("Numero de referencia: " + this.refNumber);
        System.out.println("Numero de veces prestado: " + this.borrowed);
        if (courseText == true) {
            System.out.println("Se esta utilizando");
        }else{
            System.out.println("No se esta utilizando");
        }
    }
}

