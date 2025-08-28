package S06_Searching;

public class searchInsertPos {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int low=0, high=n-1;
        if(target > nums[n-1]) return n;

        while(low <= high){
            int mid = low + (high-low)/2;
            if(target == nums[mid]) return mid;
            else if(mid>0 && nums[mid-1] < target && nums[mid] > target)
                return mid;
            else if(target < nums[mid]) high = mid-1;
            else low = mid+1;
        }
        return 0;
    }
}
