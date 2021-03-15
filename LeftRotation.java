class LeftRotation{
    public static void main(String ar[]){
         int arr[] = {1,2,3,4,5,6,7,8,9};
         int k=7,l=k,temp=0,count=0;
         if(k<arr.length){
              while(k>0){
              temp = arr[k];
              arr[k] = arr[k-1];
              arr[k-1] = temp;
              k--;    
              if(k==count){
                  count++;
                  k=l+1;
                  l=k;
                  if(k>arr.length-1){  
                      System.out.println("break running "+k);
                      break;
                  }
              }
         }
         for(int ab:arr){
             System.out.print(ab+" ");
         }
         }
         else{
             System.out.println("Please enter correct value ????");
         }
         
    }
}
        //  while(i<arr.length){
        //      temp=arr[k];
        //      arr[k]=arr[i];
        //      arr[i]=temp;
        //      System.out.println("previous k is :"+k);
        //      System.out.println("previous i is : "+i);
        //      k++;
        //      i++;
        //     //  System.out.println("next k is :"+k);
        //     //  System.out.println("next i is :"+i);
        //     //  System.out.println("l is = "+l);

        //      if(k==arr.length){
        //          k=l;
        //      }
             
        //  }   
