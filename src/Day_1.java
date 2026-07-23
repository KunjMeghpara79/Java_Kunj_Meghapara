class Book{
    private String book_name;
    private String serial_number;
    private String author;
    Book(String book_name, String serial_number, String author){
        this.book_name = book_name;
        this.serial_number = serial_number;
        this.author = author;
    }

    public void displayBook(){
        System.out.println("Book Name : " + book_name);
        System.out.println("Serial No : " + serial_number);
        System.out.println("Author    : " + author);
    }
}
class Borrower{
    private String name;
    private String contact;

    Borrower(String name,String number){
        if(number.length() != 10){
            System.out.println("Invalid number format");
        }else {
            this.name = name;
            this.contact = number;
        }
    }
    public void displayBorrower(){
        System.out.println("Borrower Name : " + name);
        System.out.println("Contact       : " + contact);
    }
}
class Librarian{
    private String name;
    private String contact;
    Librarian(String name,String contact){
        if(contact.length() != 10){
            System.out.println("Invalid number format");
        }else {
            this.name = name;
            this.contact = contact;
        }
    }
    public void displayLibrarian(){
        System.out.println("Librarian Name : " + name);
        System.out.println("Contact        : " + contact);
    }
}
public class Day_1 {
    public static void main(String[] args) {
        Book book = new Book(
                "Java: The Complete Reference",
                "B001",
                "......"
        );

        Borrower borrower = new Borrower(
                "Kunj Meghapara",
                "9876543210"
        );

        Librarian librarian = new Librarian(
                "Mr. Patel",
                "9123456789"
        );

        System.out.println("===== BOOK DETAILS =====");
        book.displayBook();

        System.out.println("\n===== BORROWER DETAILS =====");
        borrower.displayBorrower();

        System.out.println("\n===== LIBRARIAN DETAILS =====");
        librarian.displayLibrarian();
    }
}
