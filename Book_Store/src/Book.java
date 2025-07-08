import java.util.Scanner;

public abstract class Book
{
    public String ISBN;
    public String Title;
    public int PublishedYear;
    public double Price;

    public Book(String isbn, String title ,double price , int publishedYear) {
        this.ISBN = isbn;
        Title = title;
        Price = price;
        PublishedYear = publishedYear;
    }
    public abstract boolean Is_For_Sale();
    public abstract String Delivery();
    public abstract double BuyBook(Book book , int quantity , String email);
}
