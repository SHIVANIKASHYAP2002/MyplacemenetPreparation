import java.util.Scanner;
public class Array{
    public static void main(String[] args) {
         int n;
        Scanner sc=new Scanner(System.in);
        n =sc.nextInt();
        int[]arr=new int[10];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        display(arr,n);
        int index=sc.nextInt();
        int element=sc.nextInt();
        insertion(arr,index,element,n);
        n++;
        display(arr,n);
        index=sc.nextInt();
        deletion(arr,index,n);
        n--;
        display(arr, n);
    }
    public static void insertion(int [] arr,int index,int element,int n){
        for(int i=n-1;i>=index;i--){
            arr[i+1]=arr[i];
        }
        arr[index]=element;
    }
    public static void display(int [] arr,int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
    public static void deletion(int[] arr,int index,int n){
        for(int i=index;i<n-1;i++){
            arr[i]=arr[i+1];
        }
    }
}