

public class Sorting {

    public static void bubSort(String[]arr,int n)
    {
        String temp;
        for (int h=0;h<n-1;h++)
        {
            for (int i=h+1;i<n;i++) {
                if(arr[h].compareTo(arr[i])>0) {
                    temp=arr[h];
                    arr[h]=arr[i];
                    arr[i]=temp;
                }
            }
        }
    }

}