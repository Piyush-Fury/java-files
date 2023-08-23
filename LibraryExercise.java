    class Library{
        String [] book;
        int no_of_books;
        Library(){
            this.book = new String[100];
            int no_of_books = 0;
        }

        // Method to add book into library
        void addBook(String book){
            this.book[no_of_books] = book;
            no_of_books++; 
            System.out.println(book + " Book Has Been Added");
        }

        // Method to Show available book in the library
        void showAvailableBooks(){
            System.out.println("Available Books Are :");
            for (String book : this.book) {
                if(book == null){
                    continue;
                }
                System.out.println("* "+ book);
            }
        }

        // Method to issue the Book
        void issueBook(String book)
        {
         for(int i=0;i<this.book.length;i++)
         {
            if(this.book[i] == book)
            {
                System.out.println("The book has been issued");
                this.book[i] = null;
                return;
            }
         }
         System.out.println("Sorry For the Inconvenience, we don't have this book!!");
        }

        //Method to Return the Issued Book
        void returnBook(String book)
        {
             addBook(book);
        }
    }
public class LibraryExercise {
    public static void main(String[] args) {
        Library centralLibrary = new Library();
        centralLibrary.addBook("Think and grow rich");
        centralLibrary.addBook("Java");
        centralLibrary.addBook("Think like a Monk");
        centralLibrary.addBook("C++");
        centralLibrary.showAvailableBooks();
    }
}
