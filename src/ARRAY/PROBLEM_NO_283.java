package ARRAY;
import java.util.Arrays;
public class PROBLEM_NO_283 {
    public static void main(String [] args){
        int [] nums1 ={0,1,0,3,12};
        int [] nums2={0};
       // Move_Zero(nums2);
        Move_Zero(nums1);
        System.out.println(Arrays.toString(nums1));
        //System.out.println(Arrays.toString(nums2));
    }
    public static  void Move_Zero(int [] nums){
        int i=0;
        int j=0;
        while(j<nums.length){
            if(nums[j] !=0){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                j++;
                i++;
            }
            else{
                j++;
            }

        }


    }
}
