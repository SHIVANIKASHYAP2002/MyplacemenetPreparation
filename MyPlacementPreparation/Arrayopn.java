import java.util.Scanner;

public class Arrayopn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        int[]arr=new int[100];
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ele=sc.nextInt();
      
       //insertbeg(arr,n,ele);

        //insertend(arr,n,ele); 
        int i=sc.nextInt();
        insertidx(arr,n,i,ele);
        print(arr,n+1);
        System.out.println("element found at idx = "+binarySearch(arr, n, ele));
        //deleteidx(arr,n,i);
       // deletebeg(arr, n);
    //    deleteend(arr, n);
    //     System.out.println("after deletion\n");
    //      print(arr,n);
    }
    static void print(int[]arr,int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
    }
    static void insertend(int arr[],int n,int ele){
        arr[n]=ele;
    }
    static void insertbeg(int [] arr,int n,int ele ){
       
        for(int i=n;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=ele;
    }
    static void insertidx(int [] arr,int n,int idx,int ele){
        
        n=n+1;
        for(int i=n;i>idx;i--){
            arr[i]=arr[i-1];
        }
        arr[idx]=ele;
    }
    static void deleteidx(int[] arr,int n, int idx){
        for(int i=idx;i<n;i++){
            arr[i]=arr[i+1];
        }
        
    }
    static void deletebeg(int [] arr,int n){
        for(int i=0;i<n;i++){
            arr[i]=arr[i+1];
        }
    }
    static void deleteend(int[] arr,int n){
        arr[n]=0;
    }
    static int linearSearch(int[] arr,int n,int ele){
        for(int i=0;i<=n;i++){
            if(arr[i]==ele){
                return i;
            }
        }
        return -1;
    }
    static int binarySearch(int[] arr,int n,int ele){
        int l=0,h=n;
        while(l<h){
            int mid=(l+h)/2;
            if(arr[mid]==ele){
                return mid;
            }
            else if(arr[mid]<ele){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return -1;
    }
}
