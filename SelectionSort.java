public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers ={37,70,2,86,1,48,11,32,12,16,10,23,29,45,7,33,18};
        int size = numbers.length;
        int minIndex= -1;

        System.out.println("Before Sorting ");
        for(int num: numbers)
        System.out.print(num+" ");
        System.out.println();
        System.out.print("Sorting begins");

        for(int i=0; i<size-1; i++){
            minIndex=i;
            for(int j=i+1; j<size; j++){
                if(numbers[j]<numbers[minIndex]){
                    minIndex=j;
                }
        }
            int temp = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            numbers[i] = temp;

            System.out.println();
            for(int num: numbers)
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("Sorting ends");
        System.out.println("After Sorting ");
        for(int num: numbers)
        System.out.print(num+ " ");
    }
}
