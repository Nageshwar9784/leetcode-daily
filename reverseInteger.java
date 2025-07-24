class Solution {
    public int reverse(int x) {
        long y=0;
        while(x!=0){      
            y=(y*10)+x%10;
            x/=10;
        }
      if(y <= Integer.MIN_VALUE || y >= Integer.MAX_VALUE)
			return 0;
		else
			return (int)y;
    }
}