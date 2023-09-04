import java.util.Scanner;

public class gcdLcmprac{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int g=a<b?a:b;
        int gcd=0;
        for(int i=g;i>=1;i--){
            if(a%i==0 && b%i==0){
                gcd=i;
                break;
            }
        }
        System.out.println(gcd);
        int l=a<b?b:a;
        int lcm=0;
        for(int i=l;i<=a*b;i=i+l){
            if(i%a==0 && i%b==0){
                lcm=i;
                break;
            }
        }
        System.out.println(lcm);
    }
}