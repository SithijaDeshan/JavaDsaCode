package BinarySearchAlgorithms;

public class CeilingNumber {

    // Ceiling Number : Smallest element in the array that greater or equal to the target element

    public static void main(String[] args) {
        int[] arr = {1,2,6,9,13,24,36,42,44,58,69};
        int target = 43;
        System.out.println(binarySearch(arr,target));
    }

    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return arr[mid];
            }
        }
        return arr[start];
    }
}
