class Solution {
    public int findNumbers(int[] nums) {
        int result = 0;
        
        for(int x : nums){
            String temp = Integer.toString(x);
            System.out.println(temp.length());
            if(temp.length() % 2 == 0){
                result++;
            }
        }
    
        return result;        
    }
}