public class lSDemo
{
    public static int LinearSearch(int key, int[] array){
        int count=0;
        for(int i=0;i<array.length;i++) {
            if (key == array[i]) {
                return i;
            }
        }
        return -1;
        }
    }




