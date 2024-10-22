public class EvenDigits {

    public static void main(String[] args) {
        int[] nums = {-18, 124, 9, 1764, 98, 10, 0};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums){
        int count = 0;

        for(int num : nums){
            if(even(num)){
                count++;
            }
        }

        return count;
    }

    private static boolean even(int num) {
        int count = 0;

        if(num < 0){
            num = num * -1;
        }

        if(num == 0){
            return true;
        }
//
//        while (num > 0){
//            count++;
//            num = num / 10;
//        }
        count = (int)(Math.log10(num)) + 1;

        return count % 2 == 0;
    }

}
