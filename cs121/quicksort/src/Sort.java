public class Sort {
    int part(int array[], int low, int high)
    {
        int pivot=array[high];
        int i=(low-1);
        for (int j=low;j<high;j++)
        {
            if(array[j]<=pivot)
            {
                i++;
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }
        int temp=array[i+1];
        array[i+1]=array[high];
        array[high]=temp;
        return i+1;

    }
    void sort(int array[], int low, int high)
    {
        if (low<high)
        {
            int pIndex=part(array,low,high);
            sort(array, low, pIndex-1);
            sort(array, pIndex+1, high);
        }
    }
    static void arrayPrint(int[] array){
        int n= array.length;
        for (int i=0;i<n;++i)
        {
            System.out.println(array[i]+"");
        }
        System.out.println();
    }

}
