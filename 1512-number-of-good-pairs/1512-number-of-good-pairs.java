class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        for(int i=0; i<nums.length;i++){
            int temp=nums[i];
            for(int j=0;j< nums.length;j++){
                if(temp==nums[j]&&i<j){
                    count++;
                }
            }
        }
        return count;
    }
}