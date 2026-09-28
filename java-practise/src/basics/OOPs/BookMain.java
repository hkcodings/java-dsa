package basics.OOPs;

public class BookMain {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();

        b1.title = "Two States";
        b1.author = "Chethan Bhagath";
        b1.price = 200;
        b1.isAvailable = true;

        b2.title = "Do epic shit";
        b2.author = "Raj Shamani";
        b2.price = 300;
        b2.isAvailable = false;

        b1.displayBook();
        b2.displayBook();

        b1.borrowBook();
        b1.borrowBook();

        b1.returnBook();
        b1.displayBook();
    }
}

class Book{
    String title;
    String author;
    int price;
    boolean isAvailable;

    void displayBook(){
        System.out.println("Title:" + title + "\n" + "Author" + author + "\n" + "Price: " + price + "\n" + "Is available:" + isAvailable + "\n");
    }

    void borrowBook() {
        if(isAvailable) {
            isAvailable = false;
            System.out.println(title + "Book borrowed successfully");
        } else {
            System.out.println(title + "Book is already borrowed");
        }
    }

    void returnBook() {
        if(!isAvailable) {
            isAvailable = true;
            System.out.println(title + "Book returned successfully");
        } else {
            System.out.println(title + "Book is already available");
        }
    }
}
