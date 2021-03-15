class NegativeEleOneSide{
    public static void main(String ar[]){
         int arr[] = {-1,-6,-8,-1,5,3,6,-1};
         int j=0,temp;
         for(int i=0;i<arr.length;i++){
             if(arr[i]<0){
                   if(i != j){
                       temp = arr[j];
                       arr[j] = arr[i];
                       arr[i] = temp;
                   }
                   j++;
             }
         }
         for(int a:arr){
             System.out.println(a);
         }
    }
}