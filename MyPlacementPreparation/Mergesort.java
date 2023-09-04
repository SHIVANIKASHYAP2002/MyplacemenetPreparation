import java.util.Scanner;

public class Mergesort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        mergesort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"   ");
        }
    }
    static void mergesort(int[]arr,int low,int high){
        if(low>=high){
            return;
        }
        int mid=(low+high)/2;
        mergesort(arr,0,mid);
        mergesort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    static void merge(int[]arr,int low,int mid,int high){
        int i=low,j=mid+1;
        int k=low;
        int[]b=new int[high+2];
        while(i<=mid && j<=high){
            if(arr[i]<arr[j]){
                b[k]=arr[i];
                i++;k++;
            }
            else{
                b[k]=arr[j];
                j++;k++;
            }
        }
        if(i<=mid){
            while(i<=mid){
                b[k]=arr[i];
                i++;
                k++;

            }
        }
        if(j<=high){
            while(j<=high){
                b[k]=arr[j];
                j++;
                k++;
                
            }
        }
        for(int p=low;p<=high;p++){
            arr[p]=b[p];
        }

       
    }
}
