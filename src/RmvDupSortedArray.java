public class RmvDupSortedArray {

    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,2,2,3,4,4};
        int k =removeDuplicates(nums);
        System.out.println("k = " + k);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i]+" ");
        }

    }

    private static int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int index = 1;
        for (int i = 1; i < nums.length ; i++) {
            if(nums[i] != nums[i-1]){
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
