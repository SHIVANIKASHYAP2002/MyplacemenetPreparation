/*8. C program to check whether a number is prime or not.
9. C program to find the sum of first n prime numbers.
12. C program to display prime numbers between two intervals.
17. C program to check whether a number can be expressed as sum of two prime numbers.*/
import java.util.Scanner;

public class prime{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // System.out.println(isprime(n));
        // int c=0,i=1,sum=0;
        // while(c!=n){
        //     if(isprime(i)){
        //         sum+=i;
        //         c++;
        //     }
        //     i++;
        // }
        // System.out.println(sum);
        // int n1=sc.nextInt();
        // int n2=sc.nextInt();
        // for(int j=n1;j<=n2;j++){
        //     if(isprime(j)){
        //         System.out.print(j+"   ");
        //     }
        // }
        //*********17. C program to check whether a number can be expressed as sum of two prime numbers.*********** */
        for(int i=2;i<=n/2;i++){
            if(isprime(i)){
                if(isprime(n-i)){
                    System.out.println(i+" "+(n-i)+" "+"yes can be expressed");
                }
            }
        }
        System.out.println(n+"can not be expressed as sum of prime factors");

    }
    static boolean isprime(int n){
        if(n<2){
            return false;
        }
        else if(n==2){
            return true;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
