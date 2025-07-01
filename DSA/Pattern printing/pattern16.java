import java.util.Scanner;

public class pattern16 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        int num = scan.nextInt();
        for (int i=0 ; i<2*num-1 ; i++) {
            System.out.print("*"+" ");
        }
        System.out.println();
        for(int i=1 ; i<=num-1 ; i++){
            for(int j=1 ; j<=num-i ; j++){
                System.out.print("*"+" ");
            }
            for(int k=1 ; k<=2*i-1 ; k++){
                System.out.print(" "+" ");
            }
            for(int l=1 ; l<=num-i ; l++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
