
public class BigO {
    public void printOnce(String z)
    {
        System.out.println(z);
    }
    public void printNTimes(int n)
    {

        for (int i=0;i<n;i++)
        {
            System.out.println("I: "+i);
        }


    }

    public void printNSquaredTimes(int n)
    {
        for(int i=0; i<n;i++) {
            for (int j=0; j<n; j++) {
                System.out.println("I: "+i);
                System.out.println("J: "+j);
            }
        }
    }
}

