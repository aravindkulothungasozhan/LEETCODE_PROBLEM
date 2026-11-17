package ARRAY;

import java.util.HashSet;
import java.util.Set;

public class PROBLEM_NO_217 {
    public static void main(String []args){
        int[] nums1 = new int[]{1, 2, 3, 1};
        int[] nums2= new int[]{1, 2, 3, 4};
        int[] nums3 = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        System.out.println(ContainsDuplicate_02(nums3));
    }
    public static Boolean ContainsDuplicate_01(int [] nums){
        Set<Integer> set= new HashSet<>();
        for(int arr:nums){
            set.add(arr);
        }
        return (set.size() != nums.length)? true:false;
    }


    public static Boolean ContainsDuplicate_02(int [] nums){
        Set <Integer> set = new HashSet<>();
        for(int arr:nums){
            if(set.contains(arr))
                return true;
            set.add(arr);

        }
        return false;
    }

}
