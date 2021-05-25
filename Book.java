
/**
 * Class of Book
 * contains an ID, name, author, quantity, image
 *
 * @author Will
 * @version (a version number or a date)
 */
public class Book
{
    // fields
    private int id;
    private String name;
    private String author;
    private int quantity;
    private String image; // to complete
    
    /**
     * Constructor to make the book object
     */
    public Book(int id, String nm, String auth, int qty)
    {
        this.id = id;
        this.name= nm;
        this. author = auth;
        this.quantity = qty;
    }
    
    /**
     * Getter for ID
     */
    public int getId() {
        return this.id;
    }
    
    /**
     * Getter for name
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * Getter for author
     */
    public String getAuthor() {
        return this.author;
    }
    
    /**
     * Getter for quantity
     */
    public int getQuantity() {
        return this.quantity;
    }
}
