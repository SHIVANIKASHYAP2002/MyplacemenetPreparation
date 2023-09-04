// 3                                    9 10 11 12
// 4 5                                  6 7 8
// 6 7 8                                4 5
// 9 10 11 12                           3

import java.util.Scanner;

public class series {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int k=3;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(k+" ");
            k++;
        }
        System.out.println();
    }
     
     for(int i=1;i<=n;i++){
        if(i==2){
            k=6;
        }
        else if(i==3){
            k=4;
        }
        else if(i==1){
            k=9;
        }
        else{
            k=3;
        }
        for(int j=1;j<=n-i+1;j++){
            System.out.print(k+" ");
            k++;
        }
        System.out.println();
    }
}
}
