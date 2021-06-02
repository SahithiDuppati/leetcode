class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        
        while(!set.contains(n)){
            set.add(n);
            n = sum(n);
            
            if(n == 1){
                return true;
            }
        }
        return false;
    }
    
    public int sum(int n){
        int sum = 0;
        while(n > 0){
            sum = sum + (n%10)*(n%10);
            n = n / 10;
        }
        return sum;
    }
}
