class SmallestSubstring{
    public static void main(String ar[]){
        String str = "welcometojava";
        int k = 3;
        String smallest;
        String largest;
        System.out.println(str.substring(1,k).compareTo(str));
        System.out.println(str.substring(10,k+10));
        System.out.println(str.substring(4,0));
    }
}