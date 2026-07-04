class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        if(nums.length < 2){
            return false;
        }

        int temp = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(temp == nums[i]){
                return true;
            }else{
                temp = nums[i];
                continue;
            }
        }
        return false;
    }
}