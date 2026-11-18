package STRING;

import java.util.HashMap;
import java.util.Map;

public class PROBLEM_NO_242 {
    public static void main(String [] args){
        String t1="anagram";
        String t2="nagaram";
        System.out.println(Anagram(t1,t2));

    }
    public static boolean Anagram(String s,String t){
        if(s.length() != t.length()){
            return false;
        }
        Map<Character,Integer> m1= new HashMap<>();
        Map<Character,Integer> m2= new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            m1.put(ch, m1.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            m2.put(ch, m2.getOrDefault(ch,0)+1);
        }
        return m1.equals(m2);
    }
}
