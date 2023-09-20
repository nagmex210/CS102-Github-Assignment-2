
public class ArrayMenu {
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
}