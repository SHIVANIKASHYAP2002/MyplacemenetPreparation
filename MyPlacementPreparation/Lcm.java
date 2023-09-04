import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int m= a>b?a:b;
        int lcm=0;
        for(int i=m;i<=a*b;i+=m){
            if(i%a==0 && i%b==0){
                lcm=i;
                break;
            }
        }
        System.out.println(lcm);
    }
}
