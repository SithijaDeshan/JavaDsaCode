package BinarySearchAlgorithms;

public class OrderAgnosticBinarySearch {

    public static void main(String[] args) {
        int[] arr = {1,2,2,6,9,13,24,36,44,58,69};
        int target = 36;
        System.out.println(orderAgnosticBinarySearch(arr,target));
    }

    static int orderAgnosticBinarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        //find whether the array is sorted in ascending order or descending
        boolean isAsc = arr[start] < arr[end];



        while (start <= end){
            int mid = start + (end - start) / 2;

            if(target == arr[mid]){
                return mid;
            }

            if(isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else{
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;

    }
}
