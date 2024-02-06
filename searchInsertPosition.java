class searchInsertPosition {

    public static void main(String[] args) {

	int[] nums = {1,2,5,6};
	System.out.println(searchInsert(nums, 3));
    }

    public static int searchInsert(int[] nums, int target) {
        int i;
        for(i=0;i<nums.length;i++) {
            if(nums[i] == target)
            {
                return i;
            }
            if(nums[i] > target)
            {
                return i;
            }
        }
        return i;
    }
}