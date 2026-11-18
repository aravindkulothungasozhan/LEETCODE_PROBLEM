package ARRAY;

import java.util.HashMap;
import java.util.Map;

public class PROBLEM_NO_1512 {
    public static void main(String[] args){
        int[] nums_01 = new int[]{1, 2, 3, 1, 1, 3};
        int[] nums_02 = new int[]{1, 1, 1, 1};

        System.out.println(numIdenticalPairs(nums_01));
        System.out.println(numIdenticalPairs_hashmap(nums_02));
    }
    public static int numIdenticalPairs(int [] nums){
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }
        return count;
    }

    public static int numIdenticalPairs_hashmap(int [] nums){
        int goodpairs=0;
        Map<Integer,Integer> map= new HashMap<>();
        for(int num:nums){
            int count=map.getOrDefault(num,0);
            goodpairs+=count;
            map.put(num,count+1);
        }
        return goodpairs;
    }
}
