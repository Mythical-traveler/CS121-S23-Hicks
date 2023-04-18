package packagesDemo;

public class Main {
    public static void main(String[] args) {
        Book book= new Book();
        book.display();
        Book b2=new Book("Smedley D. Butler\n","War is a Racket","1935", 10);
        b2.display();
        Book b3=new Book("S.M. Stirling","Conquistador","March 2nd, 2004",9);
        b3.display();
        Book b4=new Book("Stephen Prothero","Religion Matters","2020",90);
        b4.display();
    }
}