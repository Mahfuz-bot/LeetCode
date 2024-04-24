import java.util.Arrays;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
    }

    digits = new int[digits.length + 1];
    digits[0] = 1;
    return digits;
}
//https://leetcode.com/problems/plus-one/description/
    // due to wrong understanding the problem following code was written
//    public static int[] newPlusOne(int[] nums){
//        LinkedList<Integer> array = new LinkedList<>();
//        int count = 0, i =0;
//        int size = nums.length;
//        while (i < size) {
//            int num = nums[i];
//            if(num == 0) {
//                array.add(1);
//            }
//            if (num == 9) {
//                if (count == 0){
//                    array.add(1);
//                }
//                count++;
//            }
//            while (count != 0) {
//                for (int j = 0; j < count; j++) {
//                    array.add(0);
//                }
//                count = 0;
//            }
//            if(num!=9) array.add(num);
//            i++;
//        }
//        if(array.getLast()!=0){
//            int t = array.getLast();
//            array.removeLast();
//            array.add(t+1);
//        }
//        int k = 0;
//        int[] newArr = new int[array.size()];
//        for (Integer integer : array) {
//            newArr[k++] = integer;
//        }
//        return newArr;
//    }


    public static void main(String[] args) {
        int[] digits = {0,4,9};
        int[] newArr = plusOne(digits);
        System.out.println(Arrays.toString(newArr));
    }

}
