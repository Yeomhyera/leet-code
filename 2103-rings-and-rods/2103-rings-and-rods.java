class Solution {
    public int countPoints(String rings) {
        int r[] = new int[10];
        int g[] = new int[10];
        int b[] = new int[10];
        boolean had[] = new boolean[10];
        int answer = 0;
        int num = 0;
        
        for(int i = 0; i<rings.length()-1; i+=2) {
            num = rings.charAt(i+1) - '0';
            if(rings.charAt(i) == 'R') {
                r[num]++;                
            }else if(rings.charAt(i) == 'G') {
                g[num]++;
            }else if(rings.charAt(i) == 'B') {
                b[num]++;
            }
            if(r[num]>0 && g[num]>0 && b[num]>0 && !had[num]) {
                answer++;
                had[num] = true;
            }
        }
        return answer;
    }
}