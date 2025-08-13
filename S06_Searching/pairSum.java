package S06_Searching;
public class pairSum {
    public int[] twoSum(int[] numbers, int target) { 
        int n = numbers.length;
        int left=0, right=n-1;
        int[] pair = {-1, -1};
        while(left < right){
            int pairSum = numbers[left] + numbers[right];
            if(pairSum == target){
                pair[0] = left + 1;
                pair[1] = right + 1;
                return pair;
            }
            else if(pairSum > target) right--;
            else left++;
        }
        return pair;
    }
}
