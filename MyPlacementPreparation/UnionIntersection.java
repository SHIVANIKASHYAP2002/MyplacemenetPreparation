import java.util.Arrays;
import java.util.Scanner;

public class UnionIntersection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arr=new int[n];
        int[] arr2=new int[m];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        Arrays.sort(arr2);
        union(arr,arr2,n-1,m-1);
        intersection(arr,arr2,n-1,m-1);
    }
    static void union(int[]arr,int[]arr2,int n,int m){
        int i=0,j=0;
        System.out.println("Union******");
        while(i<=n && j<=m){
            if(arr[i]<arr2[j]){
                System.out.print(arr[i++]+" ");
            }
            else if(arr2[j]<arr[i]){
                System.out.print(arr2[j++]+" ");
            }
            else{
                System.out.print(arr[i]+" ");
                i++;j++;
            }
        }
        while(i<=n){
            System.out.print(arr[i++]+" ");
        }
        while(j<=m){
            System.out.print(arr2[j++]+" ");
        }
    }

    static void intersection(int[]arr,int[]arr2,int n,int m){
        int i=0,j=0;
        System.out.println("Intersection:****");
        while(i<=n && j<=m){
            if(arr[i]<arr2[j]){
                i++;
            }
            else if(arr2[j]<arr[i]){
               j++;
            }
            else{
                System.out.print(arr[i]+" ");
                i++;j++;
            }
        }
    }
}
