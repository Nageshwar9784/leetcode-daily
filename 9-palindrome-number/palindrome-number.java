class Solution {
    int reverse(int x){
        int number=x;
        int reverseNo= 0;
        while(number !=0){
            int remender = number%10;
            reverseNo = reverseNo *10 +remender ;
            number = number /10 ;
        }
        return reverseNo;

    }
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        else if (x == reverse(x)){
            return true;
        }else{
            return false;
        }
        
    }
}