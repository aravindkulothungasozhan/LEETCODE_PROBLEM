package ARRAY;

import java.util.Arrays;
import java.util.HashMap;

public class PROBLEM_NO_01 {
    public static void main(String [] args){
        int [] nums1={2,7,11,15};
        int target1=9;

        int [] nums2={3,2,4};
        int target2=6;

        int [] nums3={3,3};
        int target3=6;

        System.out.println(Arrays.toString(Two_Sum_Approach_01(nums1,target1)));
        System.out.println(Arrays.toString(Two_Sum_Approach_02(nums1,target1)));
        System.out.println(Arrays.toString(Two_Sum_Approach_02(nums3,target3)));
    }

    // using two for loop to find it target and it's Time_Complexity=O(n2)
    public static int []Two_Sum_Approach_01(int []nums, int target){
        for(int i=0;i< nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int []{i,j};
                }
            }
        }
        return new int []{};
    }

    // Using HashMap to solve these problem by (target-nums[i]) search in hashmap if found return it and Time_Complexity=O(n)
    public static int [] Two_Sum_Approach_02(int []nums,int target){
        HashMap<Integer,Integer> result= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(result.containsKey(complement)){
                return new int[]{result.get(complement),i};
            }
            result.put(nums[i],i);
        }
        return new int[]{};
    }
}
