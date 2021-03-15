import java.util.Arrays;
class Anagram{
    public static void main(String args[]){
        String str = "shubham";
        String str1= "mahbuhs";
        
        char[] ch = new char[str.length()];
        char[] ch1 = new char[str1.length()];
        for(int i=0;i<str.length();i++){
            ch[i] = str.charAt(i);
            ch1[i] = str1.charAt(i);
            System.out.println(ch[i]+" "+ch1[i]);
        }
        Arrays.sort(ch);
        Arrays.sort(ch1);
        System.out.println(ch);
        System.out.println(ch1);
        str = String.valueOf(ch);
        str1 = String.valueOf(ch1);

        System.out.println();
        if(str.equals(str1)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        // System.out.println(str.compareTo("a"));
    }
}