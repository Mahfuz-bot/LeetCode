import java.util.HashMap;
import java.util.Map;

public class Roman2Integer {
    public static int romanToInt(String s){
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int currentValue = romanValues.get(currentChar);
            if (currentValue > prevValue) {
                result += currentValue - 2 * prevValue;
            } else {
                result += currentValue;
            }
            prevValue = currentValue;
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "LIX";
        int num = romanToInt(s);
        System.out.println("num = " + num);
    }
}
