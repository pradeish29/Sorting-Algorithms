public class QuickSort {

    private static void quickSort(int[] arr, int low, int high) {
        if (low<high) {

            int pivot= partiton(arr,low,high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }
    }

    private static int partiton(int[] arr, int low, int high) {
        int pivot= arr[high];
        int i= low-1;
        for (int j=low;j<high;j++) {
            if (arr[j]< pivot) {
                i++;
                int temp= arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp= arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;

        return i+1;
    }

    public static void main(String[] args) {
        int[] arr ={37,70,2,86,1,48,11,32,12,16,10,23,29,45,7,33,18};
        quickSort(arr,0,arr.length-1);

        for(int num: arr)
        System.out.print(num+" ");
    }
}
