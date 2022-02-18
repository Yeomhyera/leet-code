class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list_candy = new ArrayList<>();
        int max = 0;

        for(int i=0; i< candies.length;i++){
            if(max<candies[i]){
                max=candies[i];
            }
        }
        for(int i=0;i<candies.length;i++) {
            int candy = candies[i] + extraCandies;
            
            if(candy >= max){
                list_candy.add(true);
            }
            else{
                list_candy.add(false);
            }
        }
        return list_candy;
    }
}