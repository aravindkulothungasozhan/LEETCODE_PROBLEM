package SORTING;

public class PROBLEM_NO_334 {
    public static void main(String[] args) {
        int []nums={2,1,5,0,4,6};

        System.out.println(increasingTriplet(nums));
    }

    public static  boolean increasingTriplet(int[] nums) {
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;

        for(int arr:nums){
            if(arr<=first){
                first=arr;
            }
            else if(arr<=second){
                second=arr;
            }
            else{
                return true;
            }
        }
        return false;



    }
}
