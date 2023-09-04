import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int k=sc.nextInt();
        int l=0,h=n-1;
        int f=0;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==k){
                System.out.println(mid);
                f=1;
                break;
            }
            else if(arr[mid]>k){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        if(f==0){
            System.out.println(-1);
        }
        l=0;
        h=n-1;
        System.out.println(binarySearch(arr, l, h, k));
    }
    static int binarySearch(int arr[],int l,int h,int k){
        if(l<=h){
        int mid=(l+h)/2;
            if(arr[mid]==k){
                return mid;
            }
            else if(arr[mid]>k){
                return binarySearch(arr, l, mid-1, k);
            }
            else{
               return binarySearch(arr, mid+1, h, k);
            }
        }
        return -1;
    }
}
