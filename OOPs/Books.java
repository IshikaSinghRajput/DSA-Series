class Book{
    String title;
    String author;

    //Parameterized Constructor
    Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    void displayDetails(){
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
    }
}

public class Books {
    public static void main(String[] args) {
        Book myBook = new Book("The Harry Potter", "Pablo Naruto");

        myBook.displayDetails();
    }
}
