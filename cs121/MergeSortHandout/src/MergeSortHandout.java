public class MergeSortHandout {
    void merger(int[] array, int left, int mid, int right) {
        int b1 = mid - left + 1;
        int b2 = right - mid;
        int L[] = new int[b1];
        int R[] = new int[b2];
        for (int i = 0; i < b1; ++i) {
            L[i] = array[left + i];
        }

        for (int j = 0; j < b2; ++j) {
            R[j] = array[mid + 1 + j];
        }
        int i = 0, j = 0;
        int s = left;
        while (i < b1 && j < b2) {
            if (L[i] <= R[j]) {
                array[s] = L[i];
                i++;
            } else
            {
                array[s] = R[j];
                j++;
            }
            s++;
        }

        while (i < b1) {
            array[s] = L[i];
            i++;
            s++;
        }
        while (j < b2) {
            array[s] = R[j];
            j++;
            s++;
        }

    }

    void sort(int[] array, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            sort(array, left, mid);
            sort(array, mid + 1, right);
            merger(array, left, mid, right);
        }
    }
}







