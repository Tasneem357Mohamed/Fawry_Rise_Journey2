import java.util.*;
import java.util.function.Function;

public class Test
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //Initial add to fill Initial Data
        //For PaperBook
        BookStore.AddBook(new PaperBook("PB001", "Clean Code", 350.0, 2008, 50, true , 3.0));
        BookStore.AddBook(new PaperBook("PB002", "Effective Java", 420.50, 2018,20 , true , 0.5));
        BookStore.AddBook(new PaperBook("PB003", "Design Patterns", 150.0, 1994, 35, false , 0.0));

        //For EBook
        BookStore.AddBook(new EBook("EB001", "Python Crash Course", 200.0, 2019, "PDF"));
        BookStore.AddBook(new EBook("EB002", "The Pragmatic Programmer", 55.5, 1999, "EPUB"));
        BookStore.AddBook(new EBook("EB003", "JavaScript: The Good Parts", 75.0, 2008, "MOBI"));

        //For DemoBook
        BookStore.AddBook(new DemoBook("DB001", "Python Crash Course", 200.0, 2005));
        BookStore.AddBook(new DemoBook("DB002", "The Pragmatic Programmer", 55.5, 1989));
        BookStore.AddBook(new DemoBook("DB003", "JavaScript: The Good Parts", 75.0, 2011));

        //to control in Book Types
        Map<String, Function<Scanner, Book>> bookTypes = new LinkedHashMap<>();
        bookTypes.put("PaperBook", PaperBook::create);
        bookTypes.put("EBook", EBook::create);
        bookTypes.put("DemoBook", DemoBook::create);

        while(true)
        {
            System.out.println("Welcome To Our BookStore ^^");
            System.out.println("===========================");
            int ans;
            // called the customer functions
            while(true)
            {
                System.out.println("What do you want to do?");
                System.out.println("=======================");
                System.out.println("1- Add Book");
                System.out.println("2- Remove Book");
                System.out.println("3- Buy Book");
                ans = scanner.nextInt();
                scanner.nextLine();
                if(ans == 1 || ans == 2 || ans == 3)
                {
                    break;
                }
                else
                {
                    System.out.println("Invalid Number!!!");
                    System.out.println("Please,try again ^^");
                    System.out.println("===================");
                }
            }
            //add book
            if(ans == 1)
            {
               while(true)
               {
                   while(true)
                   {
                       System.out.println("Choose book type to add:");
                       System.out.println("========================");
                       List<String> keys = new ArrayList<>(bookTypes.keySet());
                       for (int i = 0; i < keys.size(); i++) {
                           System.out.println((i + 1) + ". " + keys.get(i));
                       }
                       int choice = Integer.parseInt(scanner.nextLine()) - 1;
                       if (choice >= 0 && choice < keys.size()) {
                           String type = keys.get(choice);
                           Book newBook = bookTypes.get(type).apply(scanner);
                           BookStore.AddBook(newBook);
                           break;
                       }
                       else
                       {
                           System.out.println("Invalid Number!!!");
                           System.out.println("Please,try again ^^");
                           System.out.println("===================");
                       }
                   }
                   String enter;
                   while(true)
                   {
                       System.out.println("Do you want to add another book?");
                       System.out.println("================================");
                       System.out.println("User Answer: ");
                       enter  = scanner.nextLine();

                       if(enter.toLowerCase().equals("no") | enter.toLowerCase().equals("yes"))
                       {
                           break;
                       }
                       else
                       {
                           System.out.println("Invalid Answer!!!");
                           System.out.println("Please, try again ^^");
                           System.out.println("=====================");
                       }
                   }
                   if(enter.toLowerCase().equals("no"))
                   {
                       break;
                   }
               }
            }
            else if(ans == 2)
            {
                List<Book> removedBooks = BookStore.RemoveBook();
                if (removedBooks.isEmpty()) {
                    System.out.println("No books were removed.");
                } else {
                    System.out.println("Removed Books:");
                    for (Book book : removedBooks) {
                        System.out.println("ISBN: " + book.ISBN + ", Title: " + book.Title + ", Published Year: " + book.PublishedYear);
                    }
                }

            }
            else
            {
                Book found = null;
                while(true)
                {
                    while(true)
                    {
                        System.out.println("Enter ISBN of Book to buy:");
                        String isbn = scanner.nextLine().trim();
                        for (Book book : BookStore.Inventory) {
                            if (book.ISBN.equals(isbn)) {
                                found = book;
                                break;
                            }
                        }
                        if (found == null)
                        {
                            System.out.println("Book not found!!!");
                            System.out.println("Please, try again ^^");
                        }
                        else
                        {
                            break;
                        }
                    }
                    System.out.println("Enter quantity (default is 1):");
                    int quantity = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter email (for EBooks):");
                    String email = scanner.nextLine();
                    double total = found.BuyBook(found , quantity, email);
                    System.out.println("The Total Cost : " + total);
                    String enter;
                    while(true)
                    {
                        System.out.println("Do you want to buy another book?");
                        System.out.println("================================");
                        System.out.println("User Answer: ");
                        enter  = scanner.nextLine();

                        if(enter.toLowerCase().equals("no") | enter.toLowerCase().equals("yes"))
                        {
                            break;
                        }
                        else
                        {
                            System.out.println("Invalid Answer!!!");
                            System.out.println("Please, try again ^^");
                            System.out.println("=====================");
                        }
                    }
                    if(enter.toLowerCase().equals("no"))
                    {
                        break;
                    }
                }
            }
            String answer;
            while(true)
            {
                System.out.println("Do you want to Close The BookStore?");
                System.out.println("================================");
                System.out.println("User Answer: ");
                answer = scanner.next();
                if(answer.toLowerCase().equals("no") | answer.toLowerCase().equals("yes"))
                {
                    break;
                }
                else
                {
                    System.out.println("Invalid Answer!!!");
                    System.out.println("Please, try again ^^");
                    System.out.println("=====================");
                }
            }
            if(answer.toLowerCase().equals("yes"))
            {
                System.out.println("Thank You For Using Our BookStore ,come again ^^");
                break;
            }
        }
    }
}
