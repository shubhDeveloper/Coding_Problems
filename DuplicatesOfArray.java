class DuplicatesOfArray{
    public static int checkDuplicate(int arr[]){
        int duplicate=0;
        java.util.Arrays.sort(arr);
        int i=1;
        while(i<arr.length){
            if(arr[i] == arr[i-1]){
                duplicate = arr[i];
            }
            i++;
        }  
        return duplicate;
    }
    
    public static void main(String ar[]){
           int[] arr = {1,2,3,4,1,5};
           System.out.println(checkDuplicate(arr));
    }
}