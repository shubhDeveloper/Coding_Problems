class MinMaxEle{
    //Function
    public static void minMax(int[] arr){
        int min=0,max=0,c=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]>=arr[j]){
                   c=arr[i];
                   arr[i]=arr[j];
                   arr[j]=c;
                }
            }
        }
        max=arr[0];
        min=arr[arr.length-1];
        System.out.println("Maximum is : "+max);
        System.out.println("Minimum is : "+min);
    }
    public static void main(String ar[]){   
        int[] arr = {2,3,4,5,6,7,8};
        minMax(arr);
    }
}