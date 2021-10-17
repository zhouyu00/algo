package leetcodeEveryDay.Year2020;

public class Day20200327_leetcode1601 {
    public static int[] swapNumbers(int[] numbers) {
        numbers[0]=numbers[0]^numbers[1];
        numbers[1]=numbers[0]^numbers[1];
        numbers[0]=numbers[0]^numbers[1];
        return numbers;
    }

    public static void main(String[] args) {
        int[] numbers= new int[]{1,2};
        swapNumbers(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }
}
