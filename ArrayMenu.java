
public class ArrayMenu {

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
}