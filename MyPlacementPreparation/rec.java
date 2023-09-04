/*18. C program to find the sum of natural numbers using recursion.
19. C program to find factorial of a number using recursion.
20. C program to find G.C.D using recursion.*/
import java.util.Scanner;

public class rec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        System.out.println(sum(n));
        System.out.println(fact(n));
        System.out.println(gcd(n,n1));
    }
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return (n+sum(n-1));
    }
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
       return n*(fact(n-1));
    }
    public static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);

    }
}
