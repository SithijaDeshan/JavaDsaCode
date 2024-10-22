public class MaxWealth {

    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 2, 2}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts){
        int earlyMaxSum = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int totalSum = 0;
            for (int i : account) {
                totalSum += i;
            }
            if (totalSum > earlyMaxSum) {
                earlyMaxSum = totalSum;
            }
        }
        return earlyMaxSum;
    }
}
