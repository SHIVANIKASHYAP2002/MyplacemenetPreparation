/*C program to check Armstrong number.
14. C program to display Armstrong number between two intervals.*/
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(armstrong(n));
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        for(int i=n1;i<=n2;i++){
            if(armstrong(i)){
                System.out.print(i+"  ");
            }
        }
        
    }
    static boolean armstrong(int n){
        int org=n;
        int n1=n;
       int sum=0;
        int c=0;
        while(n!=0){
            c+=1;
            n=n/10;
        }
        while(n1!=0){
            int rem=n1%10;
            int num=(int)Math.pow(rem, c);
            sum+=num;
            n1=n1/10;
        }
        if(sum==org){
           return true;
        }
       return false;
    }
}
