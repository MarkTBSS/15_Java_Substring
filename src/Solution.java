import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String mockInput = "Helloworld\n" +
                            "3 7";
        Scanner in = new Scanner(mockInput);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        in.close();
        System.out.println(S);
        System.out.println(start);
        System.out.println(end);

        String subS = S.substring(start, end);
        System.out.println(subS);
    }
}
