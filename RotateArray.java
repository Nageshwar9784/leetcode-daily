class RotateArray {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;

        int[] result=new int[n];
        for(int i=0;i<n;i++){
            result[(i+k)%n]=nums[i];

        }
        System.arraycopy(result,0,nums,0,n);

    /*  for(int i=0;i<n;i++){
        nums[i]=result[i];
      }*/
    }
}