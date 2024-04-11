import java.util.Arrays;

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
    public static void main(String[] args){
        int[] nums = new int[]{2,7,11,15};
        int target = 13;
        int[] result;
        result = twoSum(nums,target);
        System.out.println( Arrays.toString(result));
    }
}