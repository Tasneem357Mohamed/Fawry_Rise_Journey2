import java.util.Scanner;

public class PaperBook extends Book
{
    public int Stock;
    public boolean IsShippable;
    public double ShippingWieght;
    static Scanner scanner = new Scanner(System.in);
    public PaperBook(String isbn, String title ,double price , int publishedYear, int stock, boolean isShippable , double shippingwieght)
    {
        super(isbn,title , price , publishedYear);
        Stock = stock;
        IsShippable = isShippable;
        ShippingWieght = shippingwieght;
    }
    @Override
    public boolean Is_For_Sale()
    {
        return true;
    }
    @Override
    public String Delivery()
    {
        return "Is Shipping Book";
    }
    public static Book create(Scanner scanner) {
        System.out.println("Enter ISBN:");
        String isbn = scanner.nextLine();
        System.out.println("Enter Title:");
        String title = scanner.nextLine();
        System.out.println("Enter Publication Year(before 2026):");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Price:");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter Stock:");
        int stock = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter IsShippable or not(true/false):");
        boolean shippable = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Enter Shipping Weight:");
        double shippingwieght = Double.parseDouble(scanner.nextLine());
        return new PaperBook(isbn, title, price, year, stock , shippable , shippingwieght);
    }
    @Override
    public double BuyBook(Book book , int quantity , String email)
    {
        PaperBook PBook;
        String ans;
        double PaidPrice = 0.0;
        PBook = (PaperBook) book;
        System.out.println(PBook.Delivery());
        if(PBook.Stock < quantity)
        {
            System.out.println("The requested quantity is not available in stock ^^");
            while(true)
            {
                System.out.println("Do you want to buy the available quantity?");
                System.out.println("==========================================");
                ans = scanner.next();
                if(ans.toLowerCase().equals("no") || ans.toLowerCase().equals("yes"))
                {
                    break;
                }
                else
                {
                    System.out.println("Invalid Answer!!!");
                    System.out.println("Please,try again ^^");
                    System.out.println("===================");
                }
            }
            if(ans.toLowerCase().equals("yes"))
            {
                PaidPrice += (PBook.Stock * PBook.Price);
                quantity = PBook.Stock;
                PBook.Stock = 0;
            }

        }
        else if(PBook.Stock == 0)
        {
            System.out.println("Sorry,you can not buy this book because it is out of stock ^^");
        }
        else
        {
            PaidPrice += (quantity * PBook.Price);
            PBook.Stock -= quantity;
            if(PBook.Stock <= 0)
            {
                PBook.Stock = 0;
            }
        }
        double shipping = BookStore.ShippingService(PBook , quantity);
        System.out.println("The total Book Price :    " + PaidPrice);
        return (PaidPrice + shipping);
    }
}

