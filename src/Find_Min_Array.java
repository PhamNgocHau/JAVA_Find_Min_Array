public class Find_Min_Array {
    public static int minValue(int [] array){
        int min = array[0];
        int index = 0;
        for (int i = 0; i < array.length ; i++){
            if (array[i] < min){
                min = array[i];
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int [] arr = {10,2,3,4,5,6,7,8};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is:" + arr[index]);
    }
}
