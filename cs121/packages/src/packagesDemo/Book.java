package packagesDemo;

public class Book {
    private String author, title, publication;
    private int cost;

    public Book() {
        author = "N/A";
        title = "N/A";
        publication = "N/A";
        cost = 0;
    }

    public Book(String author, String title, String publication, int cost) {
        this.author = author;
        this.title = title;
        this.publication = publication;
        this.cost = cost;
    }

    private void setAuthor(String author) {
        this.author = author;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    private void setPublication(String publication) {
        this.publication = publication;
    }

    private void setCost(int cost) {
        this.cost = cost;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getPublication() {
        return publication;
    }

    public int getCost() {
        return cost;
    }

    public void display() {
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Publication Date: " + publication);
        System.out.println("Cost: " + cost);
        System.out.println();
    }
}






