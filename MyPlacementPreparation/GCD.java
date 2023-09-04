import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int l=a<b?a:b;
        int gcd=0;
        for(int i=l;i>=1;i--){
            if(a%i==0 && b%i==0){
                gcd=i;
                break;
            }
        }
        
        System.out.println(gcd);
    }
    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
}
