public class LibraryTest {
    public static void main(String[] args) {
        // Create objects of Book and Movie
        Book book1 = new Book("The Witcher", 1990, "Andrzej Sapkowski", 320);
        Book book2 = new Book("War and Peace", 1869, "Leo Tolstoy", 1225);

        Movie movie1 = new Movie("The Green Mile", 1999, "Frank Darabont", 189);
        Movie movie2 = new Movie("Inception", 2010, "Christopher Nolan", 148);

        // Polymorphic array
        LibraryMedia[] mediaArray = new LibraryMedia[4];
        mediaArray[0] = book1;
        mediaArray[1] = book2;
        mediaArray[2] = movie1;
        mediaArray[3] = movie2;

        // Display information using polymorphism
        System.out.println("===== INFORMATION ABOUT ALL MEDIA =====");
        for (LibraryMedia media : mediaArray) {
            media.displayInformation();
            System.out.println();
        }

        // Borrowing and returning operations
        System.out.println("===== BORROWING AND RETURNING OPERATIONS =====");
        book1.borrow();
        book1.borrow(); // Attempting to borrow again
        book1.returnMedia();

        // Type-specific methods
        System.out.println("===== TYPE-SPECIFIC METHODS =====");
        book2.checkNumberOfPages();
        movie1.checkDuration();

        // Demonstrating casting to call type-specific methods
        System.out.println("===== TYPE CASTING =====");
        for (LibraryMedia media : mediaArray) {
            if (media instanceof Book) {
                ((Book) media).checkNumberOfPages();
            } else if (media instanceof Movie) {
                ((Movie) media).checkDuration();
            }
        }
    }
}