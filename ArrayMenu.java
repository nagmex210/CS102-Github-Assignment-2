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
public class ArrayMenu {

}
