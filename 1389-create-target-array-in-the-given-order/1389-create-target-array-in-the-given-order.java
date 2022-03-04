import java.util.Vector;
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> temp=new ArrayList<Integer>(nums.length);
        int[] answer= new int[nums.length];

        for(int i=0;i< nums.length;i++) {
            temp.add(index[i], nums[i]);
        }
        for(int i=0;i< nums.length;i++) {
            answer[i]=temp.get(i);
        }
        return answer;
    }
}