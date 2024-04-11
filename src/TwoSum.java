import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] demo = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j] == target){
                    demo[0] = i;
                    demo[1] = j;
                    return demo;
                }
            }
        }
        return new int[0];
    }

    /**
     * better than previous version, it takes O(n)
     * @param nums number of arrays
     * @param target sum of two value to match
     * @return an array
     */
    public static int[] twoSumBetter(int[] nums, int target){
        Map<Integer,Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(seen.containsKey(complement)){
                return new int[]{seen.get(complement),i};
            }
            seen.put(nums[i], i);

        }

        return new int[0];
    }

    public static void main(String[] args){
        int[] nums = new int[]{2,7,11,15};
        int target = 13;
        int[] result;
//        result = twoSum(nums,target);
        result = twoSumBetter(nums,target);
        System.out.println( Arrays.toString(result));
    }
}