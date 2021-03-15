class ReverseArray{
    public static void main(String ar[]){
        int[] arr = {1,2,3,4,5,6};
        int count=0;
        int[] ars = new int[arr.length];
        for(int i = arr.length-1;i>=0;i--){
             ars[count] = arr[i];
             count++; 
        }
        for(int j=0;j<arr.length;j++){
            System.out.print(ars[j]);
        }
    }
}