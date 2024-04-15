public class Palindrome {
    public static boolean isPalindrome(int x){
        int newNum = 0, numCpy = x;
        while (x > 0){
            newNum = newNum*10 + x %10;
            x /= 10;
       }
        return (newNum == numCpy);
    }
    public static boolean isPalindromeString(int x){
        String num = Integer.toString(x);
        for (int i = 0; i < num.length()/2; i++) {
            if(num.charAt(i) != num.charAt(num.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 121;
        System.out.println(isPalindrome(number)? "True" : "False");
        System.out.println(isPalindromeString(number)? "True" : "False");
    }
}
