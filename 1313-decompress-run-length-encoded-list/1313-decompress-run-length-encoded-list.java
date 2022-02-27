class Solution {
    public int[] decompressRLElist(int[] nums) {
        int temp=0;
        for(int i=0;i<nums.length;i+=2){
            temp+=nums[i];
        }

        int answer[]=new int[temp];
        int tmp=0;
        for(int i=1;i<nums.length;i=i+2){
            for(int j=0;j<nums[i-1];j++){
                answer[tmp]=nums[i];
                tmp++;
            }
        }
        return answer;
    } 
}