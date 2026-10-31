package ARRAY;

public class PROBLEM_NO_268 {
    public static void main(String [] args){
        int [] nums1={3,0,1};
        int [] nums2={9,6,4,2,3,5,7,0,1};
        int [] nums3={0,1};

        System.out.println(Missing_Number_Approach_01(nums1));
        System.out.println(Missing_Number_Approach_02(nums2));
        System.out.println(Missing_Number_Approach_02(nums3));

    }

    // these method is the most optical approach to solve the problem
    public static int Missing_Number_Approach_01(int [] nums){
        int n=nums.length;
        int ExceptedSum=n*(n+1)/2;
        int AverageSum=0;
        for(int arr:nums){
            AverageSum+=arr;
        }
        return ExceptedSum-AverageSum;
    }

    public static int Missing_Number_Approach_02(int [] nums){
        Selection_Sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return nums.length;
    }


    public static int [] Bubble_Sort(int [] nums){
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j< nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp =nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums;
    }

    public static int [] Selection_Sort(int [] nums){
        for(int i=0;i< nums.length;i++){
            int index=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[index]){
                    index=j;
                }
            }
            int temp=nums[i];
            nums[i]=nums[index];
            nums[index]=temp;
        }
        return nums;
    }

    public static int [] Insertion_Sort(int [] nums){
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
