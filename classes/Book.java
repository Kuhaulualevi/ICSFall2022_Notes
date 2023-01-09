package classes;

public class Book {
    private String genre; 
    private String name; 
    private int numOfPages; 

    /**
     * Book - no arg constructor that sets the variables to a random answer. 
     */
    public Book() {
        this.genre = "unknown"; 
        this.name = "unknown"; 
        this.numOfPages = 0; 
    }
    /**
     * Book - constructor with three args: genre, name, and numOfPages. Will
     * set a book object with those parameters. 
     * @param genre
     * @param name
     * @param numOfPages
     */
    public Book(String genre, String name, int numOfPages) {
        this.genre = genre; 
        this.name = name; 
        this.numOfPages = numOfPages; 
    }
    /**
     * setGenre - will set the attribute genre
     * @param genre
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }
    /**
     * setName - will set the attribute name 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * setNumOfPages - will set the attribute numOfPages.
     * @param numOfPages
     */
    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }
    /**
     * getGenre - returns the genre of the book
     * @return genre - the genre of the book
     */
    public String getGenre() {
        return genre;
    }
    /**
     * getName - returns the name of the book
     * @return name - name of the book
     */
    public String getName() {
        return name;
    }
    /**
     * getNumOfPages - return the number of pages for a book
     * @return numOfPages - number of pages
     */
    public int getNumOfPages() {
        return numOfPages;
    }

    @Override
    /**
     * toString - will output a book's information in a nicely formatted way
     * @return - a nicely formatted statement of a book's genre, name, and number of pages. 
     */
    public String toString() {
        return "Genre: " + genre + "\nName: " + name + "\nNumber of Pages: " + numOfPages;
    }
}
