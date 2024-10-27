package BinarySearchAlgorithms;

public class SearchtargetInInfiniteArray {

    public static void main(String[] args) {

        int[] arr = {3,4,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(findingRange(arr,target));
    }

    static int findingRange(int[] arr, int target){
        //first find the range
        //start with the box of size 2
        int start = 0;
        int end  = 1;

        //condition
        while(target > arr[end]){
            int temp = end + 1;

            //double the box value
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        return binarySearch(arr,target,start,end);

    }

    static int binarySearch(int[] arr,int target, int start, int end){

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
