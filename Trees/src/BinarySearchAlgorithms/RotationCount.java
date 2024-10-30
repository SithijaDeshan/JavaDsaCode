package BinarySearchAlgorithms;

public class RotationCount {

    public static void main(String[] args) {
        int[] arr = {5,6,7,1,2,3,4};
        System.out.println(CountRotatinos(arr));
    }

    private static int CountRotatinos(int[] arr){
        int piviot = findPivot(arr);
        return piviot + 1;
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }

            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid-1;
            }

            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
