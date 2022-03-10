class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int number = 0;
        int answer = 0;
        if (ruleKey.equals("type")){
            number = 0;
        }else  if (ruleKey.equals("color")){
            number = 1;
        }else if (ruleKey.equals("name")){
            number = 2;
        }
        
        for (int i = 0; i < items.size(); i++){
            if(items.get(i).get(number).equals(ruleValue)){
                answer++;
            }
        }
        return answer;
    }
}