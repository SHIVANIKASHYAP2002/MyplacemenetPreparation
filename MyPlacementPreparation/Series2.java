// 1 2 3 4              13 14 15 16         
// 5 6 7 8              9 10 11 12         
// 9 10 11 12           5 6 7 8            
// 13 14 15 16          1 2 3 4

import java.util.Scanner;

public class Series2 {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int k=1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            System.out.print(k+" ");
            k++;
        }
        System.out.println();
    }
    k=13;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print(k + " ");
            k++;
        }
        System.out.println();
        k-= 8;
    }
}
}
