package BinarySearchAlgorithms;

public class BinarySerachAlgo {

    public static void main(String[] args) {
        int[] arr = {1,2,6,9,13,24,36,44,58,69};
        int target = 36;
        System.out.println(binarySearch(arr,target));

    }

    //return the index
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
                //answer found
                return mid;
            }
        }
        return -1;
    }
}
