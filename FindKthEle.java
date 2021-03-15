class FindKthEle{
    public static int findKth(int arr[],int k){
        int local=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    local=arr[i];
                    arr[i]=arr[j];
                    arr[j]=local;   
                }
            }
            local = arr[k-1];
        }
         return local;
    }
    public static void main(String ar[]){
         int[] arr = {4,2,3,5,6,7,1,4};   //{1,2,3,4,4,5,6,7}
         int k=6;                         //{1,2,3,4,5,6,7,8}
         System.out.println(findKth(arr,k));
    }
}