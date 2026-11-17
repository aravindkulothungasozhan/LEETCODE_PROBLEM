package ARRAY;

import java.util.HashMap;
import java.util.Map;

public class PROBLEM_NO_1679 {
    public static void main(String [] args){
        int[] nums = new int[]{1, 2, 3, 4};
        int k = 5;
        System.out.println(MaxOperation(nums,k));
        System.out.println(MaxOperation_01(nums,k));
    }

    private static int MaxOperation(int[] nums, int k) {
        int count=0;
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int sum=nums[left]+nums[right];
            if(sum==k){
                count++;
                left++;
                right--;
            }
            else if(sum<k){
                left++;
            }
            else{
                right--;
            }

        }
        return count;
    }

    public static int MaxOperation_01 (int [] nums, int k){


                Map<Integer, Integer> freq = new HashMap<>();
                int count = 0;
                for (int x : nums) {
                    int need = k - x;
                    if (freq.getOrDefault(need, 0) > 0) {
                        count++;
                        freq.put(need, freq.get(need) - 1);   // use up the partner
                    } else {
                        freq.put(x, freq.getOrDefault(x, 0) + 1);
                    }
                }
                return count;
            }
        }





