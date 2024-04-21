public class RmvElement {
    public static int removeElement(int[] nums, int val){
        int slow = 0;
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if(nums[i]!= val){
                nums[slow] = nums[i];
                slow++;
            }
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int k = removeElement(nums,val);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
