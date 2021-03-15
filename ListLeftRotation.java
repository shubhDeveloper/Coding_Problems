import java.util.List;
import java.util.ArrayList;
// import java.util.ArrayList;
class ListLeftRotation{

    public static List<Integer> rotateList(List<Integer> arr , int d){
        int l=d,temp=0,count=0;
        
        while(d>0){
            // temp = arr.get(d-1);
            // arr.get(d-1) = arr.get(d);
            // arr.get(d) = temp;
             java.util.Collections.swap(arr, d, d-1);

            d--;
            if(d==count){
                count++;
                d=l+1;
                l=d;
                if(d>arr.size()-1){
                    break;
                }
            }
        }


        return arr;
    }

    public static void main(String ar[]){
         List<Integer> arr = new ArrayList<Integer>();
         arr.add(1);
         arr.add(2);
         arr.add(3);
         arr.add(4);
         arr.add(5);
         int d=2;
         System.out.println(rotateList(arr,d));
    }
}