package ARRAY;

import java.util.Arrays;
public class PROBLEM_NO_881 {
    public static void main(String [] args){
        int[] people = new int[]{3, 2, 2, 1};
        int limit = 3;

        System.out.println(NumRescueBoats(people,limit));
    }

    private static int NumRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count=0;
        int left=0;
        int right=people.length-1;
        while(left<=right){
            if(people[left]+people[right]<=limit){
                left++;
            }
            right--;
            count++;
        }
        return count;
    }



}
