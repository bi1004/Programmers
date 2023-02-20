class Solution {
    public int solution(int n, int k) {
        int answer = 0; 
        
        int a = 12000;
        int b = 2000;
        int c = (n/10)*2000; //서비스 
        
        answer = (a*n)+(b*k)-c;
        
        return answer;
    }
}