class MaximumJump{
    public static void main(String ar[]){
        int[] arr = {2,4,7,11,5,7,3,5};
        int count=0,len = arr.length,sum=0,i=sum;
           while(sum<len-1){
               if(arr[sum]==0){
                   System.out.println("0 is : "+arr[i]);
                   break;
               }
               if(sum <= arr.length){
                   sum = sum+arr[sum];
                   count++;
               }
           }     
        System.out.println("count is = "+count);
    }
}