public class Quicksort {

    public int[] quickSort(int E[], int left, int right){
        if(left < right){
            int i = partition(E, left, right);
            E = quickSort(E, left, i-1);
            E = quickSort(E, i+1, right);

        }
        return E;
    }

    int partition(int E[], int left, int right){
        int ppos = right, pivot = E[ppos];
        while(true){

            for(int t:E){
                System.out.print(t + " " );
            }
            System.out.println("Pivot: "+pivot);

            while (left < right && E[left] < pivot) left++;

            while (left < right && E[right] >= pivot) right--;

            if(left >= right){
                break;
            }
            E = swap(E, left, right);
        }
        E = swap(E, left, ppos);
        return left;
    }

    int[] swap(int E[], int left, int right){
        int temp = E[left];
        E[left] = E[right];
        E[right] = temp;

        return E;
    }

}
