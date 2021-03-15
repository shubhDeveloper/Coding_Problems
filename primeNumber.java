import java.util.Scanner;
class primeNumber{
    public static void main(String ar[]){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int a=0;
        for(int i=number;i>=1;i--){
            if(number%i==0){
                a++;
            }
        }
        if(a==2){
            System.out.println("prime number");
        }
        else{
            System.out.println("not prime");
        }
    }
}