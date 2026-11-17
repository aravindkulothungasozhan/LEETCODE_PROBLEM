package MATH;

public class PROBLEM_NO_633 {
    public static void main(String [] args){
        int c = 5;
        System.out.println(JudgeSquareSum(c));
    }

    private static boolean JudgeSquareSum(int c) {
        long left=0;
        long right=(long)Math.sqrt(c);
        while(left<=right){
            long sum=left*left +right*right;
            if(sum==c){
                return true;
            }
            else if(sum<c){
                left++;
            }
            else{
                right--;
            }

        }
        return false;
    }
}
