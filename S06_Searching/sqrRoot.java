package S06_Searching;

public class sqrRoot {
    public int mySqrt(int x) {
        if(x < 2) return x;
        int left = 1, right = x/2;
        int sqrRoot = 0;
        while(left <= right){
            int mid = left + (right - left)/2;
            long sqr = (long) mid*mid ;
            if(sqr == x) return mid;
            else if(sqr < x) {
                sqrRoot = mid;
                left = mid+1;
            }
            else right = mid-1;
        }
        return sqrRoot;
    }
}
