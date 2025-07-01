import java.util.Scanner;

public class pattern19 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        int num = scan.nextInt();
        
        for(int i=1 ; i<=2*num-1 ; i++){
            for(int j=1 ; j<=2*num-1 ; j++){
                int a=i , b=j;
                if(i>num) a=2*num-i;
                if(j>num) a=2*num-j;
                System.out.print(num+1-Math.min(a,b)+" ");
            }
            System.out.println();
        }
    }
}
