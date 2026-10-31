package STRING;

public class PROBLEM_NO_345 {
    public static void main(String [] args){
        String s ="Hello aravind how are you ";
        System.out.println(Reverse_Vowels(s));
    }
    public static String Reverse_Vowels(String s){
        char [] ch= s.toCharArray();
        int left =0;
        int right=ch.length-1;
        while(left<right){
            while(left<right && !isVowel(ch[left])){
                left++;

            }
            while(left<right && !isVowel(ch[right])){
                right--;
            }
            if(left<right){
                char temp = ch[left];
                ch[left]=ch[right];
                ch[right]=temp;
                left++;
                right--;
            }
        }
        return new String(ch);
    }
    private static boolean isVowel(char c){
        return c=='a'|| c=='e'|| c=='i'|| c=='o'||c=='u'||
                c=='A'|| c=='E'|| c=='I'|| c=='O'||c=='U';
    }

}
