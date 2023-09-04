
/*3. C program to display the sequence AMM, COO, EQQ,..........*/

import java.util.Scanner;

public class week2_series1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char c='A',c1='B';
        for(int i=1;i<=n;i++){
            System.out.print(c+""+c1+""+c1+"\t");
            c+=2;
            c1+=2;
        }

       /*  C program to display the sequence ABA, BCB, CDC, DED, ...................*/
        for(int i=1;i<=n;i++){
            System.out.print(c+""+c1+""+c+"\t");
            c+=1;
            c1+=1;

        }

        /*10. Read a number from STDIN, then display the sequence given below:
        Input: 52934
        Output: A5, B2, C9, D3, E4 */
        String str=sc.next();
        char c3='A';
        for(int i=0;i<str.length();i++){
            System.out.print(c3+""+str.charAt(i)+"  ");
            c3+=1;
        }

    }
}
