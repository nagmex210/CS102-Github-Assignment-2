import java.util.Random;

public class ArrayMenu {
    
    public int[] randomIntegers(int arraySize) {
        int numbers[] = new int[arraySize];
        Random rand = new Random();
        for (int i = 0; i < arraySize; i++) {
            numbers[i] = rand.nextInt(0,101);
        }
        return numbers;    
    }
    
    public int findmax(int[] array){
    int max = array[0];
    for (int i = 0; i < array.length; i++) {
        if(array[i]>max){
            max = array[i];
        }
    }
    return max;
    }

    
    public int findmin(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]<min){
                min = array[i];
            }
        }
        return min;
    }


    private void findSumOdd(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i = i + 2) {
            sum += array[i];
        }
        System.out.println("odd sum is : " + sum);
    }

    private void findSumEven(int[] array) {
        int sum = 0;
        for (int i = 1; i < array.length; i = i + 2) {
            sum += array[i];
        }
        System.out.println("even sum is : " + sum);
    }

    
    public static void findDiffFromAverage (int[] array){
        int sum = 0;
        for ( int i = 0; i < array.length; i++ ){
            sum = sum + array[i];
        }
        
        int average = sum / array.length;
        for ( int j = 0; j < array.length; j++ ){
            System.out.print( array[j] - average + ", " );
        }
    }
}
