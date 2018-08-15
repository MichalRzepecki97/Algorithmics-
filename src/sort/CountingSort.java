package sort;

public class CountingSort implements Sort {
    @Override
    public int[] sort(int[] toSort) {
        int max = 0;
        for (int i = 0; i < toSort.length; i++)
            max = toSort[i] > max ? toSort[i] : max;
        int[] CountingTab = new int[max + 1];
        for (int i = 0; i < toSort.length; i++)
            CountingTab[toSort[i]]++;
        int[] result = new int[toSort.length];
        int counter = 0;
        for (int i = 0; i < CountingTab.length; i++) {
           while (CountingTab[i]>0){
               result[counter] =i;
               counter++;
               CountingTab[i]++;
           }
        }
        return result;
    }
}

