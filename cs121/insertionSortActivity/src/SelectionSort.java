import java.util.Scanner;

public class SelectionSort
    {
       public void iSort(int [] array)
       {
           Scanner console= new Scanner(System.in);
           int [] numbers= {7,4,11,9,8,1};
           int n= array.length;
           for (int i=0;i<n-1;i++)
           {
               int min=i;
               for (int j=i+1;j<n;j++)
               {
                   if (array[j] < array[min])
                       min = j;
               }
           }

           }
    }
