import java.util.*;

public class BookStore
{
    public static final int ExpiredYears = 10;
    private final static double Priceforshipping = 10; // 10$ for each 1kg
    public static List<Book> Inventory = new ArrayList<>();
    public static void AddBook(Book book)
    {
        Inventory.add(book);
    }

    public static List<Book> RemoveBook() {
        int year, DiffYear;
        List<Book> RemovedBooks = new ArrayList<>();
        Iterator<Book> iterator = Inventory.iterator();

        while (iterator.hasNext()) {
            Book b = iterator.next();
            year = b.PublishedYear;
            DiffYear = 2025 - year;

            if (DiffYear > ExpiredYears) {
                iterator.remove();
                RemovedBooks.add(b);
            }
        }

        return RemovedBooks;
    }

    public static double ShippingService(PaperBook book , int quantity)
    {
        System.out.println(" ** Shipment Notice ** ");
        System.out.println("=======================");
        double totalweight = 0.0;
        double totalshippingprice = 0.0;
        System.out.println(quantity + "x " + book.Title + "          " + book.ShippingWieght/1000.0 + "g");
        totalweight += (book.ShippingWieght * quantity);
        System.out.println("Total package weight  " + totalweight + "kg");
        totalshippingprice = totalweight * Priceforshipping;
        System.out.println("=================================================");
        System.out.println("The total Shipping price :     " + totalshippingprice);
        return totalshippingprice;
    }
    public static void MailService(EBook book , String email)
    {
        System.out.println("Send The Book is completed successfully for this email(" + email + ") ^^");
        System.out.println("The EBook Information:");
        System.out.println("======================");
        System.out.println("The Book Title : " + book.Title);
        System.out.println("The Book ISBN : " + book.ISBN);
        System.out.println("The Book Price : " + book.Price);
        System.out.println("The Book Published Year : " + book.PublishedYear);
        System.out.println("The Book File Type : " + book.FileType);
    }
}
