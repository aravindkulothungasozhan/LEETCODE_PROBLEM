package STRING;

public class PROBLEM_NO_151 {
    public static void main(String[] args) {
        String s = "Java is a programming language";
        StringBuilder answer = new StringBuilder();

        String[] str = s.trim().split("\\s+");

        for (int i = str.length - 1; i > 0; i--) {
            answer.append(str[i]).append(" ");
        }
        answer.append(str[0]);

        System.out.println(answer.toString());
    }
}