public class ComputerTest {
    public static void main (String [] args)
    {
        Computer c1= new Computer ("MacBook Pro", "Apple", "16 GB", 2018);
        c1.display();
        Computer c2= new Computer ("Blade 16", "Razer", "32 GB", 2019);
        c2.display();
        Headphones h1= new Headphones ("Beats",2019,"SoundPlus","Wired");
        h1.display();
        Headphones h2= new Headphones ("TEST",2010,"TestProduct","Wired");
        h2.display();


    }
}
