public class Main {

    public static void main(String[] args) {

        int[] arr = {23, 45, 1, 2, 8, 19, -3, -11, 28};
        int target = 19;

        System.out.println(linearSearch2(arr,target));

    }

    //search in the array: return if item found/ return -1 if not
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for(int index = 0; index < arr.length; index++ ){

            int element = arr[index];
            if(element == target){
                return index;
            }

        }

        return -1;
    }

    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for(int element : arr){
            if(element == target){
                return element;
            }
        }

        return -1;
    }

}