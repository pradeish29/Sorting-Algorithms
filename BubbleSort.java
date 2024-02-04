public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers ={37,70,2,86,1,48,11,32,12,16,10,23,29,45,7,33,18};
        int size = numbers.length;

        System.out.println("Before Sorting ");
        for(int num: numbers)
        System.out.print(num+" ");
        System.out.println();
        System.out.print("Sorting begins");

        for(int i=0; i<size; i++){

            for(int j=0; j<size-i-1; j++){
                if(numbers[j]>numbers[j+1]){
                int temp = numbers[j+1];
                numbers[j+1] = numbers[j];
                numbers[j] = temp;
                }
        }
            System.out.println();
            for(int num: numbers)
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("Sorting ends");
        System.out.println("After Sorting ");
        for(int num: numbers)
        System.out.print(num+ " ");
        //hhkk
    }
}
