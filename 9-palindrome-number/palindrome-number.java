class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int number = x ;
        int reverseNo = 0;
         while(number != 0){
           
            reverseNo = (reverseNo *10) + (number%10) ;
            number = number /10 ;
        }
        if(reverseNo == x){
            return true;
        }else{
            return false;
        }
        
    }
}