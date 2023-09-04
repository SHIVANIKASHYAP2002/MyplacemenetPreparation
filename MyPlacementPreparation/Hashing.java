import java.util.Scanner;

public class Hashing{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     int [] arr=new int[n];
    //     for(int i=0;i<n;i++){
    //         arr[i]=sc.nextInt();
    //     }
    //    int f= max(arr,n);
    //    int []freq=new int[f+1];
    //    for(int i=0;i<n;i++){
    //     freq[arr[i]]+=1;
    //    }
    //    int q=sc.nextInt();
    //    while(q!=0){
    //     int number=sc.nextInt();
    //     System.out.println(number+" occured = "+freq[number]);
    //     q--;
    //    }
    // }
    // static int max(int[]arr,int n){
    //     int max=arr[0];
    //     for(int i=1;i<n;i++){
    //         if(arr[i]>=max){
    //             max=arr[i];
    //         }
    //     }
    //     return max;
    String str=sc.next();
   
    int[] freq=new int[256];// new int[26]
    for(int i=0;i<str.length();i++){
        freq[str.charAt(i)]+=1;//  freq[str.charAt(i)-'a']
    }
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        System.out.print(ch+""+freq[ch]);
    }
    
    }

}