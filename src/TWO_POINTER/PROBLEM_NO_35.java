package TWO_POINTER;

public class PROBLEM_NO_35 {
    public static void main(String [] args){
        int[] nums = new int[]{1, 3, 5, 6};
        int target = 5;

        System.out.println(SearchInsert(nums,target));
    }
    public static int  SearchInsert(int [] nums,int target){
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return i;
    }
}
