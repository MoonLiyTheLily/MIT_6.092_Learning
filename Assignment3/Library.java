public class Library {
    // Add the missing implementation to this class
    String libraryAddress;
    Book[] bookList = new Book[4];
    int bookCounter = 0;

    
    
    static void printOpeningHours(){
        System.out.println("10am-9pm");
    }
    
    
    
    void printAddress(){
        System.out.println(libraryAddress);
    }
    
    
    
    void printAvailableBooks(){
        
        if (bookCounter == 0){
            System.err.println("No book in this library!");
        
        }else{
            
            for(int i = 0 ; i < bookList.length ; i++){
                
                if(bookList[i].borrowed == false){
                
                    System.out.println(bookList[i].title);
                
                }else{
                    continue;
                }
            }
        }

    }
    
    
    
    void addBook(Book newBook){
        bookList[ bookCounter ] = newBook;
        bookCounter++;
    }
    
    
    
    void borrowBook(String bookName){
        
        boolean successPrinted = false;
        if (bookCounter==0){
            System.err.println("No book in this library!");
        }else{
        
            for(int i = 0 ; i < bookList.length ; i++){
            
                if(bookName == bookList[i].title && bookList[i].borrowed==false){
                bookList[i].borrowed();
                successPrinted = true;
                
                }else if(bookName == bookList[i].title && bookList[i].borrowed==true){
                
                    System.err.println("This book have already been borrowed!");
                
                }else{
                
                    if(i == bookList.length - 1 && successPrinted == false){
                    System.err.println("This book isn't exist in this library.");
                    }else{
                    continue;
                    }//好像是多余的，除了两种情况还有名字不匹配的之外就是没找到书了.
                }
            }
        }
    }
    
    
    
    void returnBook(String bookName){
        
        boolean successReturned = false;

        if (bookCounter == 0){
            System.err.println("No book in this library!");
        }else{
            for(int i = 0 ; i < bookList.length ; i++){
                if(bookName == bookList[i].title && bookList[i].borrowed==true ){
                    bookList[i].returned();
                    System.out.println("Returned book" + " " + bookList[i].title);
                }else if(bookName == bookList[i].title && bookList[i].borrowed==false){
                    System.err.println("This book haven't been borrowed! You can't return it.");
                }else{
                    if(i == bookList.length - 1 && successReturned == false){
                        System.err.println("It seems that the book doesn't exist in the library.");
                    }
                }
            }
        }
    }
    
    
    Library(String libAdr){
        libraryAddress = libAdr;
    }
    
    
    
    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
} 