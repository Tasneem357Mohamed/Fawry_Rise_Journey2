import java.util.Scanner;

public class EBook extends Book
{
    public String FileType;

    public EBook(String isbn, String title ,double price , int publishedYear,String fileType)
    {
        super(isbn,title , price , publishedYear);
        FileType = fileType;
    }
    @Override
    public boolean Is_For_Sale()
    {
        return true;
    }
    @Override
    public String Delivery()
    {
        return "Is Send Via Email";
    }
    public static Book create(Scanner scanner) {
        System.out.println("Enter ISBN:");
        String isbn = scanner.nextLine();
        System.out.println("Enter Title:");
        String title = scanner.nextLine();
        System.out.println("Enter Publication Year:");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Price:");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter File Type:");
        String fileType = scanner.nextLine();

        return new EBook(isbn, title, price, year, fileType);
    }
    @Override
    public double BuyBook(Book book , int quantity , String email)
    {
        EBook ebook = (EBook) book;
        System.out.println(ebook.Delivery());
        BookStore.MailService(ebook, email);
        return ebook.Price;
    }
}
