class InsertionSort {
    public static void main(String[] args) {
        int[] arr ={37,70,2,86,1,48,11,32,12,16,10,23,29,45,7,33,18};

        for(int i=0;i<arr.length;i++){
            int key = arr[i];
            int j=i-1;
            
            while (j>=0 && arr[j]>key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]= key;
            System.out.println();
            for(int num: arr)
            System.out.print(num+" ");
        }
    }
}