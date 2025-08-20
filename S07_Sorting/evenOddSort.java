import java.util.Arrays;
import java.util.Comparator;

public class evenOddSort {
    public static void main(String[] args) {
        int[] nums = {33, 24, 3, 5,2};
        sortArrayByParity(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static int[] sortArrayByParity(int[] nums) {
        // Convert int[] -> Integer[]
        Integer[] arr = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }

        // Sort using custom comparator
        Arrays.sort(arr, new MyCmp());

        // Convert back Integer[] -> int[]
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }

        return nums;
    }
}
class MyCmp implements Comparator<Integer>{
    public int compare(Integer a, Integer b){
        return (a%2 -b%2);
    }
}