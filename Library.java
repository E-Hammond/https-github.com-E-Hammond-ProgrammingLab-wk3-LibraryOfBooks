import java.util.ArrayList;

public class Library {
    private String address;
    private ArrayList<Book> books = new ArrayList<Book>();



    public Library(String address) {
        this.address = address;
    }

    public void addBook(Book book) {
        books.add(book);
        //System.out.println(books);
    }


    public static void printOpeningHours() {
        System.out.println("Libraries are open daily from 9am to 5pm");
    }

    public void printAddress() {
        System.out.println(address);
    }

    public void borrowBook(String bookTitle) {
        //bookTitle = getTitle();
        String message = "Sorry, this book is not in our catalog.";
        for (Book book : books) {
            if (book.getTitle().equals(bookTitle)) {
                if (!(book.isBorrowed())) {
                    book.borrowed();
                    message = "You successfully borrowed" + bookTitle;
                } else message = "Sorry, this book is already borrowed.";
            }
        }
        System.out.println(message);
    }


    public void printAvailableBooks() {
        int sizeOfBook = books.size();

        for (Book book : books) {
            if (!(book.isBorrowed())) {
                System.out.println(book.getTitle());
            } else {
                sizeOfBook -= 1;
            }

        }
        if (sizeOfBook == 0) {
            System.out.println("No book in the catalog");
        }

    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                book.returned();
                System.out.println("You successfully returned " + title);
            }
        }

    }

}


