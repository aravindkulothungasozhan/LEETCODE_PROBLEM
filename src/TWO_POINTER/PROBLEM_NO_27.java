package TWO_POINTER;

public class PROBLEM_NO_27 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{3, 2, 2, 3};
        int val1 = 3;

        int[] nums2 = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;

        System.out.println(RemoveElement(nums1,val1));
        System.out.println(RemoveElement(nums2,val2));
    }
    public static int RemoveElement(int [] nums, int val){
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}
