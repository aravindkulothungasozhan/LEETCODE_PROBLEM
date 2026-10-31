package ARRAY;

import java.util.Arrays;

public class PROBLEM_NO_04 {
    public static void main(String [] args){
        int []nums1={1,3}; int []nums2={2};
        int [] res1={1,2}; int []res2={3,4};

        System.out.println(Median_Two_Sorted_Array(nums1,nums2));
        System.out.println(Median_Two_Sorted_Array(res1,res2));
    }
    public static double Median_Two_Sorted_Array(int []nums1,int []nums2){
        int [] result= new int[nums1.length+ nums2.length];
        int i=0,j=0,k=0;
        while(i< nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                result[k]=nums1[i];
                i++;
            }
            else{
                result[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<nums1.length){
            result[k]=nums1[i];
            i++;
            k++;
        }
        while(j<nums2.length){
            result[k]=nums2[j];
            j++;
            k++;
        }
        return Median(result);
    }
    public static double Median(int [] result){
        int n= result.length;
        int average=0;
        for(int i=0;i< result.length;i++) {
            average =average+result[i];
        }
        double Median=(double)average/n;
        return Median;
    }
}
