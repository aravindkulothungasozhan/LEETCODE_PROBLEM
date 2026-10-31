package EUCLIDEAN_ALGORITHM;

public class PROBLEM_NO_1250 {
    public static void main(String [] args){
        int [] nums1={12,5,7,23};
        int [] nums2={29,6,10};
        int [] nums3={3,6};

        System.out.println(Good_Array(nums1));
        System.out.println(Good_Array(nums2));
        System.out.println(Good_Array(nums3));
    }
    public static boolean Good_Array(int [] nums){
        int result=nums[0];
        for(int i=0;i<nums.length;i++){
            result=GCD(result,nums[i]);
        }
        if(result==1){
            return true;
        }
        else {return false;}
    }
    public static int GCD(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
