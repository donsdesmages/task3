import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> stringMap = new HashMap();
        stringMap.put(100,"aaabbcc");
        String string = stringMap.get(100);
        System.out.println(string);
        Character character = string.charAt(0);
        Character character1 = string.charAt(4);
        Character character2 = string.charAt(6);
        int count = 0;
        int count1 = 0;
        int count2 = 0;

        for (int j = 0; j < string.length() ; j++) {      // aaa count 3
            if (string.charAt(0) == string.charAt(j)) {
               count++;
            }
        }
        for (int k = 0; k < string.length() ; k++) {     // bb count 2
            if (string.charAt(3) == string.charAt(k)) {
                count1++;
            }
        }
        for (int i = 0; i < string.length(); i++ ) {     //  cc  count 2
            if (string.charAt(6) == string.charAt(i)) {
                count2++;
            }
        }
        System.out.println(character + "-" + count);
        System.out.println(character1 + "-" + count1);
        System.out.println(character2 + "-" + count2);
    }
}
