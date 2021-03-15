class SortArray2{
    public static void main(String ar[]){
        int[] arr = {1,2,3,1,4,2,5};
        int i=0,j=0,temp=0;
         while(i<arr.length){
              if(arr[i] > arr[j])
              {
                  temp = arr[j];
                  arr[j] = arr[i];
                  arr[i] = temp;
              }   
              if(i==arr.length-1 && j<arr.length-1){
                  i=-1;
                  j++;
              }
              i++;
         }
         for(int a : arr){
             System.out.println(a);
         }
    }
}