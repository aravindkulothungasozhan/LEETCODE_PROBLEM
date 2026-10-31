package SORTING;

import java.util.Arrays;

public class PROBLEM_NO_215 {
    public static void main(String [] args){
        int [] nums1={3,2,1,5,6,4};
        int k1=2;

        int []nums2={3,2,3,1,2,4,5,5,6};
        int k2=4;

        System.out.println(Find_Kth_Largest(nums1,k1));
        System.out.println(Find_Kth_Largest(nums2,k2));
    }

    public static int Find_Kth_Largest(int []nums,int k){
        Insertion_Sort(nums);
        return (nums[nums.length-k]);
    }

    public static int []Bubble_Sort(int [] nums){
        for(int i=0;i<nums.length-1;i++){
            for(int j = 0; j <nums.length-1- i; j++){
                if(nums[j]>nums[j+1]){
                        int temp= nums[j];
                        nums[j]=nums[j+1];
                        nums[j+1]=temp;
                }
            }
        }
        return nums;
    }

    public static int [] Selection_Sort(int []nums){
        for(int i=0;i<nums.length;i++){
            int index=i;
            for(int j=i+1;j< nums.length;j++){
                if(nums[j]<nums[index]){
                    index=j;
                }
            }
            int temp=nums[index];
            nums[index]=nums[i];
            nums[i]=temp;
        }
        return nums;
    }

    public static int[] Insertion_Sort(int []nums){
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(nums[j-1]>nums[j]){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }
                else{
                    break;
                }
            }
        }
        return nums;
    }
}
