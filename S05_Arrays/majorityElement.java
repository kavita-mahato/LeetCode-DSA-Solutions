package S05_Arrays;

public class majorityElement {
    public int maxOcc(int[] nums) {
        int count = 0;
        int element = 0;

        for (int num : nums) {
            if (count == 0) {
                element = num;
            }
            count += (num == element) ? 1 : -1;
        }
        return element;
    }
}
