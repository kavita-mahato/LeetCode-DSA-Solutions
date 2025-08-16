package S06_Searching;

public class minInRotated {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            
            // If mid element > last element, min is on right side
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                // Min is on left side (including mid)
                high = mid;
            }
        }
        
        // Now low == high, pointing to minimum
        return nums[low];
    }
}
