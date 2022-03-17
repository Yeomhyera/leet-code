class Solution {
    public int countKDifference(int[] nums, int k) {
        int answer=0;
        for(int i=0;i< nums.length;i++){
            int temp=nums[i];
            for(int j=0;j<nums.length;j++){
                if(temp-nums[j]==k){
                    answer++;
                }
            }
        }
        return answer;
    }
}