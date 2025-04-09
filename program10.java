import java.util.Scanner;

class Book 
{
    private String title;
    private String author;
    private double price;
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("----------------------");
    }
}

public class program10
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of books: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        Book[] books = new Book[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");
            System.out.print("Title: ");
            String title = sc.nextLine();
            System.out.print("Author: ");
            String author = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine(); 

            books[i] = new Book(title, author, price);
        }
        System.out.println("\nBook Details:");
        for (Book book : books) {
            book.displayBook();
        }

        sc.close();
    }
}
