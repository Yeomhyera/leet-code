class Solution {
    public List<String> cellsInRange(String s) {
        List<String> answer = new ArrayList<>();
        
        int start_n = Integer.parseInt(String.valueOf(s.charAt(1)));
        int end_n = Integer.parseInt(String.valueOf(s.charAt(s.length()-1)));
        int start_c  = (int)s.charAt(0);
        int end_c = (int)s.charAt(3);
        
        for(int i=start_c; i<=end_c; i++){
            char eng = (char) i;
            for(int j=start_n; j<=end_n; j++){
                String temp = eng+""+j;
                answer.add(temp);
            }
        }
        return answer;
    }
}