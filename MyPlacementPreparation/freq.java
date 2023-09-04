import java.util.Scanner;

public class freq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            int count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)==c){
                    count++;
                }
            }
            System.out.println("freq of"+c+" ="+count);
        }
    }
}
