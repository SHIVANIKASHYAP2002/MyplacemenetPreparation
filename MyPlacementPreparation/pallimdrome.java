/*5. C program to count number of digits in an integer.
6. C program to reverse a number.
7. C program to check whether a number is palindrome or not.*/

import java.util.Scanner;

public class pallimdrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=n;
        //1.number of digits in number;
        int c=0;
        while(n!=0){
            c+=1;
            n=n/10;
        }
        System.out.println("total number of digits=  "+c);
        //2.reverse number
        int sum=0;
        int n2=n1;
        while(n1!=0){
            int rem=n1%10;
            sum=sum*10+rem;
            n1=n1/10;
        }
        System.out.println("reverse of number is=   "+sum);
        //3.pallimdrome
        if(sum==n2){
            System.out.println("pallimdrome");
        }
        else{
            System.out.println("Not pallimdrome");
        }


    }
}
