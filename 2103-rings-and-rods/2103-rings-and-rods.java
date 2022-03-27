class Solution {
    public int countPoints(String rings) {
        int r[] = new int[10];
        int g[] = new int[10];
        int b[] = new int[10];
        boolean temp[] = new boolean[10];
        int answer = 0;
        int n = 0;
        
        for(int i = 0; i<rings.length()-1; i+=2) {
            n = rings.charAt(i+1) - '0';
            if(rings.charAt(i) == 'R') {
                r[n]++;                
            }else if(rings.charAt(i) == 'G') {
                g[n]++;
            }else if(rings.charAt(i) == 'B') {
                b[n]++;
            }
      
            if(r[n]>0 && g[n]>0 && b[n]>0 && !temp[n]) {
                answer++;
                temp[n] = true;
            }
        }
        return answer;
    }
}
