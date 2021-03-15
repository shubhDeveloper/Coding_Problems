class RotateArray{
    public static void main(String ar[]){
        int arr[] = {1,2,3,4,5,6,7};
        int temp=0;
        for(int i=0;i<arr.length;i++){
            temp = arr[arr.length-1];
            arr[arr.length-1] = arr[i];
            arr[i] = temp;
        }
        for(int a:arr){
            System.out.println(a);
        }
    }
}