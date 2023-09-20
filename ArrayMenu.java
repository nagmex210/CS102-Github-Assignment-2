import java.util.Random;
import java.util.Scanner;
public class ArrayMenu {
    
    public int[] randomIntegers() {
        int numbers[] = new int[5];
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
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

        public void printDisplayMenu(){
        Scanner input = new Scanner(System.in);
        int choice = 1;
        while(choice!=5){
        System.out.println("1.Find the minimum of the array \n2.Find minimum of the array \n3.Find the average of the array \n4.Find the sum of elements with an odd \n5.Find the sum of elements with an evem \n6.Exit \nPick an option: " );
        choice = input.nextInt();
            if(choice == 1){
                System.out.println(findmin(randomIntegers()));
            }
            else if(choice == 2){
                System.out.println(findmax(randomIntegers()));
            }
            else if(choice == 3){
                findDiffFromAverage(randomIntegers());
            }
            else if(choice == 4){
                findSumOdd(randomIntegers());
            }
            else if(choice == 5){
                findSumEven(randomIntegers());
            }
            else if(choice == 6){
                System.out.println("Exiting the program");
                break;
            }
        }
        
    }
    public static void main(String[] args) {
        ArrayMenu a1 = new ArrayMenu();
        a1.printDisplayMenu();
    }
}
