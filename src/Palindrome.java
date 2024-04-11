public class Palindrome {
    public static boolean isPalindrome(int x){
        int newNum = 0, numCpy = x;
        while (x > 0){
            newNum = newNum*10 + x %10;
            x /= 10;
       }
        return (newNum == numCpy);
    }
    public static void main(String[] args) {
        int number = 121;
        System.out.println(isPalindrome(number)? "True" : "False");
    }
}
