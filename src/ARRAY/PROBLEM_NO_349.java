package ARRAY;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class PROBLEM_NO_349 {
    public static void main(String [] args){
        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2};

        int[] arr1 = new int[]{4, 9, 5};
        int[] arr2 = new int[]{9, 4, 9, 8, 4};

        System.out.println(Arrays.toString(result(nums1,nums2)));
        System.out.println(Arrays.toString(result(arr1,arr2)));
    }

    public static int[] result(int[] nums1, int[] nums2) {

        Set<Integer> set= new HashSet<>();
        for(int arr:nums1){
            set.add(arr);
        }

        Set<Integer>Intersection = new HashSet<>();
        for(int arr:nums2){
            if(set.contains(arr)){
                Intersection.add(arr);
            }
        }
        int [] result = new int[Intersection.size()];
        int index=0;
        for(int arr:Intersection){
            result[index]=arr;
            index++;
        }
        return result;
    }

}
