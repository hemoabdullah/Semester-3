package week1;

public class Book {
    private String title;  
    private String author;  

    public void setTitle(String newTitle) {  
        this.title = newTitle;
    }

    public void setAuthor(String newAuthor) {  
        this.author = newAuthor;
    }

    public void openBook() {  // Method to open the book
        System.out.println("Opening the book titled '" + title + "'.");
    }

    public void closeBook() {  // Method to close the book
        System.out.println("Closing the book titled '" + title + "'.");
    }

    public void showBookInfo() {  // Method to display book information
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

