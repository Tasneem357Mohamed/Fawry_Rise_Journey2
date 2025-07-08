import java.util.Scanner;

public class DemoBook extends Book
{
    public DemoBook(String isbn, String title ,double price , int publishedYear)
    {
        super(isbn,title , price , publishedYear);
    }
    @Override
    public boolean Is_For_Sale()
    {
        return false;
    }
    @Override
    public String Delivery()
    {
        return "Is Not For Sale";
    }
    public static Book create(Scanner scanner) {
        System.out.println("Enter ISBN:");
        String isbn = scanner.nextLine();
        System.out.println("Enter Title:");
        String title = scanner.nextLine();
        System.out.println("Enter Price:");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter Publication Year:");
        int year = Integer.parseInt(scanner.nextLine());
        return new DemoBook(isbn, title, price, year);
    }
    @Override
    public double BuyBook(Book book , int quantity , String email)
    {
        DemoBook dbook = (DemoBook) book;
        System.out.println(dbook.Delivery() + ",So You Can Not Buy It ^^");
        return 0.0;
    }
}

