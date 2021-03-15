class LargestSubArray{
    public static void main(String ar[]){
        int arr[] = {-1,-2,-3,-4};
        int max = -55,sum = 0,min = 0;
        for(int i=0;i<arr.length;i++){
            sum = arr[i] + sum;
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum=0;
            }
        }
           System.out.println(max);
        
    }
}